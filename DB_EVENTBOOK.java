package com.example.parth.eventmgmtsystem;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.Settings;
import android.widget.Toast;

/**
 * Created by Parth on 8/05/2017.
 */

 public class DB_EVENTBOOK extends SQLiteOpenHelper {
   public static final String db_name3="booking.db";
   public static final String table_name3="bookingtable";
   public static final String col1="username_book";
   public static final String col2="EventID";

    @Override
    public void onCreate(SQLiteDatabase db) {
       db.execSQL("CREATE TABLE "+table_name3+" (username_book TEXT ,EventID INTEGER, PRIMARY KEY(username_book,EventID))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       db.execSQL("DROP TABLE IF EXISTS "+ table_name3);
       onCreate(db);

    }
   public DB_EVENTBOOK(Context context) {
      super(context,db_name3, null,1);

   }
   public boolean book_insert(int id)
   {
       SQLiteDatabase db = this.getWritableDatabase();
       ContentValues contentValues = new ContentValues();

       contentValues.put(col1, Loginstudent.usr);
       contentValues.put(col2, id);

       long result = db.insert(table_name3, null, contentValues);
       if(result==-1)
       {
           return false;
       }
       else
       {
           return  true;
       }
   }
    public int remove_booking(int id1)
    {
        SQLiteDatabase db1= this.getWritableDatabase();

        int i=db1.delete(table_name3,"username_book='" + Loginstudent.usr +"' AND EventID='"+ id1  + "'",null);

        return i;
    }
    public Cursor getAllData1(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("SELECT * FROM " + table_name3,null);
        return res;


    }
}
