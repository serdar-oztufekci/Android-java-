package com.yeni;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class F_eslesen extends Fragment {

    Context con;
    View parent;
    TextView tv;

    private Vt_connect db;
    private TextView text_id,text_adi,text_tarif,text_malz1,text_malz2,text_malz3,text_malz4,text_malz5,text_malzeme_liste,text_porsiyon,text_sure;
    Button bt,bt2;

    private TextView text1,text2,text3;

    int a;

    String yemek_id="";
    String yemek_adi="";
    String yemek_tarif="";
    String yemek_malzeme_liste="";
    String yemek_porsiyon="";
    String yemek_sure="";

    ImageView img_v1;
    byte[] image;

    int id_baslik=0;

    String DB_NAME="VT1";
    String DB_PATH="C:/Users/asus/AndroidStudioProjects/Proje1/app/src/main/assets/";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        parent=inflater.inflate(R.layout.eslesen,container,false);
        con=inflater.getContext();
        db=new Vt_connect(con);


        text1= (TextView) parent.findViewById(R.id.text_baslik2);
        text2=(TextView)parent.findViewById(R.id.text_malzeme2);
        text3=(TextView) parent.findViewById(R.id.text_tarif2);
        img_v1=(ImageView)parent.findViewById(R.id.image_yemek2);
//        tv=(TextView) parent.findViewById(R.id.textView4);

        try {
            copyDataBase();
            Listele2();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return parent;
    }

    private void copyDataBase() throws IOException {
        InputStream myInput=con.getAssets().open(DB_NAME);
        File outFileName=con.getDatabasePath(DB_NAME);
        OutputStream myOutput=new FileOutputStream(outFileName);
        byte[] buffer=new byte[8192];
        int length;
        while ((length=myInput.read(buffer)) > 0) {
            myOutput.write(buffer,0,length);
        }
        myOutput.flush();
        myOutput.close();
        myInput.close();
    }

    private void Listele2(){
        String sutunlar[]={"y_adi","y_tarif","y_malzeme_liste","y_porsiyon","y_resim","y_sure"};
        SQLiteDatabase sldb2=db.getReadableDatabase();
        Cursor cursor1=sldb2.query("yemekler",sutunlar,null,null,null,null,null);

        int MyHedef=getArguments().getInt("myData");
        cursor1.moveToPosition(MyHedef);
        yemek_adi=cursor1.getString(cursor1.getColumnIndex("y_adi"));
        yemek_malzeme_liste=cursor1.getString(cursor1.getColumnIndex("y_malzeme_liste"));
        yemek_tarif=cursor1.getString(cursor1.getColumnIndex("y_tarif"));
        yemek_porsiyon=cursor1.getString(cursor1.getColumnIndex("y_porsiyon"));
        image=cursor1.getBlob(cursor1.getColumnIndex("y_resim"));
        yemek_sure=cursor1.getString(cursor1.getColumnIndex("y_sure"));

        text1.setText(yemek_adi+"\n\n");
        text2.setText("Malzemeler: ("+yemek_porsiyon+" kişilik)  ("+yemek_sure+" Dk.) \n\n"+yemek_malzeme_liste+"\n\n");
        text3.setText("Tarif: \n\n"+yemek_tarif);

        Bitmap bmp= BitmapFactory.decodeByteArray(image,0,image.length);
        img_v1.setImageBitmap(bmp);
        Toast.makeText(con,yemek_adi,Toast.LENGTH_SHORT).show();
    }

}
