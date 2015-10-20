package com.pepihome.popmovies;

import java.util.ArrayList;
import java.util.Arrays;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayAdapter<String> mMovieAdapter;

    public MainActivityFragment() {
    }

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ArrayList<String> movieList = new ArrayList<>();
        String[] dummyTitles = { "Minions", "Superman", "IronMan", "SpiderMan", "Tomb Raider", "Serendipity",
                "Aeon Flux" };
        movieList.addAll(Arrays.asList(dummyTitles));

        mMovieAdapter = new ArrayAdapter<>(getContext(), R.layout.list_item_movie, R.id.list_item_textview_movie,
                movieList);

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.list_view_movies);
        listView.setAdapter(mMovieAdapter);

        return rootView;

    }
}
