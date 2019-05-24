package com.example.main;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import com.example.library_system.R;

public class MyCursorAdapter extends SimpleCursorAdapter {
    @SuppressLint("NewApi")
    public MyCursorAdapter(Context context, int layout, Cursor c, String[] from, int[] to, int flags) {
        super(context, layout, c, from, to, flags);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        super.bindView(view, context, cursor);
        ImageView pictureFrame = (ImageView) view.findViewById(R.id.image);
        TextView desc = (TextView)view.findViewById(R.id.textView);
        String name = cursor.getString(0);
        String picturePath = cursor.getString(cursor.getColumnIndex("picture"));
        desc.setText(name);//set the name of item
        //obtain and decode image
        BitmapFactory.Options imageOptions = new BitmapFactory.Options();
        imageOptions.inSampleSize = 1;//set 1-to-1 scale
        Bitmap imageBitmap = BitmapFactory.decodeFile(/*image file path name*/picturePath, /*bitmap options, optional*/imageOptions);//decoding the image file into a bitmap
        //set image to frame
        pictureFrame.setImageBitmap(imageBitmap);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.specific_item, parent, false);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}