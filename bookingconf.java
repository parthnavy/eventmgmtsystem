package com.example.parth.eventmgmtsystem;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class bookingconf extends AppCompatActivity {
    EditText e;
    String s="";
    String c="";
    DB_EVENTS db;
    DB_EVENTBOOK db1;
    boolean b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookingconf);
        db=new DB_EVENTS(this);
        db1=new DB_EVENTBOOK(this);
        Intent intent = getIntent();
         c=intent.getStringExtra(bookevent.msg2);

    }
    public void bookingconfirmed(View view){
        e=(EditText)findViewById(R.id.editText10);
        s=e.getText().toString();
        int a=Integer.parseInt(s);
        boolean b2=db1.book_insert(a);
        if(b2==true) {
            b1 = db.updatedata(a);
        }
        else
        {
            Toast.makeText(bookingconf.this,"Capacity is full or you have already booked the event or event ID is wrong",Toast.LENGTH_SHORT).show();
        }

        if(b1==true && b2==true){
            Toast.makeText(bookingconf.this,"Booking confirmed for event" +  a,Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(this,bookevent.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(bookingconf.this,"Capacity is full or you have already booked the event or event ID is wrong",Toast.LENGTH_SHORT).show();

        }




    }
    public void back3(View view)
    {
        Intent intent=new Intent(this,bookevent.class);
        startActivity(intent);
    }
}
