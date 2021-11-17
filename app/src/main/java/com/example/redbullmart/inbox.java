package com.example.redbullmart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class inbox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inbox);
    }
    public void home(View view) {
        startActivity(new Intent(this, home.class));
        finish();
    }
    public void profil(View view) {
        startActivity(new Intent(this, profil.class));
        finish();
    }
}
