package com.example.jky.dietary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class day_three_lunch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_three_lunch);
    }
    public void startBack2(View v){
        startActivity(new Intent( day_three_lunch.this, day_three_breakfast.class));
    }
    public void startNext(View v){
        startActivity(new Intent( day_three_lunch.this, day_three_dinner.class));
    }
}
