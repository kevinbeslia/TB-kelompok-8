package com.example.redbullmart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ubahpassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gantipassword);
    }

    public void back(View view) {
        startActivity(new Intent(this, profil.class));
        finish();

    }
}