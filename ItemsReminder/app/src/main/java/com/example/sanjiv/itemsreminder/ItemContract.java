package com.example.sanjiv.itemsreminder;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by sanjiv on 12/9/17.
 */

public final class ItemContract {
    public static final String DATABASE_NAME="items.db";
    public static final String CONTENT_AUTHORITY = "com.example.sanjiv.itemsreminder";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_ITEMS = "items";
    public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_ITEMS);






    public static class ItemEntry implements BaseColumns {
        public static final String TABLE_NAME= "items";
        public static final String _ID = BaseColumns._ID;
        public static final String ITEMS = "items";
        public static final String ITEM_PIC_URL = "photourl";
        public static final String DESCRIPTION = "description";
    }
}
