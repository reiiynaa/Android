package com.reena.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView text;
        text = findViewById(R.id.displayo);

        Intent intent = getIntent();
        String vv = intent.getStringExtra("username");
        text.setText(vv);



    }
}