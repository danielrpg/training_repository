package com.app.sqlitebottomnav.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.app.sqlitebottomnav.utility.Utility;

public class ConnectionSQLiteHelper extends SQLiteOpenHelper {

    public ConnectionSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(Utility.CREATE_TABLE_CLIENT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int lastVersion, int newVersion) {
        sqLiteDatabase.execSQL(Utility.DROP_TABLE_CLIENT);
        onCreate(sqLiteDatabase);
    }
}