package com.main.thesis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Features extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_features);

        Button button1 = findViewById(R.id.button);
        button1.setOnClickListener(v -> Type());
    }

    public void Type() {
        Intent intent1 = new Intent(this, Type.class);
        startActivity(intent1);
    }

}