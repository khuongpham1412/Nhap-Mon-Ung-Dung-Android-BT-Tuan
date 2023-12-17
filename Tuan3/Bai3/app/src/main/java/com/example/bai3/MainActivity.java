package com.example.bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioButton radioRed;
    private RadioButton radioGreen;
    private RadioButton radioBlue;
    private RadioButton radioGray;
    private TextView containerBackground;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioRed = findViewById(R.id.radioRed);
        radioGreen = findViewById(R.id.radioGreen);
        radioBlue = findViewById(R.id.radioBlue);
        radioGray = findViewById(R.id.radioGray);
        containerBackground = findViewById(R.id.containerBackground);

        radioRed.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                containerBackground.setBackgroundColor(Color.RED);
            }
        });
        radioGreen.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                containerBackground.setBackgroundColor(Color.GREEN);
            }
        });
        radioBlue.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                containerBackground.setBackgroundColor(Color.BLUE);
            }
        });
        radioGray.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                containerBackground.setBackgroundColor(Color.GRAY);
            }
        });
    }
}