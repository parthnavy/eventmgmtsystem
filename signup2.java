package com.example.parth.eventmgmtsystem;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.parth.eventmgmtsystem.DB_EVENTS.db_name;

/**
 * Created by Parth on 8/05/2017.
 */

public class signup2 extends SQLiteOpenHelper {
    public static final String db_name1="sign_up.db";
    public static final String table_name1="signuptable";
    public static final String col1="username";
    public static final String col2="password";

    public signup2(Context context) {
        super(context,db_name1, null,1);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+table_name1+" (username TEXT PRIMARY KEY ,password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ table_name1);
        onCreate(db);
    }
    public boolean insert_data1(String username1,String pass1)
    {
        SQLiteDatabase db1= this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(col1,username1);
        contentValues.put(col2,pass1);
        long result = db1.insert(table_name1, null, contentValues);
        if (result==-1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public int find2(String user_name,String password2)
    {
        SQLiteDatabase db1= this.getWritableDatabase();
        Cursor cursor=db1.rawQuery("SELECT * FROM '"+  table_name1 + "' WHERE username='"+ user_name +"' AND password='"+ password2 +"'",null);
        int j=cursor.getCount();
        cursor.close();
        return j;
    }

}
