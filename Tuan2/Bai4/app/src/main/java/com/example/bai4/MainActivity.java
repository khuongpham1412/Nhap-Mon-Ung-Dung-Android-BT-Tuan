package com.example.bai4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        AlertDialog dialog = new AlertDialog.Builder(this).create();

        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if(keyEvent.getAction() == keyEvent.ACTION_DOWN && i == keyEvent.KEYCODE_DPAD_CENTER){
                    String mess = editText.getText().toString();
                    dialog.setMessage(mess);
                    dialog.show();
                    return true;
                }
                return false;
            }
        });
    }
}