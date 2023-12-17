package com.example.bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtName, txtEmail, txtProject;
    private Button viewContactInfo;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = findViewById(R.id.txtName);
        txtEmail = findViewById(R.id.txtEmail);
        txtProject = findViewById(R.id.txtProject);
        viewContactInfo = findViewById(R.id.btnViewContactInfo);

        viewContactInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("nameKey", txtName.getText().toString());
                bundle.putString("emailKey", txtEmail.getText().toString());
                bundle.putString("projectKey", txtProject.getText().toString());
                intent.putExtras(bundle);

                MainActivity.this.startActivity(intent);
            }
        });
    }
}