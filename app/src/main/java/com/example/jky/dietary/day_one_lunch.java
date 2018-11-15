package com.example.jky.dietary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class day_one_lunch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_one_lunch);
    }
    public void startBack3(View v){
        startActivity(new Intent( day_one_lunch.this, day_one_breakfast.class));
    }
    public void startNext1(View v){
        startActivity(new Intent( day_one_lunch.this, day_one_dinner.class));
    }
}
