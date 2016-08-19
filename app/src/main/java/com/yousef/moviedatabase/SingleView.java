package com.yousef.moviedatabase;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SingleView extends AppCompatActivity {

    TextView poster_path;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(findViewById(R.id.single_view));
        Intent intent = getIntent();
        String poster = intent.getStringExtra("EXTRA_MASSAGE");
        poster_path.findViewById(R.id.posterPath_single);
        poster_path.setText(poster);

    }




}
