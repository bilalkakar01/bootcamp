package com.github.bilalkakar01.bootcamp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.mainGoButton);
        name= findViewById(R.id.mainName);
        button.setOnClickListener(v ->{
            String userName= "Hello " + name.getText().toString();
            Intent intent = new Intent(MainActivity.this, GreetingActivity.class);
            intent.putExtra("name", userName);
            startActivity(intent);
        });
    }
}