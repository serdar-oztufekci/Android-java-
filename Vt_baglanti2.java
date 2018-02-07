package com.yeni;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by asus on 13.4.2017.
 */

public class Vt_baglanti2 extends SQLiteOpenHelper {

    // DataBase oluşturma
    private static final String VT="ogrenciler"; // veri tabanı adi
    private static final Integer SURUM=1;  // veri tabanı sürümü

    public Vt_baglanti2(Context c) {
        super(c, VT, null, SURUM); // yukarıda tanımlanan değişkenleri parametre olarak verdik.

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // tablo ekleme
       // db.execSQL("CREATE TABLE IF NOT EXISTS ogrenci(id INTEGER primarykey AUTOİNCREMENT, adi TEXT, soyadi TEXT, numarasi TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // eğer boyle bir tablo varsa (daha once olusturulmussa) onu sil. bidaha ipucu (???)
        //db.execSQL("DROP TABLE IF EXIST ogrenci");
    }
}
