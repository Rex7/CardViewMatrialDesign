package com.example.regis.cardviewmatrialdesign;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/*
 * Created by Regis on 09-01-2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    String database_Name = "MyUsers.db";
    String table_Name = "User";
    String userName = "UserNAme";
    String password = "password";
    String query = " DROP TABLE IF EXISTS " + table_Name;
    String sqlQuery = "CREATE TABLE  " + table_Name + "(\n" +
            "\t`UserId`\tINTEGER PRIMARY KEY AUTOINCREMENT,\n" +
            "\t" + userName + "\tTEXT NOT NULL,\n" +
            "\t" + password + "\tTEXT NOT NULL\n" +
            ");";

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public long registerUser(UserReg reg) {
        SQLiteDatabase database = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(userName, reg.getUserName());
        contentValues.put(password, reg.getPassword());
        long val = database.insert(table_Name, null, contentValues);
        Log.v("Message ", "value " + val);
        database.close();

        return val;


    }

    public int checUser(String user) {
        SQLiteDatabase database = getWritableDatabase();
        String[] column = {userName, password};
        Cursor cursor = database.query(table_Name, column, userName + "='" + user + "'", null, null, null, null);
        Log.v("Message ", "Count " + cursor.getCount());
        Log.v("Message ", "Count " + cursor.getString(cursor.getColumnIndex(userName)));
        return cursor.getCount();


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sqlQuery);
        Log.v("OnCreate", "Created");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(query);
        onCreate(db);
    }
}
