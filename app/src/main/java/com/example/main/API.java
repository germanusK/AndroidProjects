package com.example.main;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class API {

    //Fields
    private static String DATABASE_NAME = "LIBRARY_DATABASE";
    private Database database;
    DBHelper.MainFields mainFields = new DBHelper.MainFields();
    String[] tables = {mainFields.LIBRARY_TABLE, mainFields.ADMIN_TABLE, mainFields.MANAGER_TABLE, mainFields.OTHERSTAFF_TABLE,
            mainFields.STUDENT_TABLE, mainFields.CELL_TABLE, mainFields.SHELF_TABLE, mainFields.ITEM_TABLE, mainFields.BOOKS_TABLE,
            mainFields.VIDEOS_TABLE, mainFields.NEWSLETTER_TABLE, mainFields.OTHERSTAFF_ITEM_TABLE, mainFields.STUDENT_ITEM_TABLE, mainFields.STUDENT_LIBRARY_TABLE};


    public API(Context context, int version){
        database = new Database(context, DATABASE_NAME, null, version);
    }
    public API(){}

    public void addItem(String table, String ... values){
        ContentValues _values = new ContentValues();
        //fill content values
        _values.put("title", values[1]);

        database.getWritableDatabase().insert(table, null, _values);
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
    public void replaceItem(String table, int idInitial, ContentValues values){
        database.getWritableDatabase().delete(table, "itemId", new String[]{idInitial+""});
        database.getWritableDatabase().insert(table, null, values);
    }
    public void updateItem(String table, int id, ContentValues contentValues){
        database.getWritableDatabase().update(table, contentValues, "itemId", new String[]{id+""});
    }
    public Cursor getAllBooks(){
        return database.getWritableDatabase().rawQuery("SELECT * FROM "+mainFields.ITEM_TABLE+","+mainFields.BOOKS_TABLE+" WHERE item.itemId = books.itemId", null);
    }
    public Cursor customQueryRunner(String sql){
        return database.getWritableDatabase().rawQuery(sql, null);
    }
    public void likeItem(int itemId){
        ContentValues values = new ContentValues();
        values.put("likes", getLikes(itemId)+1);
        database.getWritableDatabase().update(mainFields.ITEM_TABLE, values, "itemId", new String[]{itemId+""});
    }

    private int getLikes(int itemId) {
        return itemId;
    }

}
