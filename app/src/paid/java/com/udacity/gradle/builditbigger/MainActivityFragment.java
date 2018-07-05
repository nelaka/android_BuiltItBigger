package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.displayjokes.DisplayJokesActivity;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        return root;
    }

    public void tellJoke(View view) {
        new EndpointsAsyncTask(new EndpointsAsyncTask.TaskCompleteListener() {
            @Override
            public void onTaskComplete(String result) {
                Intent intent = new Intent(getActivity(), DisplayJokesActivity.class);
                intent.putExtra(DisplayJokesActivity.JOKE, result);
                startActivity(intent);

                // Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        }).execute();
    }

}
