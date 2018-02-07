package com.yeni;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by asus on 24.4.2017.
 */

public class Vt_connect extends SQLiteOpenHelper {

    private static final String VT="VT1"; // veri tabanı adi
    private static final Integer SURUM=1;

    public Vt_connect(Context c) {
        super(c, VT, null, SURUM);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       // db.execSQL("CREATE TABLE IF NOT EXISTS EMP_TABLE(_id integer primary key,E_NAME text,E_AGE text,E_DEPT text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
