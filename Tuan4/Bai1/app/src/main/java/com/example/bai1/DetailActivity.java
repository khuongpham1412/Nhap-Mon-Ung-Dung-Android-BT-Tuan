package com.example.bai1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private TextView txtName, txtEmail, txtProject;
    private Button finish;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        txtName = findViewById(R.id.txtName);
        txtEmail = findViewById(R.id.txtEmail);
        txtProject = findViewById(R.id.txtProject);
        finish = findViewById(R.id.btnFinish);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("nameKey");
        String email = bundle.getString("emailKey");
        String project = bundle.getString("projectKey");

        txtName.setText(name);
        txtEmail.setText(email);
        txtProject.setText(project);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
