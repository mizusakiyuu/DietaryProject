package com.example.jky.dietary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class day_three_dinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_three_dinner);
    }
    public void startBack8(View v){
        startActivity(new Intent( day_three_dinner.this, day_three_lunch.class));
    }
    public void startNext6(View v){
        startActivity(new Intent( day_three_dinner.this, list.class));
    }
}
