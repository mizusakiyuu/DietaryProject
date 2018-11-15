package com.example.jky.dietary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class day_two_breakfast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_two_breakfast);
    }
    public void startBack4(View v){
        startActivity(new Intent( day_two_breakfast.this, day_one_dinner.class));
    }
    public void startNext2(View v){
        startActivity(new Intent( day_two_breakfast.this, day_two_lunch.class));
    }
}
