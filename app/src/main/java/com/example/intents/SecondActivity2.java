package com.example.intents;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Second Activity");

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String email = intent.getStringExtra("EMAIL");
        String phone = intent.getStringExtra("PHONE");
        TextView mResult = findViewById(R.id.result);
        mResult.setText("Name: " +name+"\nEmail: "+email+ "\nPhone No: "+phone);
    }
}