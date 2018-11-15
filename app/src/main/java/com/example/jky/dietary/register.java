package com.example.jky.dietary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_page);
    }
    public void startCreate(View v) {
        startActivity(new Intent( register.this, MainActivity.class));
    }
    public void startBack(View v){
        startActivity(new Intent( register.this, MainActivity.class));
    }
}
