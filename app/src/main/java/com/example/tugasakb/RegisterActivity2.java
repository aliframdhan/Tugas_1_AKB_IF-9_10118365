package com.example.tugasakb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
    }

    public void regis(View view) {
        Intent intent = new Intent(RegisterActivity2.this, MainActivity.class);
        startActivity(intent);
    }
}