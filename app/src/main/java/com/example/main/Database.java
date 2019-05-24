package com.example.main;

import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.library_system.R;

import java.io.IOException;
import java.io.InputStream;

public class Database extends SQLiteOpenHelper {

    API dbEnd = new API();
    InputStream inputStream = null;
    byte[] script = null;

    public Database(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        inputStream = Resources.getSystem().openRawResource(R.raw.projectSqlScript);
        try {
            inputStream.read(script, 0, inputStream.available());
            getWritableDatabase().execSQL(String.format("%s", script));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        getWritableDatabase().execSQL("VACUUM");
        inputStream = Resources.getSystem().openRawResource(R.raw.projectSqlScript);
        try {
            inputStream.read(script, 0, inputStream.available());
            getWritableDatabase().execSQL(String.format("%s", script));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
