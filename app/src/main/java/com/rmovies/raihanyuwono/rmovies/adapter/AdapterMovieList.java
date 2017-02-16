package com.rmovies.raihanyuwono.rmovies.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rmovies.raihanyuwono.rmovies.R;

/**
 * Created by raihanyuwono on 2/16/17.
 */

public class AdapterMovieList extends RecyclerView.Adapter<HolderMovieList>{
    private String title[] = {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    };

    @Override
    public HolderMovieList onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_card, parent, false);
        return new HolderMovieList(v);
    }

    @Override
    public void onBindViewHolder(HolderMovieList holder, int position) {
        holder.bind(title[position]);
    }

    @Override
    public int getItemCount() {
        return title.length;
    }
}
