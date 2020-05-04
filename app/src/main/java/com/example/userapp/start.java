package com.example.userapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class start extends AppCompatActivity {

    TextView textmsg;
    String st;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        textmsg = (TextView) findViewById(R.id.textmsg);
        st = getIntent().getExtras().getString("username");
        textmsg.setText("Welcome " +  st);
    }
}
