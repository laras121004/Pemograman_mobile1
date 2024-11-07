package com.example.memotek; // Sesuaikan dengan nama package Anda

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class awal_logo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awal_logo);

        // Cari tombol Sign In dengan id "button"
        Button signInButton = findViewById(R.id.button);

        // Set onClickListener pada tombol Sign In
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke SignInActivity
                Intent intent = new Intent(awal_logo.this, Sign_In.class);
                startActivity(intent);
            }
        });
    }
}
