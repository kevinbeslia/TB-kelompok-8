package com.example.redbullmart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class statusorder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.statusorder);
    }

    public void statusorder(View view) {
        startActivity(new Intent(this, statusorder.class));
        finish();
    }

    public void home(View view) {
        startActivity(new Intent(this, home.class));
        finish();
    }
    public void inbox(View view) {
        startActivity(new Intent(this, inbox.class));
        finish();
    }
    public void profil(View view) {
        startActivity(new Intent(this, profil.class));
        finish();
    }
}

