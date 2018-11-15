package com.example.jky.dietary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class day_two_lunch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_two_lunch);
    }
    public void startBack5(View v){
        startActivity(new Intent( day_two_lunch.this, day_two_breakfast.class));
    }
    public void startNext3(View v){
        startActivity(new Intent( day_two_lunch.this, day_two_dinner.class));
    }
}