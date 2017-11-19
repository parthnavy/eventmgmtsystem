package com.example.parth.eventmgmtsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Loginstaff extends AppCompatActivity {
    private static EditText username;
    private static EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginstaff);
    }
    public void loginbutton(View view){
         username=(EditText)findViewById(R.id.editText2);
         password=(EditText)findViewById(R.id.editText7);
         if((username.getText().toString().equals("User"))&&(password.getText().toString().equals("pass")))

         {
             Toast.makeText(Loginstaff.this,"Username and password is correct",Toast.LENGTH_SHORT).show();
             Intent intent=new Intent(this,Createevent.class);
             startActivity(intent);
         }
        else{
            Toast.makeText(Loginstaff.this,"Username and password is not correct",Toast.LENGTH_SHORT).show();
        }
    }
}
