package com.example.main;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseEnd {

    //Fields
    private static String DATABASE_NAME = "LIBRARY_DATABASE";
    private Database database;
    DBHelper.MainFields mainFields = new DBHelper.MainFields();
    String[] tables = {mainFields.LIBRARY_TABLE, mainFields.ADMIN_TABLE, mainFields.MANAGER_TABLE, mainFields.OTHERSTAFF_TABLE,
            mainFields.STUDENT_TABLE, mainFields.CELL_TABLE, mainFields.SHELF_TABLE, mainFields.ITEM_TABLE, mainFields.BOOKS_TABLE,
            mainFields.VIDEOS_TABLE, mainFields.NEWSLETTER_TABLE, mainFields.OTHERSTAFF_ITEM_TABLE, mainFields.STUDENT_ITEM_TABLE, mainFields.STUDENT_LIBRARY_TABLE};


    public DatabaseEnd(Context context, int version){
        database = new Database(context, DATABASE_NAME, null, version);
    }
    public DatabaseEnd(){}

    public void addItem(String table, String ... values){

    }
    public void dropItem(final String table, String ... itemIds) throws Exception {
        //validate table
        int val = 0;
        for (String t: tables
             ) {
            if (table.equalsIgnoreCase(t))
                val++;
        }
        if (val < 1)
        {
            class TableNotFoundException extends Exception{
                public TableNotFoundException() {
                    super(table+": Table not found");
                }
            }
            throw new TableNotFoundException();
        }

        String keyField = table+"Id";
        SQLiteDatabase liteDatabase = database.getWritableDatabase();
        liteDatabase.delete(table, keyField, itemIds);
    }
}
