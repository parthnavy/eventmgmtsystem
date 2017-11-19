package com.example.parth.eventmgmtsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class signup1 extends AppCompatActivity {
    EditText e1,e2;
    String a="";
    String b="";
    signup2 s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup1);
        s=new signup2(this);

    }
    public void sign_upp(View view)
    {
        e1=(EditText)findViewById(R.id.editText18);
        e2=(EditText)findViewById(R.id.editText19);
        a=e1.getText().toString();
        b=e2.getText().toString();
        boolean o=s.insert_data1(a,b);
        if(o==true)
        {
            Toast.makeText(signup1.this,"Sign up successful",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(this,Loginstudent.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(signup1.this,"Sign up failed",Toast.LENGTH_SHORT).show();
        }
    }
}
