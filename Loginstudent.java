package com.example.parth.eventmgmtsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Loginstudent extends AppCompatActivity {
    EditText e;
    EditText e1;
    signup2 s2;
    String temp="";
    static String usr = "";
    String temp1="";
    public  final static String msg="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginstudent);
        s2=new signup2(this);
    }
    public void Loginsuccess(View view)
    {
        e=(EditText)findViewById(R.id.editText9);
        e1=(EditText)findViewById(R.id.editText8);
        usr=e.getText().toString();
        temp1=e1.getText().toString();
        int d=s2.find2(usr,temp1);
        if(d>0)
        {
            Toast.makeText(Loginstudent.this,"Username and password is correct.",Toast.LENGTH_SHORT).show();
            Intent intent1=new Intent(this,bookevent.class);
            intent1.putExtra(msg,usr);
            startActivity(intent1);
        }
        else
        {
            Toast.makeText(Loginstudent.this,"Username and password is wrong.",Toast.LENGTH_SHORT).show();
        }
    }
    public void signup(View view)
    {
        Intent intent=new Intent(this,signup1.class);
        startActivity(intent);

    }
}
