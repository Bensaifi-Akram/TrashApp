package com.example.splash2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import es.dmoral.toasty.Toasty;

public class Register extends AppCompatActivity {

    Button registerBTN ;
    EditText ETemail;
    EditText ETusername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        int a;

        registerBTN = (Button) findViewById(R.id.registerBTN);
        ETemail = (EditText) findViewById(R.id.ETemail);
        ETusername = (EditText) findViewById(R.id.ETusername) ;

        registerBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }
        });

    }

    public void openLogin(){
        Intent intentInput = new Intent(this,Login.class);
        startActivityForResult(intentInput,99);
    }
    protected void onActivityresult(int requestCode, int resultCode, Intent intentOutput){
        if(requestCode==99 && resultCode==RESULT_OK){
            ETusername.setText(ETemail.getText().toString());
        }
    }

    public void showToast(){
        Toasty.custom(Register.this, R.string.toast_msg, getResources().getDrawable(R.drawable.ic_action_success),
                android.R.color.holo_red_light, android.R.color.white, Toasty.LENGTH_SHORT, true, true).show();
    }

}
