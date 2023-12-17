package com.example.bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnCick;
    private EditText editText;
    private CheckBox checkColor;
    private CheckBox checkBold;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        MappingViewById();
        btnCick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkColor.isChecked()) {
                    editText.setTextColor(Color.BLUE);
                } else {
                    editText.setTextColor(Color.WHITE);
                }
                if (checkBold.isChecked()) {
                    editText.setTypeface(Typeface.DEFAULT_BOLD);
                } else {
                    editText.setTypeface(Typeface.DEFAULT);
                }
                editText.setText("You've clicked " + ++count + " times");

            }
        });
    }

    private void MappingViewById() {
        checkColor = findViewById(R.id.check_color);
        checkBold = findViewById(R.id.check_bold);
        btnCick = findViewById(R.id.btnClick);
        editText = findViewById(R.id.editText);
        editText.setSingleLine();
        editText.setInputType(InputType.TYPE_NULL);
    }
}