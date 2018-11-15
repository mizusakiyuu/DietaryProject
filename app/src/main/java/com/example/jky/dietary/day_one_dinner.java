package com.example.jky.dietary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class day_one_dinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_one_dinner);
    }
    public void startBack3(View v){
        startActivity(new Intent( day_one_dinner.this, day_one_lunch.class));
    }
    public void startNext2(View v){
        startActivity(new Intent( day_one_dinner.this, day_two_breakfast.class));
    }
}
