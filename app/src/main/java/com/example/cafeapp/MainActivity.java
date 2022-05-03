package com.example.cafeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchActivities();
    }

    public void switchActivities() {
        Intent switchActivityIntent = new Intent(this, DefaultActivity.class);
        startActivity(switchActivityIntent);
    }
}