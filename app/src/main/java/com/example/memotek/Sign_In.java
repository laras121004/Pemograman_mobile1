package com.example.memotek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Sign_In extends AppCompatActivity {

    private Button signInButton;
    private TextView usernameTextView, passwordTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in); // Pastikan ini sesuai dengan nama XML Anda

        // Inisialisasi komponen tampilan
        signInButton = findViewById(R.id.button);
        usernameTextView = findViewById(R.id.textView5); // Laras Sakti
        passwordTextView = findViewById(R.id.textView6); // Laras121004

        // Menambahkan aksi pada tombol "Sign in"
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ambil teks dari username dan password (simulasi)
                String username = usernameTextView.getText().toString();
                String password = passwordTextView.getText().toString();

                if (username.equals("Laras Sakti") && password.equals("Laras121004")) {
                    Toast.makeText(Sign_In.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    // Jika login berhasil, bisa diarahkan ke halaman lain atau aktivitas utama
                    // Intent intent = new Intent(Sign_In.this, MainActivity.class);
                    // startActivity(intent);
                } else {
                    Toast.makeText(Sign_In.this, "Login Failed! Incorrect username or password.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

