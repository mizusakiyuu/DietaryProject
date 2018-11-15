package com.example.jky.dietary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class day_three_breakfast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_three_breakfast);
    }
    public void startBack7(View v){
        startActivity(new Intent( day_three_breakfast.this, day_two_dinner.class));
    }
    public void startNext5(View v){
        startActivity(new Intent( day_three_breakfast.this, day_three_lunch.class));
    }
}
