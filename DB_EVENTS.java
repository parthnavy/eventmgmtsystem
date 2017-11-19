package com.example.parth.eventmgmtsystem;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.database.sqlite.SQLiteOpenHelper;

public class DB_EVENTS extends SQLiteOpenHelper {
    public static final String db_name="Events.db";
    public static final String table_name="eventstable";
    public static final String col="ID";
    public static final String col1="NAME";
    public static final String col2="PRICE ";
    public static final String col3="DATE";
    public static final String col4="CAPACITY";
    public static final String col5="PROMOCODE";



    public DB_EVENTS(Context context) {
        super(context,db_name, null,1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+table_name+" (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,PRICE TEXT,DATE TEXT,CAPACITY INTEGER,PROMOCODE TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ table_name);
        onCreate(db);

    }
public boolean insert_data(String name,String price ,String date,int capacity,String promocode) {
    SQLiteDatabase db = this.getWritableDatabase();
    ContentValues contentValues = new ContentValues();
    contentValues.put(col1, name);
    contentValues.put(col2, price);
    contentValues.put(col3, date);
    contentValues.put(col4, capacity);
    contentValues.put(col5, promocode);

    long result = db.insert(table_name, null, contentValues);
    if (result == -1) {
        return false;
    } else {
        return true;
    }
}
    public Cursor getAllData(){
        SQLiteDatabase db=this.getWritableDatabase();
       Cursor res=db.rawQuery("SELECT * FROM " + table_name,null);
       return res;


    }
       public boolean updatedata(int id){

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor f=db.rawQuery("SELECT CAPACITY FROM eventstable WHERE ID= " + id,null);
           f.moveToFirst();
           int y=f.getInt(0);
           if(y==0)
           {
               return false;
           }

        db.execSQL("UPDATE eventstable SET CAPACITY=CAPACITY-1 WHERE ID= " + id);

        return true;

    }
    public boolean updatedata1(int id){
        SQLiteDatabase db = this.getWritableDatabase();

        db.execSQL("UPDATE eventstable SET CAPACITY=CAPACITY+1 WHERE ID= " + id);

        return true;

    }
    public boolean updatedata2(int id,String name)
    {
        SQLiteDatabase db=this.getWritableDatabase();

        db.execSQL("UPDATE eventstable SET NAME='" + name +  "' WHERE ID= " + id);


        return true;
    }
    public boolean updatedata3(int id,String price)
    {
        SQLiteDatabase db=this.getWritableDatabase();

        db.execSQL("UPDATE eventstable SET PRICE= '" + price +  "'WHERE ID= " + id);


        return true;
    }

    public boolean updatedata4(int id,String date)
    {
        SQLiteDatabase db=this.getWritableDatabase();

        db.execSQL("UPDATE eventstable SET DATE= '" + date +  "'WHERE ID= " + id);


        return true;
    }

    public boolean updatedata5(int id,int capacity)
    {
        SQLiteDatabase db=this.getWritableDatabase();

        db.execSQL("UPDATE eventstable SET CAPACITY= " + capacity +  " WHERE ID= " + id);


        return true;
    }

    public boolean updatedata6(int id,String promocode)
    {
        SQLiteDatabase db=this.getWritableDatabase();

        db.execSQL("UPDATE eventstable SET PROMOCODE= '" + promocode +  "'WHERE ID= " + id);


        return true;
    }




}

