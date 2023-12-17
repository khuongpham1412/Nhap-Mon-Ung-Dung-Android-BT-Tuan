package com.example.bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShow = findViewById(R.id.btnShow);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+84)123456789"));

//                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people/"));

                Intent intent = new Intent( Intent.ACTION_SENDTO, Uri.parse("sms:5551234"));
                intent.putExtra("sms_body", "Thu bay nay di choi khong?");

//                Intent intent = new Intent();
//                intent.setType("image/pictures/*");
//                intent.setAction(Intent.ACTION_GET_CONTENT);

//                Intent intent = new Intent("android.intent.action.MUSIC_PLAYER");

                startActivity(intent);
            }
        });
    }
}