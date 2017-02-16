package com.rmovies.raihanyuwono.rmovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.rmovies.raihanyuwono.rmovies.adapter.AdapterMovieList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView movieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieList = (RecyclerView) findViewById(R.id.movie_list);
        movieList.setLayoutManager(new GridLayoutManager(this, 2));

        loadData();
    }

    private void loadData(){
        movieList.setAdapter(new AdapterMovieList());
    }
}
