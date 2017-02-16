package com.rmovies.raihanyuwono.rmovies.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.rmovies.raihanyuwono.rmovies.R;

/**
 * Created by raihanyuwono on 2/16/17.
 */

public class HolderMovieList extends RecyclerView.ViewHolder {

    private TextView title;
    private ImageView image;

    public HolderMovieList(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.card_title);
        image = (ImageView) itemView.findViewById(R.id.card_image);
    }

    public void bind(String data){
        title.setText(data);
        image.setImageResource(R.mipmap.ic_launcher);
    }
}
