package com.example.voteinformed.ui.politician;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.voteinformed.R;
import com.example.voteinformed.data.entity.Politician;
import com.example.voteinformed.ui.search.PoliticianSearchAdapter;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class PoliticianSearchDialog extends DialogFragment {

    public interface OnPoliticianSelectedListener {
        void onPoliticianSelected(Politician politician);
    }

    private OnPoliticianSelectedListener callback;
    private TextInputEditText inputSearch;
    private PoliticianSearchViewModel viewModel;
    private PoliticianSearchAdapter adapter;

    private List<Politician> fullList = new ArrayList<>();

    private boolean showAllOnStart = false;

    public static PoliticianSearchDialog newInstance(boolean showAllOnStart) {
        PoliticianSearchDialog dialog = new PoliticianSearchDialog();
        Bundle args = new Bundle();
        args.putBoolean("show_all", showAllOnStart);
        dialog.setArguments(args);
        return dialog;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnPoliticianSelectedListener) {
            callback = (OnPoliticianSelectedListener) context;
        }
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder =
                new AlertDialog.Builder(requireContext(), R.style.AppTheme_Dialog);

        builder.setView(R.layout.dialog_politician_search);
        AlertDialog dialog = builder.create();
        dialog.setOnShowListener(d -> setupDialogViews(dialog));
        return dialog;
    }

    private void setupDialogViews(AlertDialog dialog) {
        inputSearch = dialog.findViewById(R.id.inputSearchDialog);
        RecyclerView recycler = dialog.findViewById(R.id.recyclerSearchResultsDialog);

        recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new PoliticianSearchAdapter(getContext(), this::onPoliticianClicked);
        recycler.setAdapter(adapter);

        if (getArguments() != null) {
            showAllOnStart = getArguments().getBoolean("show_all", false);
        }

        viewModel = new ViewModelProvider(this)
                .get(PoliticianSearchViewModel.class);

        viewModel.getAllPoliticians().observe(this, list -> {
            fullList = list;

            if (showAllOnStart) {
                adapter.submitList(fullList);
            } else {
                adapter.submitList(new ArrayList<>());
            }
        });

        inputSearch.setOnEditorActionListener((v, actionId, event) -> {
            if (actionId == EditorInfo.IME_ACTION_SEARCH
                    || actionId == EditorInfo.IME_ACTION_DONE) {
                performSearch();
                return true;
            }
            return false;
        });
    }

    private void performSearch() {
        String query = inputSearch.getText() == null ? "" :
                inputSearch.getText().toString().trim().toLowerCase();

        if (query.isEmpty()) {
            if (showAllOnStart) {
                adapter.submitList(fullList);
            } else {
                adapter.submitList(new ArrayList<>());
            }
            return;
        }

        List<Politician> filtered = new ArrayList<>();

        for (Politician p : fullList) {
            if (p.getPolitician_name().toLowerCase().contains(query)) {
                filtered.add(p);
            }
        }

        adapter.submitList(filtered);
    }

    private void onPoliticianClicked(Politician p) {
        if (callback != null) {
            callback.onPoliticianSelected(p);
        }
        dismiss();
    }
}
