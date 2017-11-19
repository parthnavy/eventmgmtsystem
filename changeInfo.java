package com.example.parth.eventmgmtsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class changeInfo extends AppCompatActivity {
    public static final String msgg1=" ";
    public static final String msgg2=" ";
    public static final String msgg3=" ";
    public static final String msgg4=" ";
    public static final String msgg5=" ";
    public static final String  msgg6=" ";
    DB_EVENTS db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_info);
        db=new DB_EVENTS(this);
    }
    public void change1(View view)
    {
        EditText editText11 = (EditText) findViewById(R.id.editText12);
        String  msgg1 = editText11.getText().toString();
        int a=Integer.parseInt(msgg1);
        EditText editText22 = (EditText) findViewById(R.id.editText13);
        String  msgg2 = editText22.getText().toString();


        boolean c= db.updatedata2(a,msgg2);
        if(c==true)
        {
            Toast.makeText(changeInfo.this,"Event updated",Toast.LENGTH_LONG).show();
           // Intent intent=new Intent(this,MainActivity.class);
          //  startActivity(intent);
        }
        else
        {
            Toast.makeText(changeInfo.this,"Event not updated",Toast.LENGTH_LONG).show();
        }
    }
    public void change2(View view)
    {
        EditText editText11 = (EditText) findViewById(R.id.editText12);
        String  msgg1 = editText11.getText().toString();
        int a=Integer.parseInt(msgg1);
        EditText editText33 = (EditText) findViewById(R.id.editText14);
        String  msgg3 = editText33.getText().toString();


        boolean d= db.updatedata3(a,msgg3);
        if(d==true)
        {
            Toast.makeText(changeInfo.this,"Event updated",Toast.LENGTH_LONG).show();
          //  Intent intent=new Intent(this,MainActivity.class);
         //   startActivity(intent);
        }
        else
        {
            Toast.makeText(changeInfo.this,"Event not updated",Toast.LENGTH_LONG).show();
        }
    }
    public void change3(View view)
    {
        EditText editText11 = (EditText) findViewById(R.id.editText12);
        String  msgg1 = editText11.getText().toString();
        int a=Integer.parseInt(msgg1);
        EditText editText44 = (EditText) findViewById(R.id.editText15);
        String  msgg4 = editText44.getText().toString();


        boolean e= db.updatedata4(a,msgg4);
        if(e==true)
        {
           Toast.makeText(changeInfo.this,"Event updated",Toast.LENGTH_LONG).show();
          //  Intent intent=new Intent(this,MainActivity.class);
          //  startActivity(intent);
        }
        else
        {
            Toast.makeText(changeInfo.this,"Event not updated",Toast.LENGTH_LONG).show();
        }
    }
    public void change4(View view)
    {
        EditText editText11 = (EditText) findViewById(R.id.editText12);
        String  msgg1 = editText11.getText().toString();
        int a=Integer.parseInt(msgg1);
        EditText editText55 = (EditText) findViewById(R.id.editText16);
        String  msgg5 = editText55.getText().toString();
        int p=Integer.parseInt(msgg5);

        boolean f= db.updatedata5(a,p);
        if(f==true)
        {
            Toast.makeText(changeInfo.this,"Event updated",Toast.LENGTH_LONG).show();
         //   Intent intent=new Intent(this,MainActivity.class);
         //   startActivity(intent);
        }
        else
        {
            Toast.makeText(changeInfo.this,"Event not updated",Toast.LENGTH_LONG).show();
        }
    }
    public void change5(View view)
    {
        EditText editText11 = (EditText) findViewById(R.id.editText12);
        String  msgg1 = editText11.getText().toString();
        int a=Integer.parseInt(msgg1);
        EditText editText66 = (EditText) findViewById(R.id.editText17);
        String  msgg6 = editText66.getText().toString();


        boolean g= db.updatedata6(a,msgg6);
        if(g==true)
        {
            Toast.makeText(changeInfo.this,"Event updated",Toast.LENGTH_LONG).show();
       //     Intent intent=new Intent(this,MainActivity.class);
       //     startActivity(intent);
        }
        else
        {
            Toast.makeText(changeInfo.this,"Event not updated",Toast.LENGTH_LONG).show();
        }
    }
    public void back1(View view)
    {
        Intent intent=new Intent(this,Createevent.class);
        startActivity(intent);
    }
}
