package com.example.voteinformed.ui.politician;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.voteinformed.R;
import com.example.voteinformed.data.entity.Politician;

import java.util.ArrayList;
import java.util.List;

public class FeaturedPoliticianAdapter
        extends RecyclerView.Adapter<FeaturedPoliticianAdapter.ViewHolder> {

    private List<Politician> politicians = new ArrayList<>();

    public void setPoliticians(List<Politician> list) {
        politicians = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_politician_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Politician p = politicians.get(position);

        holder.name.setText(p.getPolitician_name());
        holder.party.setText(p.getPolitician_party());
        holder.bio.setText(p.getPolitician_background());

        String imageUrl = p.getPolitician_image_url();

        if (imageUrl == null || imageUrl.trim().isEmpty()
                || imageUrl.contains("Unavailable")
                || imageUrl.contains("wikipedia.org/wiki")) {

            holder.image.setImageResource(R.drawable.user);

        } else {

            Glide.with(holder.itemView.getContext())
                    .load(imageUrl)
                    .placeholder(R.drawable.user)
                    .error(R.drawable.user)
                    .circleCrop()
                    .into(holder.image);
        }

        holder.itemView.setOnClickListener(v -> {
            Context context = v.getContext();

            Intent intent = new Intent(context, PoliticianProfileActivity.class);
            intent.putExtra("politician_id", p.getPolitician_id());

            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return politicians.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView name, party, bio;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.politician_image);
            name = itemView.findViewById(R.id.politician_name);
            party = itemView.findViewById(R.id.politician_position);
            bio = itemView.findViewById(R.id.politician_bio);
        }
    }
}
