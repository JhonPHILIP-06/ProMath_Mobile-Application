package com.main.pmt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ConvertType extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_type);

        Button button1 = findViewById(R.id.button5);
        button1.setOnClickListener(v -> Type());

        Button button2 = findViewById(R.id.button6);
        button2.setOnClickListener(v -> Cam());

        Button button3 = findViewById(R.id.button7);
        button3.setOnClickListener(v -> Browse());
    }

    public void Type() {
        Intent intent1 = new Intent(this, Type.class);
        startActivity(intent1);
    }

    public void Cam() {
        Intent intent2 = new Intent(this, Cam.class);
        startActivity(intent2);
    }

    public void Browse() {
        Intent intent3 = new Intent(this, Browse.class);
        startActivity(intent3);
    }
}