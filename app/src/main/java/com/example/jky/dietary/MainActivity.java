package com.example.jky.dietary;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button loginButton;
    private EditText emailTextView, passwordTextView;
    private ProgressDialog progressDialog;
    private FirebaseAuth mAuth;
    private static final int TIME_DELAY = 2000;
    private static long back_pressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);
        loginButton = (Button) findViewById(R.id.loginButton);
        emailTextView = (EditText) findViewById(R.id.emailTextView);
        passwordTextView = (EditText) findViewById(R.id.passwordTextView);

        loginButton.setOnClickListener(this);


    }
    @Override
    public void onBackPressed(){
        if(back_pressed + TIME_DELAY > System.currentTimeMillis()){

            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        }
        else{
            Toast.makeText(this,"Press back again to exit the app.",Toast.LENGTH_SHORT).show();
        }
        back_pressed = System.currentTimeMillis();
    }

    @Override
    public void onClick(View v) {

        if (v == loginButton) {
            userLogin();
        }

    }


    private void userLogin() {
        String email = emailTextView.getText().toString().trim();
        String password = passwordTextView.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Please enter email...", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Please enter password...", Toast.LENGTH_SHORT).show();
            return;
        }

        progressDialog.setTitle("Login");
        progressDialog.setMessage("Please wait while we are connecting to your account....");
        progressDialog.show();

        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();

                        if(task.isSuccessful()){
                            Toast.makeText(MainActivity.this, "Logging in please wait...",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(MainActivity.this, DayOneBreakfastActivity.class));
                        }else{

                            String error = task.getException().getMessage();
                            Toast.makeText(MainActivity.this, "Error Occurred: "+error, Toast.LENGTH_SHORT).show();
                            progressDialog.dismiss();
                            return;
                        }




                    }
                });


    }


    public void startReg(View v) {
        startActivity(new Intent(MainActivity.this, register.class));
    }


}

