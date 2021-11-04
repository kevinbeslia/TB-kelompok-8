package com.example.redbullmart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void daftar(View view) {
        startActivity(new Intent(this, register.class));
        finish();
    }

    public void masuk(View view) {
        startActivity(new Intent(this, home.class));
        finish();
    }
}