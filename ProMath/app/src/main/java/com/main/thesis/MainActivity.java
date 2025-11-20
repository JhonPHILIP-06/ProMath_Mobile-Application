package com.main.thesis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton button = findViewById(R.id.imageButton);
        button.setOnClickListener(v -> Features());

        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(v -> Use());

        EditText editText = findViewById(R.id.editTextTextMultiLine);
        editText.setKeyListener(null);
    }

    public void Features() {
        Intent intent = new Intent(this, Features.class);
        startActivity(intent);
    }

    public void Use() {
        Intent intent1 = new Intent(MainActivity.this, Use.class);
        startActivity(intent1);
    }}