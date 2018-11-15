package com.example.jky.dietary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* setContentView(R.layout.register_page);
        EditText email1 = (EditText) findViewById(R.id.email);
        EditText userN1 = (EditText) findViewById(R.id.userN);
        EditText passW1 = (EditText) findViewById(R.id.passW); */

    }
    public void startReg(View v){
        startActivity(new Intent(MainActivity.this, register.class));
    }
    public void startLog(View v){
        startActivity(new Intent( MainActivity.this, day_one_breakfast.class));
    }
    }

