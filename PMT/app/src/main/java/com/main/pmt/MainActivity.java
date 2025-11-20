package com.main.pmt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> Features());

        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(v -> Info());
    }

    public void Features() {
        Intent intent = new Intent(this, Features.class);
        startActivity(intent);
    }

    public void Info() {
        Intent intent1 = new Intent(MainActivity.this, Info.class);
        startActivity(intent1);
}}