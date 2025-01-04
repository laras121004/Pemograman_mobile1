package com.example.memotek; // Ganti dengan nama package Anda

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class awal_logo extends AppCompatActivity {

    private TextView textViewWelcome;
    private TextView textViewLearn;
    private ImageView imageViewLogo;
    private Button buttonSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awal_logo); // Ganti dengan nama layout XML Anda

        // Inisialisasi elemen UI
        textViewWelcome = findViewById(R.id.textView2);
        textViewLearn = findViewById(R.id.textView3);
        imageViewLogo = findViewById(R.id.imageView2);
        buttonSignIn = findViewById(R.id.button);

        // Set listener untuk tombol Sign in
        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi yang dilakukan saat tombol diklik
                Intent intent = new Intent(awal_logo.this, SignInActivity.class); // Ganti dengan Activity tujuan
                startActivity(intent);
            }
        });
    }
}
