package com.example.parth.eventmgmtsystem;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class bookevent extends AppCompatActivity {
    DB_EVENTS db;
    public  final static String msg2="";
    String b="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookevent);
        Intent intent=getIntent();
         b=intent.getStringExtra(Loginstudent.msg);

        db=new DB_EVENTS(this);
        Cursor res=db.getAllData();

        StringBuffer buffer=new StringBuffer();
        while (res.moveToNext()){
            buffer.append("Id : " + res.getString(0)+"\n");
            System.out.println("Id:"+res.getString(0));
            buffer.append(" Name : " + res.getString(1)+"\n");
            buffer.append("Price : " + res.getString(2)+"\n");
            buffer.append("Date : " + res.getString(3)+"\n");
            buffer.append("Capacity: " + res.getString(4)+"\n");
            buffer.append("Promocode :  " + res.getString(5)+"\n\n");

        }
        TextView textView=(TextView)findViewById(R.id.textView4);
        textView.setText(buffer);


    }

    public void bookingevent(View view){
        Intent intent=new Intent(this,bookingconf.class);
        intent.putExtra(msg2,b);
        startActivity(intent);


    }
    public void Cancelbook(View view){
        Intent intent=new Intent(this,cancelbooking.class);
        intent.putExtra(msg2,b);
        startActivity(intent);
    }
    public void Logoff(View view)
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
