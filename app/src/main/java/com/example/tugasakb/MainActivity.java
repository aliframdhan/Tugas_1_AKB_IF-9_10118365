package com.example.tugasakb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindah(View view) {
        Intent intent = new Intent(MainActivity.this, RegisterActivity2.class);
        startActivity(intent);
    }

    public void profile(View view) {
        Intent intent = new Intent(MainActivity.this, ProfileActivity2.class);
        startActivity(intent);
    }
}