package com.example.parth.eventmgmtsystem;

import android.content.Intent;
import android.provider.BaseColumns;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Createevent extends AppCompatActivity {
    DB_EVENTS db;


    public static final String msg1 = " ";
    public static final String msg2 = " ";
    public static final String msg3 = " ";
    public static final String msg4 = " ";
    public static final String msg5 = " ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createevent);
        db=new DB_EVENTS(this);

    }
    public void add(View view)
    {


        EditText editText1 = (EditText) findViewById(R.id.editText);
        String message1 = editText1.getText().toString();
        EditText editText2 = (EditText) findViewById(R.id.editText3);
        String message2 = editText2.getText().toString();
        EditText editText3 = (EditText) findViewById(R.id.editText4);
        String message3 = editText3.getText().toString();
        EditText editText4 = (EditText) findViewById(R.id.editText5);
        String message4 = editText4.getText().toString();
        int p=Integer.parseInt(message4 );
        EditText editText5 = (EditText) findViewById(R.id.editText6);
        String message5 = editText5.getText().toString();
        boolean isinserted=db.insert_data(message1,message2,message3,p,message5);
        if(isinserted==true){
            Toast.makeText(Createevent.this,"Data inserted",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(Createevent.this,"Data not inserted",Toast.LENGTH_LONG).show();
        }
       // Intent intent=new Intent(this,MainActivity.class);
       // startActivity(intent);



    }
    public void changeinfo(View view){
        Intent intent=new Intent(this,changeInfo.class);
        startActivity(intent);


    }
    public void Logoff1(View view)
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
