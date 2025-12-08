package com.example.voteinformed.ui.politician;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.voteinformed.data.database.VoteInformed_Database;
import com.example.voteinformed.data.entity.Politician;

import java.util.List;

public class PoliticianSearchViewModel extends AndroidViewModel {

    private final LiveData<List<Politician>> allPoliticians;

    public PoliticianSearchViewModel(@NonNull Application application) {
        super(application);

        VoteInformed_Database db =
                VoteInformed_Database.getInstance(application);
        allPoliticians = db.politicianDao().getAllPoliticians();
    }

    public LiveData<List<Politician>> getAllPoliticians() {
        return allPoliticians;
    }
}