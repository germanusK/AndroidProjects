package com.example.main;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.library_system.R;

public class CursorListDisplay{

    ListView listView;

    public void setMyCursorAdapter(Context context, ListView listView1, Cursor cursor){
        int size = cursor.getCount();
        String[] from = new String[size];
        int[] to = new int[size];
        for (int i = 0; i < size; i++) {
            from[i] = cursor.getString(1);
            to[i] = cursor.getInt(0);
        }
        MyCursorAdapter cursorAdapter = new MyCursorAdapter(context, R.layout.specific_item, cursor, from, to, 0);
        listView1.setAdapter(cursorAdapter);
    }

    private void setupListView(final ListView lv){
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //show item page
            }
        });
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                //set item selected
                lv.setSelection(position);
                return true;
            }
        });
        lv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //pop up the item operations menu
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //clear the item operations menu
            }
        });

    }

}
