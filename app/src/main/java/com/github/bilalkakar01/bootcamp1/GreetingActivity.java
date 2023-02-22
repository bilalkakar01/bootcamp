package com.github.bilalkakar01.bootcamp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GreetingActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
        textView= findViewById(R.id.greetingMessage);
        Intent intent = getIntent();
        String str =intent.getStringExtra("name");
        textView.setText(str);
    }
}