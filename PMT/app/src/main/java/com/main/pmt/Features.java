package com.main.pmt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Features extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_features);

        Button button1 = findViewById(R.id.button2);
        button1.setOnClickListener(v -> ConvertPro());

        Button button2 = findViewById(R.id.button3);
        button2.setOnClickListener(v -> Settings());

        Button button3 = findViewById(R.id.button4);
        button3.setOnClickListener(v -> History());
    }

    public void ConvertPro() {
        Intent intent1 = new Intent(this, ConvertType.class);
        startActivity(intent1);
    }

    public void Settings() {
        Intent intent2 = new Intent(this, Settings.class);
        startActivity(intent2);
    }

    public void History() {
        Intent intent3 = new Intent(this, History.class);
        startActivity(intent3);
    }
}