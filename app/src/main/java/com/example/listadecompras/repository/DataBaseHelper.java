package com.example.listadecompras.repository;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

//CLASSE QUE CRIA O BANCO

public class DataBaseHelper extends SQLiteOpenHelper {


    private static final String DB_NAME = "BancoUsers";
    private static final Integer DB_VERSION = 1;


    public DataBaseHelper(Context context) {

        super(context, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String stm = "create table users (id INTEGER PRIMARY KEY, nome TEXT,\n" + " senha TEXT);";
        sqLiteDatabase.execSQL(stm);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
