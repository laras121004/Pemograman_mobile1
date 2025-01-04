package com.example.memotek; // Ganti dengan nama package Anda

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {

    private ImageView imageViewLogo;
    private TextView textViewTitle;
    private TextView textViewSubtitle;
    private TextView textViewSignIn;
    private TextView textViewName;
    private TextView textViewUsername;
    private ImageView imageViewIcon;
    private Button buttonSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in); // Ganti dengan nama layout XML Anda

        // Inisialisasi elemen UI
        imageViewLogo = findViewById(R.id.imageView2);
        textViewTitle = findViewById(R.id.textView2);
        textViewSubtitle = findViewById(R.id.textView3);
        textViewSignIn = findViewById(R.id.textView4);
        imageViewIcon = findViewById(R.id.imageView3);
        buttonSignIn = findViewById(R.id.button);

        // Set listener untuk tombol Sign in
        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi yang dilakukan saat tombol diklik
                Intent intent = new Intent(SignInActivity.this,  menu_home.class); // Ganti dengan Activity tujuan
                startActivity(intent);
            }
        });
    }
}
