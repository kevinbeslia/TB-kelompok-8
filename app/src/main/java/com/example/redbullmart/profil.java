package com.example.redbullmart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil);
    }

    public void ubahpassword (View view) {
        startActivity(new Intent(this, ubahpassword.class));
        finish();

    }
    public void logout (View view) {
        startActivity(new Intent(this, login.class));
        finish();

    }
    public void back (View view) {
        startActivity(new Intent(this, home.class));
        finish();

    }
}