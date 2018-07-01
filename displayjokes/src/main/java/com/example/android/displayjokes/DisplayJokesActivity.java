package com.example.android.displayjokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokesActivity extends AppCompatActivity {
    public static String JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_jokes);
        TextView mJokeTV = findViewById(R.id.joke_tv);

        Intent intent = getIntent();
        if (intent.hasExtra(JOKE)) {
            String joke = intent.getStringExtra(JOKE);
            mJokeTV.setText(joke);
        }
    }
}
