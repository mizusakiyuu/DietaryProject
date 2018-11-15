package com.example.jky.dietary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class day_two_dinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_two_lunch);
    }
    public void startBack6(View v){
        startActivity(new Intent( day_two_dinner.this, MainActivity.class));
    }
    public void startNext4(View v){
        startActivity(new Intent(day_two_dinner.this, day_three_breakfast.class));
    }
}
