package com.app.acu.myfragmentsample;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_layout);

        TitlesFragment fragment = new TitlesFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame, fragment)
                .commit();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        setContentView(R.layout.fragment_layout);
        TitlesFragment fragment = new TitlesFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame, fragment)
                .commit();
    }

}