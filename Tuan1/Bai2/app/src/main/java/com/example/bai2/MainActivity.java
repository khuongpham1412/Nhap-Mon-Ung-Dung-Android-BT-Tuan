package com.example.bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtName, txtComment;
    private EditText editText;
    private ImageView imageView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.txtName);
        txtComment = findViewById(R.id.txtComment);
        editText = findViewById(R.id.editText);
        imageView = findViewById(R.id.image);
        String imageName = String.valueOf(imageView.getTag());

        txtName.setText(imageName);
    }
}