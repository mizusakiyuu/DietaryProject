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
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class register extends AppCompatActivity implements View.OnClickListener {

    private Button createButton, backButton;
    private EditText emailTextView, passwordTextView, confirmpasswordTextView;
    private ProgressDialog progressDialog;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_page);


        mAuth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);
        createButton = (Button) findViewById(R.id.createButton);
        backButton = (Button) findViewById(R.id.backButton);
        emailTextView = (EditText) findViewById(R.id.emailTextView);
        passwordTextView = (EditText) findViewById(R.id.passwordTextView);
        confirmpasswordTextView = (EditText) findViewById(R.id.confirmpasswordTextView);

        createButton.setOnClickListener(this);
        backButton.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        if (v == createButton) {
            registerUser();
        }
        if (v == backButton) {
            backToLogin();
        }

    }

    private void registerUser() {
        String email = emailTextView.getText().toString().trim();
        String password = passwordTextView.getText().toString().trim();
        String confirmpassword = confirmpasswordTextView.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Please enter email...", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Please enter password...", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(confirmpassword)) {
            Toast.makeText(this, "Please enter confrim password...", Toast.LENGTH_SHORT).show();
            return;
        }
        if (!password.equals(confirmpassword)) {
            Toast.makeText(this, "Password does not match...", Toast.LENGTH_SHORT).show();
            return;
        }
        progressDialog.setTitle("Registration");
        progressDialog.setMessage("Please wait while save your informations in our database.");
        progressDialog.show();

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful()){
                            Toast.makeText(register.this, "Registered Sucessfully...",Toast.LENGTH_SHORT).show();
                            
                            progressDialog.dismiss();

                        }else{
                            String error = task.getException().getMessage();
                            Toast.makeText(register.this, "Error happend: "+ error, Toast.LENGTH_SHORT).show();
                            progressDialog.dismiss();
                            return;
                        }


                    }
                });


    }


    private void backToLogin() {
        startActivity(new Intent(register.this, MainActivity.class));
    }


}
