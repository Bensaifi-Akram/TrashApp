package com.example.splash2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import es.dmoral.toasty.Toasty;


public class Login extends AppCompatActivity {
    private TextView TVregister;
    private Button loginBTN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set the view (.xml) to the correspond class//
        setContentView(R.layout.activity_login);

        //get the elements by id//
        TVregister =(TextView) findViewById(R.id.TVregister);
        loginBTN = (Button) findViewById(R.id.loginBTN);

        //OnClicks//
        TVregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterActivity();
            }
        });
        loginBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast();
            }
        });

    }


    //methods//
    public void openRegisterActivity(){
        Intent intent = new Intent(this,Register.class);
        startActivity(intent);
    }
    public void showToast(){
        Toasty.custom(Login.this, R.string.toast_msg, getResources().getDrawable(R.drawable.ic_action_success),
                android.R.color.holo_red_light, android.R.color.white, Toasty.LENGTH_SHORT, true, true).show();
    }

}
