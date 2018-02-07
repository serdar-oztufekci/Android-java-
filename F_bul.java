package com.yeni;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class F_bul extends Fragment {

    View parent;
    Context con;

    private Vt_connect db;

    private TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,
            text11,text12,text13,text14,text15,text16,text17,text18,text19,text20,text21,text22,text23,
            text_index,text_hedef;

    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,bt19,bt20,bt21,bt22,bt23;

    boolean durum1,durum2,durum3,durum4,durum5,durum6,durum7,durum8,durum9,durum10,durum11,durum12,durum13,durum14,durum15,durum16,durum17;
    boolean durum18,durum19,durum20,durum21,durum22,durum23;

    String yemek_id="";
    String yemek1 ="";
    String yemek2 ="";
    String yemek3 ="";
    String yemek4 ="";
    String yemek5 ="";
    String yemek6 ="";
    String yemek7 ="";
    String yemek8 ="";
    String yemek9 ="";
    String yemek10 ="";
    String yemek11 ="";
    String yemek12 ="";
    String yemek13 ="";
    String yemek14 ="";
    String yemek15 ="";
    String yemek16 ="";
    String yemek17 ="";
    String yemek18 ="";
    String yemek19 ="";
    String yemek20 ="";
    String yemek21 ="";
    String yemek22 ="";
    String yemek23 ="";

    int sonuc1=0;  int sonuc2=0;  int sonuc3=0;  int sonuc4=0;  int sonuc5=0;  int sonuc6=0;  int sonuc7=0;  int sonuc8=0;  int sonuc9=0;
    int sonuc10=0; int sonuc11=0;  int sonuc12=0;  int sonuc13=0;  int sonuc14=0;  int sonuc15=0;  int sonuc16=0;  int sonuc17=0;
    int sonuc18=0; int sonuc19=0;  int sonuc20=0;  int sonuc21=0;  int sonuc22=0;  int sonuc23=0;

    int dizi_sonuc1[],dizi_sonuc2[],dizi_sonuc3[],dizi_sonuc4[],dizi_sonuc5[],dizi_sonuc6[],dizi_sonuc7[],dizi_sonuc8[],
            dizi_sonuc9[],dizi_sonuc10[],dizi_sonuc11[],dizi_sonuc12[],dizi_sonuc13[],dizi_sonuc14[],dizi_sonuc15[],dizi_sonuc16[],
            dizi_sonuc17[],dizi_sonuc18[],dizi_sonuc19[],dizi_sonuc20[],dizi_sonuc21[],dizi_sonuc22[],dizi_sonuc23[];



    ImageView img_v1;
    byte[] image;

    int id_baslik=0;

    String DB_NAME="VT1";
    String DB_PATH="C:/Users/asus/AndroidStudioProjects/Proje1/app/src/main/assets/";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        parent=inflater.inflate(R.layout.bul, container, false);
        con=inflater.getContext();
        db=new Vt_connect(con);

        text1= (TextView) parent.findViewById(R.id.text_o1);
        text2= (TextView) parent.findViewById(R.id.text_o2);
        text3= (TextView) parent.findViewById(R.id.text_o3);
        text4= (TextView) parent.findViewById(R.id.text_o4);
        text5= (TextView) parent.findViewById(R.id.text_o5);
        text6= (TextView) parent.findViewById(R.id.text_o6);
        text7= (TextView) parent.findViewById(R.id.text_o7);
        text8= (TextView) parent.findViewById(R.id.text_o8);
        text9= (TextView) parent.findViewById(R.id.text_o9);
        text10= (TextView) parent.findViewById(R.id.text_o10);
        text11=(TextView) parent.findViewById(R.id.text_o11);
        text12=(TextView) parent.findViewById(R.id.text_o12);
        text13=(TextView) parent.findViewById(R.id.text_o13);
        text14=(TextView) parent.findViewById(R.id.text_o14);
        text15=(TextView) parent.findViewById(R.id.text_o15);
        text16=(TextView) parent.findViewById(R.id.text_o16);
        text17=(TextView) parent.findViewById(R.id.text_o17);
        text18=(TextView) parent.findViewById(R.id.text_o18);
        text19=(TextView) parent.findViewById(R.id.text_o19);
        text20=(TextView) parent.findViewById(R.id.text_o20);
        text21=(TextView) parent.findViewById(R.id.text_o21);
        text22=(TextView) parent.findViewById(R.id.text_o22);
        text23=(TextView) parent.findViewById(R.id.text_o23);



        bt1=(Button) parent.findViewById(R.id.btn_s1);
        bt2=(Button) parent.findViewById(R.id.btn_s2);
        bt3=(Button) parent.findViewById(R.id.btn_s3);
        bt4=(Button) parent.findViewById(R.id.btn_s4);
        bt5=(Button) parent.findViewById(R.id.btn_s5);
        bt6=(Button) parent.findViewById(R.id.btn_s6);
        bt7=(Button) parent.findViewById(R.id.btn_s7);
        bt8=(Button) parent.findViewById(R.id.btn_s8);
        bt9=(Button) parent.findViewById(R.id.btn_s9);
        bt10=(Button) parent.findViewById(R.id.btn_s10);
        bt11=(Button) parent.findViewById(R.id.btn_s11);
        bt12=(Button) parent.findViewById(R.id.btn_s12);
        bt13=(Button) parent.findViewById(R.id.btn_s13);
        bt14=(Button) parent.findViewById(R.id.btn_s14);
        bt15=(Button) parent.findViewById(R.id.btn_s15);
        bt16=(Button) parent.findViewById(R.id.btn_s16);
        bt17=(Button) parent.findViewById(R.id.btn_s17);
        bt18=(Button) parent.findViewById(R.id.btn_s18);
        bt19=(Button) parent.findViewById(R.id.btn_s19);
        bt20=(Button) parent.findViewById(R.id.btn_s20);
        bt21=(Button) parent.findViewById(R.id.btn_s21);
        bt22=(Button) parent.findViewById(R.id.btn_s22);
        bt23=(Button) parent.findViewById(R.id.btn_s23);



        durum1=true; durum2=false;durum3=false;durum4=false;durum5=false;durum6=false;durum7=false;durum8=false;durum9=false;durum10=false;
        durum11=false;durum12=false;durum13=false;durum14=false;durum15=false;durum16=false;durum17=false;durum18=false;durum19=false;
        durum20=false;durum21=false;durum22=false;durum23=false;

        int dizi_gelen[]= getArguments().getIntArray("dizi"); // ana sayfadan gelen dizi yi aldık


/////////////////////////////////////// veri tabanını getirme ////////////////////////////////////////////
        try {
            copyDataBase();    // veritabanını hafızaya kopyalaıp kullanıma hazır hale getiren metota gönderdik
            for (int i=0; i<23;i++){  // istenilen verileri tüm yemekler için (23 kere ) getirdik
                Listele();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int array1[]=new int[16];  int array2[]=new int[16];  int array3[]=new int[16];  int array4[]=new int[16];  int array5[]=new int[16];
        int array6[]=new int[16];  int array7[]=new int[16];  int array8[]=new int[16];  int array9[]=new int[16];  int array10[]=new int[16];
        int array11[]=new int[16];  int array12[]=new int[16];  int array13[]=new int[16];  int array14[]=new int[16];  int array15[]=new int[16];
        int array16[]=new int[16];  int array17[]=new int[16];  int array18[]=new int[16];  int array19[]=new int[16];  int array20[]=new int[16];
        int array21[]=new int[16];  int array22[]=new int[16];  int array23[]=new int[16];

        array1=DiziyeCevir(yemek1,array1);  // yemek stringini gönderip diziye çevirme metoduna ("," ile berabrer) gönderdik
        array2=DiziyeCevir(yemek2,array2);
        array3=DiziyeCevir(yemek3,array3);
        array4=DiziyeCevir(yemek4,array4);
        array5=DiziyeCevir(yemek5,array5);
        array6=DiziyeCevir(yemek6,array6);
        array7=DiziyeCevir(yemek7,array7);
        array8=DiziyeCevir(yemek8,array8);
        array9=DiziyeCevir(yemek9,array9);
        array10=DiziyeCevir(yemek10,array10);
        array11=DiziyeCevir(yemek11,array11);
        array12=DiziyeCevir(yemek12,array12);
        array13=DiziyeCevir(yemek13,array13);
        array14=DiziyeCevir(yemek14,array14);
        array15=DiziyeCevir(yemek15,array15);
        array16=DiziyeCevir(yemek16,array16);
        array17=DiziyeCevir(yemek17,array17);
        array18=DiziyeCevir(yemek18,array18);
        array19=DiziyeCevir(yemek19,array19);
        array20=DiziyeCevir(yemek20,array20);
        array21=DiziyeCevir(yemek21,array21);
        array22=DiziyeCevir(yemek22,array22);
        array23=DiziyeCevir(yemek23,array23);

       int[]dizi_sonuc1= DiziHazirla(array1);    // artık yemek1 stringi tam şekilde diziye çevriren metota gönderdik aramada bunu kullan
        int[] dizi_sonuc2= DiziHazirla(array2);
        int[]dizi_sonuc3= DiziHazirla(array3);
        int[]dizi_sonuc4= DiziHazirla(array4);
        int[]dizi_sonuc5= DiziHazirla(array5);
        int[]dizi_sonuc6= DiziHazirla(array6);
        int[]dizi_sonuc7= DiziHazirla(array7);
        int[]dizi_sonuc8= DiziHazirla(array8);
        int[]dizi_sonuc9= DiziHazirla(array9);
        int[]dizi_sonuc10= DiziHazirla(array10);
        int[]dizi_sonuc11= DiziHazirla(array11);
        int[]dizi_sonuc12= DiziHazirla(array12);
        int[]dizi_sonuc13= DiziHazirla(array13);
        int[]dizi_sonuc14= DiziHazirla(array14);
        int[]dizi_sonuc15= DiziHazirla(array15);
        int[]dizi_sonuc16= DiziHazirla(array16);
        int[]dizi_sonuc17= DiziHazirla(array17);
        int[]dizi_sonuc18= DiziHazirla(array18);
        int[]dizi_sonuc19= DiziHazirla(array19);
        int[]dizi_sonuc20= DiziHazirla(array20);
        int[]dizi_sonuc21= DiziHazirla(array21);
        int[]dizi_sonuc22= DiziHazirla(array22);
        int[]dizi_sonuc23= DiziHazirla(array23);



       UygunBul(dizi_gelen,dizi_sonuc1,dizi_sonuc2,dizi_sonuc3,dizi_sonuc4,dizi_sonuc5,dizi_sonuc6,
                dizi_sonuc7,dizi_sonuc8,dizi_sonuc9,dizi_sonuc10,dizi_sonuc11,dizi_sonuc12,dizi_sonuc13,
        dizi_sonuc14,dizi_sonuc15,dizi_sonuc16,dizi_sonuc17,dizi_sonuc18,dizi_sonuc19,dizi_sonuc20,
        dizi_sonuc21,dizi_sonuc22,dizi_sonuc23);

        int uzunluk1=dizi_sonuc1.length;
        int uzunluk2=dizi_sonuc2.length;
        int uzunluk3=dizi_sonuc3.length;
        int uzunluk4=dizi_sonuc4.length;
        int uzunluk5=dizi_sonuc5.length;
        int uzunluk6=dizi_sonuc6.length;
        int uzunluk7=dizi_sonuc7.length;
        int uzunluk8=dizi_sonuc8.length;
        int uzunluk9=dizi_sonuc9.length;
        int uzunluk10=dizi_sonuc10.length;
        int uzunluk11=dizi_sonuc11.length;
        int uzunluk12=dizi_sonuc12.length;
        int uzunluk13=dizi_sonuc13.length;
        int uzunluk14=dizi_sonuc14.length;
        int uzunluk15=dizi_sonuc15.length;
        int uzunluk16=dizi_sonuc16.length;
        int uzunluk17=dizi_sonuc17.length;
        int uzunluk18=dizi_sonuc18.length;
        int uzunluk19=dizi_sonuc19.length;
        int uzunluk20=dizi_sonuc20.length;
        int uzunluk21=dizi_sonuc21.length;
        int uzunluk22=dizi_sonuc22.length;
        int uzunluk23=dizi_sonuc23.length;

        int oran;

        ///////////////////////////////////////////// vt den gelen hedefe göre sonuçları vs. yazdırma ///////////////

        oran=OranBul(uzunluk1,sonuc1);
        text1.setTextColor(renkBul(oran));
        text1.setText( ("Malzeme Oranı:\n%")+(String.valueOf(oran)) );
        bt1.setText("Mercimek Çorbası \n(6 kişilik) (50 dk.)");
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=0;
                F_eslesen fragment=new F_eslesen();
                Bundle bundle=new Bundle();
                bundle.putInt("myData",id);
                fragment.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment,"myData").commit();
            }
        });

        oran=OranBul(uzunluk2,sonuc2);
        text2.setTextColor(renkBul(oran));
        text2.setText( ("Malzeme Oranı:\n%")+(String.valueOf(oran)) );
        bt2.setText("Domates Çorbası \n(5 kişilik) (40 dk.)");
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=1;
                F_eslesen fragment=new F_eslesen();
                Bundle bundle=new Bundle();
                bundle.putInt("myData",id);
                fragment.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment,"myData").commit();
            }
        });

        oran=OranBul(uzunluk3,sonuc3);
        text3.setTextColor(renkBul(oran));
        text3.setText( ("Malzeme Oranı:\n%")+(String.valueOf(oran)) );
        bt3.setText("Yoğurt Çorbası \n(2 kişilik) (30 dk.)");
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=2;
                F_eslesen fragment=new F_eslesen();
                Bundle bundle=new Bundle();
                bundle.putInt("myData",id);
                fragment.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment,"myData").commit();
            }
        });

        oran=OranBul(uzunluk4,sonuc4);
        text4.setTextColor(renkBul(oran));
        text4.setText( ("Malzeme Oranı:\n%")+(String.valueOf(oran)) );
        bt4.setText("Çoban Kavurma \n(4 kişilik) (90 dk.)");
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=3;
                F_eslesen fragment=new F_eslesen();
                Bundle bundle=new Bundle();
                bundle.putInt("myData",id);
                fragment.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment,"myData").commit();
            }
        });


        oran=OranBul(uzunluk5,sonuc5);
        text5.setTextColor(renkBul(oran));
        text5.setText( ("Malzeme Oranı:\n%")+(String.valueOf(oran)) );
        bt5.setText("Sebzeli Et Sote \n(4 kişilik) (90 dk.)");
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=4;
                F_eslesen fragment=new F_eslesen();
                Bundle bundle=new Bundle();
                bundle.putInt("myData",id);
                fragment.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment,"myData").commit();
            }
        });

        oran=OranBul(uzunluk6,sonuc6);
        text6.setTextColor(renkBul(oran));
        text6.setText( ("Malzeme Oranı:\n%")+(String.valueOf(oran)) );
        bt6.setText("Alinazik \n(6 kişilik) (70 dk.)");
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=5;
                F_eslesen fragment=new F_eslesen();
                Bundle bundle=new Bundle();
                bundle.putInt("myData",id);
                fragment.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment,"myData").commit();
            }
        });

        oran=OranBul(uzunluk7,sonuc7);
        text7.setTextColor(renkBul(oran));
        text7.setText( ("Malzeme Oranı:\n%")+(String.valueOf(oran)) );
        bt7.setText("Tavuk Etli Kabak Karnıyarık \n(4 kişilik) (65 dk.)");
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=6;
                F_eslesen fragment=new F_eslesen();
                Bundle bundle=new Bundle();
                bundle.putInt("myData",id);
                fragment.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment,"myData").commit();
            }
        });

        oran=OranBul(uzunluk8,sonuc8);
        text8.setTextColor(renkBul(oran));
        text8.setText( ("Malzeme Oranı:\n%")+(String.valueOf(oran)) );
        bt8.setText("Soslu Bütün Tavuk \n(4 kişilik) (85 dk.)");
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=7;
                F_eslesen fragment=new F_eslesen();
                Bundle bundle=new Bundle();
                bundle.putInt("myData",id);
                fragment.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment,"myData").commit();
            }
        });


        oran=OranBul(uzunluk9,sonuc9);
        text9.setTextColor(renkBul(oran));
        text9.setText( ("Malzeme Oranı:\n%")+(String.valueOf(oran)) );
        bt9.setText("Zeytinyağlı Yaprak Sarma \n(8 kişilik) (110 dk.)");
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=8;
                F_eslesen fragment=new F_eslesen();
                Bundle bundle=new Bundle();
                bundle.putInt("myData",id);
                fragment.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment,"myData").commit();
            }
        });


        oran=OranBul(uzunluk10,sonuc10);
        text10.setTextColor(renkBul(oran));
        text10.setText( ("Malzeme Oranı:\n%")+(String.valueOf(oran)) );
        bt10.setText("Zeytinyağlı Ispanak Kökü \n(4 kişilik) (30 dk.)");
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=9;
                F_eslesen fragment=new F_eslesen();
                Bundle bundle=new Bundle();
                bundle.putInt("myData",id);
                fragment.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment,"myData").commit();
            }
        });

        oran=OranBul(uzunluk11,sonuc11);
        text11.setTextColor(renkBul(oran));
        text11.setText( ("Malzeme Oranı:\n%")+(String.valueOf(oran)) );
        bt11.setText("Zeytinyağlı Lahana Sarma \n(8 kişilik) (120 dk.)");
        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=10;
                F_eslesen fragment=new F_eslesen();
                Bundle bundle=new Bundle();
                bundle.putInt("myData",id);
                fragment.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment,"myData").commit();
            }
        });

        oran=OranBul(uzunluk12,sonuc12);
        text12.setTextColor(renkBul(oran));
        text12.setText( ("Malzeme Oranı:\n%")+(String.valueOf(oran)) );
        bt12.setText("Marine Karnabahar \n(4 kişilik) (35 dk.)");
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=11;
                F_eslesen fragment=new F_eslesen();
                Bundle bundle=new Bundle();
                bundle.putInt("myData",id);
                fragment.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment,"myData").commit();
            }
        });

        oran=OranBul(uzunluk13,sonuc13);
        text13.setTextColor(renkBul(oran));
        text13.setText( ("Malzeme Oranı:\n%")+(String.valueOf(oran)) );
        bt13.setText("Fırında Makarna \n(10 kişilik) (65 dk.)");
        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=12;
                F_eslesen fragment=new F_eslesen();
                Bundle bundle=new Bundle();
                bundle.putInt("myData",id);
                fragment.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment,"myData").commit();
            }
        });

        oran=OranBul(uzunluk14,sonuc14);
        text14.setTextColor(renkBul(oran));
        text14.setText( ("Malzeme Oranı:\n%")+(String.valueOf(oran)) );
        bt14.setText("Çıtır Mantı \n(6 kişilik) (60 dk.)");
        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=13;
                F_eslesen fragment=new F_eslesen();
                Bundle bundle=new Bundle();
                bundle.putInt("myData",id);
                fragment.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment,"myData").commit();
            }
        });

        oran=OranBul(uzunluk15,sonuc15);
        text15.setTextColor(renkBul(oran));
        text15.setText( ("Malzeme Oranı:\n%")+(String.valueOf(oran)) );
        bt15.setText("Tavuklu Mantı \n(6 kişilik) (60 dk.)");
        bt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=14;
                F_eslesen fragment=new F_eslesen();
                Bundle bundle=new Bundle();
                bundle.putInt("myData",id);
                fragment.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment,"myData").commit();
            }
        });

        oran=OranBul(uzunluk16,sonuc16);
        text16.setTextColor(renkBul(oran));
        text16.setText( ("Malzeme Oranı:\n%")+(String.valueOf(oran)) );
        bt16.setText("Sahanda Uskumru \n(2 kişilik) (40 dk.)");
        bt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=15;
                F_eslesen fragment=new F_eslesen();
                Bundle bundle=new Bundle();
                bundle.putInt("myData",id);
                fragment.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment,"myData").commit();
            }
        });

        oran=OranBul(uzunluk17,sonuc17);
        text17.setTextColor(renkBul(oran));
        text17.setText( ("Malzeme Oranı:\n%")+(String.valueOf(oran)) );
        bt17.setText("Yunan Usulü İstavrit \n(4 kişilik) (30 dk.)");
        bt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=16;
                F_eslesen fragment=new F_eslesen();
                Bundle bundle=new Bundle();
                bundle.putInt("myData",id);
                fragment.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment,"myData").commit();
            }
        });

        oran=OranBul(uzunluk18,sonuc18);
        text18.setTextColor(renkBul(oran));
        text18.setText( ("Malzeme Oranı:\n%")+(String.valueOf(oran)) );
        bt18.setText("Hamsi Sipari \n(4 kişilik) (45 dk.)");
        bt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=17;
                F_eslesen fragment=new F_eslesen();
                Bundle bundle=new Bundle();
                bundle.putInt("myData",id);
                fragment.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment,"myData").commit();
            }
        });


        oran=OranBul(uzunluk19,sonuc19);
        text19.setTextColor(renkBul(oran));
        text19.setText( ("Malzeme Oranı:\n%")+(String.valueOf(oran)) );
        bt19.setText("Patates Dolgulu Alabalık \n(4 kişilik) (50 dk.)");
        bt19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=18;
                F_eslesen fragment=new F_eslesen();
                Bundle bundle=new Bundle();
                bundle.putInt("myData",id);
                fragment.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment,"myData").commit();
            }
        });

        oran=OranBul(uzunluk20,sonuc20);
        text20.setTextColor(renkBul(oran));
        text20.setText( ("Malzeme Oranı:\n%")+(String.valueOf(oran)) );
        bt20.setText("Badem Sütlü Topik \n(8 kişilik) (40 dk.)");
        bt20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=19;
                F_eslesen fragment=new F_eslesen();
                Bundle bundle=new Bundle();
                bundle.putInt("myData",id);
                fragment.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment,"myData").commit();
            }
        });

        oran=OranBul(uzunluk21,sonuc21);
        text21.setTextColor(renkBul(oran));
        text21.setText( ("Malzeme Oranı:\n%")+(String.valueOf(oran)) );
        bt21.setText("Çikolatalı Rulo Pasta \n(8 kişilik) (40 dk.)");
        bt21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=20;
                F_eslesen fragment=new F_eslesen();
                Bundle bundle=new Bundle();
                bundle.putInt("myData",id);
                fragment.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment,"myData").commit();
            }
        });

        oran=OranBul(uzunluk22,sonuc22);
        text22.setTextColor(renkBul(oran));
        text22.setText( ("Malzeme Oranı:\n%")+(String.valueOf(oran)) );
        bt22.setText("Nişastalı Kek \n(6 kişilik) (35 dk.)");
        bt22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=21;
                F_eslesen fragment=new F_eslesen();
                Bundle bundle=new Bundle();
                bundle.putInt("myData",id);
                fragment.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment,"myData").commit();
            }
        });


        oran=OranBul(uzunluk23,sonuc23);
        text23.setTextColor(renkBul(oran));
        text23.setText( ("Malzeme Oranı:\n%")+(String.valueOf(oran)) );
        bt23.setText("Etli Kaşarlı Börek \n(6 kişilik) (60 dk.)");
        bt23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=22;
                F_eslesen fragment=new F_eslesen();
                Bundle bundle=new Bundle();
                bundle.putInt("myData",id);
                fragment.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment,"myData").commit();
            }
        });




        return parent;

    }



    /////////////////////////////////////////// METOTLAR ///////////////////////////////////////////////////////////////////////

    public static int OranBul(int length,int eslesme){

        int oran= (100*eslesme) / length;
        return oran;
    }

    public static int renkBul(int a){
       int renk=99;
        if (a<=40){ renk=Color.RED; }
        else if (a>40 && a<=70){ renk=Color.GREEN; }
        else if (a>70 && a<=100){ renk=Color.BLUE; }

        return renk;
    }


    public static int[] DiziHazirla(int dizi[]){   // artık yemek1 stringi tam şekilde diziye çevrildi. bunu kullan aramada

        int k=0;
        for (int i=0; i<dizi.length; i++){
            // int dizi_malzeme_list[]=new int[5];
            if (dizi[i]!=0){
                dizi[k++]=dizi[i];
            }

        }
        int dizi_yeni[]=new int[k];
        System.arraycopy(dizi,0,dizi_yeni,0,k);

        return dizi_yeni;
    }

    public static int[] DiziyeCevir(String data,int dizi[]){  //yemek1 stringi ni gönderip onun dizi şeklini alma ama arada "," ler var.
        String birlestir1="";
        String birlestir2="";
        String birlestir3="";

        boolean uygun=true;
        for (int i=0; i<data.length() ;i++){


            if (i==(data.length()-1) ) {

                if (!data.substring((i),(i+1)).equals(",") ){
                    birlestir3=data.substring( (i),(i+1) );
                    dizi[i]=Integer.parseInt(birlestir3);
                }
                else if (data.substring((i),(i+1)).equals(",") ){
                    continue;
                }

            }
            else {

                if (!data.substring((i),(i+1)).equals(",") && !data.substring((i+1),(i+2)).equals(",")){
                    birlestir1=(data.substring((i),(i+1))) + (data.substring((i+1),(i+2))) ;
                    dizi[i]=Integer.parseInt(birlestir1);
                    i++;
                }

                else if (!data.substring((i),(i+1)).equals(",") && data.substring((i+1),(i+2)).equals(",")){
                    birlestir2=data.substring( (i),(i+1) );
                    dizi[i]=Integer.parseInt(birlestir2);
                }
                else if (data.substring((i),(i+1)).equals(",") ){
                    continue;
                }


            }



        }

        return dizi;
    }



    // ana sayfadan gelen seçilen dizi için yemeklerin doğruluk oranını hesaplama
    public void UygunBul(int dizi[],int dizi1[],int dizi2[],int dizi3[],int dizi4[],int dizi5[],int dizi6[],int dizi7[],int dizi8[],int dizi9[],
                         int dizi10[],int dizi11[],int dizi12[],int dizi13[],int dizi14[],int dizi15[],int dizi16[],int dizi17[],int dizi18[],
                         int dizi19[],int dizi20[],int dizi21[],int dizi22[],int dizi23[]){


        for (int i=0; i<dizi.length ;i++){

            for (int j=0; j<5 ; j++){


                if (j<dizi1.length){

                    if (dizi[i]== dizi1[j] ) sonuc1++;
                }
                if (j<dizi2.length){

                    if (dizi[i]== dizi2[j] ) sonuc2++;
                }

                if (j<dizi3.length){

                    if (dizi[i]== dizi3[j] ) sonuc3++;
                }

                if (j<dizi4.length){

                    if (dizi[i]== dizi4[j] ) sonuc4++;

                }

                if (j<dizi5.length){

                    if (dizi[i]== dizi5[j] ) sonuc5++;
                }

                if (j<dizi16.length){

                    if (dizi[i]== dizi6[j] ) sonuc6++;
                }

                if (j<dizi7.length){

                    if (dizi[i]== dizi7[j] ) sonuc7++;
                }

                if (j<dizi8.length){

                    if (dizi[i]== dizi8[j] ) sonuc8++;
                }

                if (j<dizi9.length){

                    if (dizi[i]== dizi9[j] ) sonuc9++;
                }

                if (j<dizi10.length){

                    if (dizi[i]== dizi10[j] ) sonuc10++;
                }

                if (j<dizi11.length){

                    if (dizi[i]== dizi11[j] ) sonuc11++;
                }

                if (j<dizi12.length){

                    if (dizi[i]== dizi12[j] ) sonuc12++;
                }


                if (j<dizi13.length){

                    if (dizi[i]== dizi13[j] ) sonuc13++;
                }

                if (j<dizi14.length){

                    if (dizi[i]== dizi14[j] ) sonuc14++;
                }

                if (j<dizi15.length){

                    if (dizi[i]== dizi15[j] ) sonuc15++;
                }

                if (j<dizi16.length){

                    if (dizi[i]== dizi16[j] ) sonuc16++;
                }

                if (j<dizi17.length){

                    if (dizi[i]== dizi17[j] ) sonuc17++;
                }

                if (j<dizi18.length){

                    if (dizi[i]== dizi18[j] ) sonuc18++;
                }

                if (j<dizi19.length){

                    if (dizi[i]== dizi19[j] ) sonuc19++;
                }

                if (j<dizi20.length){

                    if (dizi[i]== dizi20[j] ) sonuc20++;
                }

                if (j<dizi21.length){

                    if (dizi[i]== dizi21[j] ) sonuc21++;
                }

                if (j<dizi22.length){

                    if (dizi[i]== dizi22[j] ) sonuc22++;
                }

                if (j<dizi23.length){

                    if (dizi[i]== dizi23[j] ) sonuc23++;
                }




            }
        }

    }

    private void copyDataBase() throws IOException {  // veritabanını hafızaya kopyalayıp işleme hazır hale getirme
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

    private void Listele(){  // veritabanında istenilen bilgileri çekme
        String sutunlar[]={"y_id","y_malzeme1","y_malzeme2","y_malzeme3","y_malzeme4","y_malzeme5"};
        SQLiteDatabase sldb2=db.getReadableDatabase();
        Cursor cursor1=sldb2.query("yemekler",sutunlar,null,null,null,null,null);


        for (int i=0; i<23 ; i++){
            cursor1.moveToPosition(i);
            if (durum1==true){
                yemek1 = cursor1.getString(cursor1.getColumnIndex("y_malzeme1"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme2"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme3"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme4"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme5")) ;
                text1.setText(yemek1);
                durum1=false;
                durum2=true;
            }

            else if(durum2==true){
                yemek2 = cursor1.getString(cursor1.getColumnIndex("y_malzeme1"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme2"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme3"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme4"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme5")) ;
                text2.setText(yemek2);
                durum2=false;
                durum3=true;
            }

            else if(durum3==true){
                yemek3 = cursor1.getString(cursor1.getColumnIndex("y_malzeme1"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme2"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme3"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme4"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme5")) ;
                text3.setText(yemek3);
                durum3=false;
                durum4=true;
            }

            else if(durum4==true){
                yemek4 = cursor1.getString(cursor1.getColumnIndex("y_malzeme1"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme2"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme3"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme4"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme5")) ;
                text4.setText(yemek4);
                durum4=false;
                durum5=true;
            }

            else if(durum5==true){
                yemek5 =cursor1.getString(cursor1.getColumnIndex("y_malzeme1"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme2"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme3"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme4"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme5")) ;
                text5.setText(yemek5);
                durum5=false;
                durum6=true;
            }

            else if(durum6==true){
                yemek6 = cursor1.getString(cursor1.getColumnIndex("y_malzeme1"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme2"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme3"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme4"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme5")) ;
                text6.setText(yemek6);
                durum6=false;
                durum7=true;
            }

            else if(durum7==true){
                yemek7 = cursor1.getString(cursor1.getColumnIndex("y_malzeme1"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme2"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme3"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme4"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme5")) ;
                text7.setText(yemek7);
                durum7=false;
                durum8=true;
            }

            else if(durum8==true){
                yemek8 = cursor1.getString(cursor1.getColumnIndex("y_malzeme1"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme2"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme3"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme4"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme5")) ;
                text8.setText(yemek8);
                durum8=false;
                durum9=true;
            }

            else if(durum9==true){
                yemek9 = cursor1.getString(cursor1.getColumnIndex("y_malzeme1"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme2"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme3"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme4"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme5")) ;
                text9.setText(yemek9);
                durum9=false;
                durum10=true;
            }

            else if(durum10==true){
                yemek10 = cursor1.getString(cursor1.getColumnIndex("y_malzeme1"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme2"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme3"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme4"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme5")) ;
                text10.setText(yemek10);
                durum10=false;
                durum11=true;
            }

            else if(durum11==true){
                yemek11 = cursor1.getString(cursor1.getColumnIndex("y_malzeme1"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme2"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme3"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme4"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme5")) ;
                durum11=false;
                durum12=true;
            }

            else if(durum12==true){
                yemek12 =cursor1.getString(cursor1.getColumnIndex("y_malzeme1"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme2"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme3"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme4"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme5")) ;
                durum12=false;
                durum13=true;
            }

            else if(durum13==true){
                yemek13 = cursor1.getString(cursor1.getColumnIndex("y_malzeme1"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme2"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme3"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme4"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme5")) ;
                durum13=false;
                durum14=true;
            }

            else if(durum14==true){
                yemek14 = cursor1.getString(cursor1.getColumnIndex("y_malzeme1"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme2"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme3"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme4"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme5")) ;
                durum14=false;
                durum15=true;
            }

            else if(durum15==true){
                yemek15 = cursor1.getString(cursor1.getColumnIndex("y_malzeme1"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme2"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme3"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme4"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme5")) ;
                durum15=false;
                durum16=true;
            }

            else if(durum16==true){
                yemek16 = cursor1.getString(cursor1.getColumnIndex("y_malzeme1"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme2"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme3"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme4"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme5")) ;
                durum16=false;
                durum17=true;
            }

            else if(durum17==true){
                yemek17 = cursor1.getString(cursor1.getColumnIndex("y_malzeme1"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme2"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme3"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme4"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme5")) ;
                durum17=false;
                durum18=true;
            }

            else if(durum18==true){
                yemek18 = cursor1.getString(cursor1.getColumnIndex("y_malzeme1"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme2"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme3"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme4"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme5")) ;
                durum18=false;
                durum19=true;
            }

            else if(durum19==true){
                yemek19 = cursor1.getString(cursor1.getColumnIndex("y_malzeme1"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme2"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme3"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme4"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme5")) ;
                durum19=false;
                durum20=true;
            }

            else if(durum20==true){
                yemek20 = cursor1.getString(cursor1.getColumnIndex("y_malzeme1"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme2"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme3"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme4"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme5")) ;
                durum20=false;
                durum21=true;
            }

            else if(durum21==true){
                yemek21 = cursor1.getString(cursor1.getColumnIndex("y_malzeme1"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme2"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme3"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme4"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme5")) ;
                durum21=false;
                durum22=true;
            }

            else if(durum22==true){
                yemek22 = cursor1.getString(cursor1.getColumnIndex("y_malzeme1"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme2"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme3"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme4"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme5")) ;
                durum22=false;
                durum23=true;
            }

            else if(durum23==true){
                yemek23 = cursor1.getString(cursor1.getColumnIndex("y_malzeme1"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme2"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme3"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme4"))+","
                        + cursor1.getString(cursor1.getColumnIndex("y_malzeme5")) ;
                durum23=false;
            }


            else {

            }
        }


    }

}
