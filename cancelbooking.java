package com.example.parth.eventmgmtsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class cancelbooking extends AppCompatActivity {
    EditText e;
    String s1="";
    int a;
    String f="";
    DB_EVENTS db;
    DB_EVENTBOOK db2;
    boolean b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancelbooking);
        Intent intent=getIntent();
        f=intent.getStringExtra(bookevent.msg2);
        db=new DB_EVENTS(this);
        db2=new DB_EVENTBOOK(this);
    }
    public void confirmcancel(View view){
        e=(EditText)findViewById(R.id.editText11);
        s1=e.getText().toString();
        int a=Integer.parseInt(s1);
        int b2=db2.remove_booking(a);

        if(b2!=0) {
              b1 = db.updatedata1(a);
        }
        else
        {
            Toast.makeText(cancelbooking.this,"Booking not cancelled",Toast.LENGTH_SHORT).show();
        }
        if(b1==true && b2!=0){
            Toast.makeText(cancelbooking.this,"Booking cancelled",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(this,bookevent.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(cancelbooking.this,"Booking not cancelled",Toast.LENGTH_SHORT).show();
        }

    }
    public void back2(View view)
    {
        Intent intent=new Intent(this,bookevent.class);
        startActivity(intent);
    }
}
