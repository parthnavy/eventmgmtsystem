package com.example.parth.eventmgmtsystem;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void createevent(View view) {
        Intent intent = new Intent(this, Loginstaff.class);
        startActivity(intent);
    }
    public void book(View view){

        Intent intent=new Intent(this,Loginstudent.class);
        startActivity(intent);
    }

}
