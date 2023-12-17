package com.example.bai4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView txtResult;
    private String res = "";
    private float result = 0f;
    private TextView btn1;
    private TextView btn2;
    private TextView btn3;
    private TextView btn4;
    private TextView btn5;
    private TextView btn6;
    private TextView btn7;
    private TextView btn8;
    private TextView btn9;
    private TextView btn0;
    private TextView btn_cong;
    private TextView btn_tru;
    private TextView btn_nhan;
    private TextView btn_chia;
    private TextView btn_result;
    private TextView btn_reset;
    private String operation;
    private Integer a = 0, b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btn_cong = findViewById(R.id.btn_cong);
        btn_tru = findViewById(R.id.btn_tru);
        btn_nhan = findViewById(R.id.btn_nhan);
        btn_chia = findViewById(R.id.btn_chia);
        btn_reset = findViewById(R.id.btn_reset);
        btn_result = findViewById(R.id.btn_result);
        txtResult = findViewById(R.id.txtResult);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValue("0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValue("1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValue("2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValue("3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValue("4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValue("5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValue("6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValue("7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValue("8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValue("9");
            }
        });
        btn_cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = "plus";
                res += " + ";
                txtResult.setText(res);
            }
        });
        btn_tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = "sub";
                res += " - ";
                txtResult.setText(res);
            }
        });
        btn_nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = "mult";
                res += " * ";
                txtResult.setText(res);
            }
        });
        btn_chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = "divi";
                res += " / ";
                txtResult.setText(res);
            }
        });
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetValue();
            }
        });
        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operation == "plus"){
                    result = a + b;
                }
                if(operation == "sub"){
                    result = a - b;
                }
                if(operation == "mult"){
                    result = a * b;
                }
                if(operation == "divi"){
                    result = (float) (a / (b*1.0));
                }
                txtResult.setText(String.valueOf(result));
            }
        });
    }

    private void setValue(String value){
        if(a == 0){
            a = Integer.parseInt(value);
            res += a;
            txtResult.setText(res);
            return;
        }
        b = Integer.parseInt(value);
        res += b;
        txtResult.setText(res);
    }

    private void resetValue(){
        txtResult.setText("0");
        a = 0;
        b = 0;
        res = "";
        result = 0f;
    }
}