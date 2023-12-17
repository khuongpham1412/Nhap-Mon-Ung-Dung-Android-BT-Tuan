package com.example.bai3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private Button btnCurrentTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCurrentTime = findViewById(R.id.btnCurrentTime);
        AlertDialog dialog = new AlertDialog.Builder(this).create();

        btnCurrentTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Date date = new Date();
                String mess = "Current Time is: " + date.toLocaleString();
                dialog.setMessage(mess);
                dialog.show();
            }
        });
    }
}