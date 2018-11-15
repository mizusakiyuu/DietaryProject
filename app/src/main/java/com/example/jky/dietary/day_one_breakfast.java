package com.example.jky.dietary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class day_one_breakfast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_one_breakfast);
    }
    public void startBack(View v){
        startActivity(new Intent( day_one_breakfast.this, MainActivity.class));
    }
    public void startNext(View v){
        startActivity(new Intent( day_one_breakfast.this, day_one_lunch.class));
    }
}
