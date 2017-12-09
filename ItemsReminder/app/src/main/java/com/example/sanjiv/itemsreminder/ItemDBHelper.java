package com.example.sanjiv.itemsreminder;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.sanjiv.itemsreminder.ItemContract.*;

/**
 * Created by sanjiv on 12/9/17.
 */

public class ItemDBHelper extends SQLiteOpenHelper {
    public ItemDBHelper(Context context) {
        super(context, ItemContract.DATABASE_NAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" CREATE TABLE IF NOT EXISTS " +
                   ItemEntry.TABLE_NAME +  " ( " +
                   ItemEntry._ID + " INT PRIMARY KEY AUTOINCREMENT , " +
                   ItemEntry.DESCRIPTION + " TEXT , " +
                   ItemEntry.ITEM_PIC_URL + " TEXT DEFAULT NULL ," +
                   ItemEntry.ITEMS + " TEXT NOT NULL ); "
                   );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
