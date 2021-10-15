package com.example.maisalin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {


    private Button buttonBack;
    private TextView textViewWelcome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        buttonBack = findViewById(R.id.buttonBack);
        textViewWelcome= findViewById(R.id.textViewWelcome);
        String name =getIntent().getStringExtra("name");
        textViewWelcome.setText("Welcome"+" "+name);

    }
    public void back(View view) {
        Intent intent = new Intent(this,ArrayListActivity.class);
        startActivity(intent);
    }
}