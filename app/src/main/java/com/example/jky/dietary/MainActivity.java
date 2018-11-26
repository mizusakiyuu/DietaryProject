package com.example.jky.dietary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
       public void startLog(View v){
           startActivity(new Intent(MainActivity.this, day_one_breakfast.class));
       }
    public void startReg(View v){
        startActivity(new Intent(MainActivity.this, register.class));
    }



    }

