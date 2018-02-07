package com.yeni;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import com.special.ResideMenu.ResideMenu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class F_ana_sayfa extends Fragment {

    private View parentView;
    private ResideMenu resideMenu;
    Context con;

    Button btnBul, btnTemizle;
    TextView text1,text2,text3,text4,text5;

    String temp="";
    int[] malzemeler=new int[5];
    int pos=0;

    private ExpandableListView listView;
    private android.widget.ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;

    public int last_position = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        parentView = inflater.inflate(R.layout.ana_sayfa, container, false);
        con=inflater.getContext();
        setUpViews();

        text1=(TextView) parentView.findViewById(R.id.text_malz1);
        text2=(TextView) parentView.findViewById(R.id.text_malz2);
        text3=(TextView) parentView.findViewById(R.id.text_malz3);
        text4=(TextView) parentView.findViewById(R.id.text_malz4);
        text5=(TextView) parentView.findViewById(R.id.text_malz5);
        btnBul =(Button)parentView.findViewById(R.id.btn_bul);
        btnTemizle =(Button)parentView.findViewById(R.id.btn_temizle);

        temizle();
        btnTemizle.setVisibility(View.INVISIBLE);
        btnBul.setVisibility(View.INVISIBLE);
        //invisible();

        MainActivity ParentAct= (MainActivity) getActivity();


            listView=(ExpandableListView)parentView.findViewById(R.id.exp2);
            initData();
            listAdapter=new com.yeni.ExpandableListAdapter(con,listDataHeader,listHash);
            listView.setAdapter(listAdapter);

        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {

                String deger=(String) listAdapter.getChild(i,i1);
                if (deger.equals(temp)) {

                    Toast.makeText(con,"Aynı Malzeme Sadece 1 Kere Secilebilir",Toast.LENGTH_SHORT).show();

                }
                else{

                    int target=idBul(deger);
                    btnTemizle.setVisibility(View.VISIBLE);
                    btnBul.setVisibility(View.VISIBLE);

                    if (pos>4){

                        /////////////////////////////// alt if yapısı
                        if (text1.getText().equals("")){
                            pos=0;
                            malzemeler[pos] = target;
                            text1.setText(deger);
                            temp=deger;
                        }
                        else if (text2.getText().equals("")){
                            pos=1;
                            malzemeler[pos] = target;
                            text2.setText(deger);
                        }
                        else if (text3.getText().equals("")){
                            pos=2;
                            malzemeler[pos] = target;
                            text3.setText(deger);
                        }
                        else if (text4.getText().equals("")){
                            pos=3;
                            malzemeler[pos] = target;
                            text4.setText(deger);
                        }
                        else if (text5.getText().equals("")){
                            pos=4;
                            malzemeler[pos] = target;
                            text5.setText(deger);
                        }
                        else {
                            Toast.makeText(con,"5ten fazla malzeme seçilemez",Toast.LENGTH_SHORT).show();
                        }
                        /////////////////////////////// alt if yapısı
                    }

                    else {

                        /////////////////////////////// alt if yapısı
                        if (text1.getText().equals("")){
                            pos=0;
                            malzemeler[pos] = target;
                            text1.setText(deger);
                            temp=deger;
                        }
                        else if (text2.getText().equals("")){
                            pos=1;
                            malzemeler[pos] = target;
                            text2.setText(deger);
                        }
                        else if (text3.getText().equals("")){
                            pos=2;
                            malzemeler[pos] = target;
                            text3.setText(deger);
                        }
                        else if (text4.getText().equals("")){
                            pos=3;
                            malzemeler[pos] = target;
                            text4.setText(deger);
                        }
                        else if (text5.getText().equals("")){
                            pos=4;
                            malzemeler[pos] = target;
                            text5.setText(deger);
                        }
                        else {
                            Toast.makeText(con,"5ten fazla malzeme seçilemez",Toast.LENGTH_SHORT).show();
                        }

                        /////////////////////////////// alt if yapısı
                    }


                }

                return false;
            }
        });

 /*       listView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {

                if(groupPosition != last_position)
                {
                    listView.collapseGroup(last_position);
                }
                super.F_ana_sayfa
                last_position=groupPosition;
            }
        });*/



        btnBul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // String get=String.valueOf(text3.getText());
          /*      text3.setText("");
                for (int j=0; j<malzemeler.length; j++){
                    text3.append(String.valueOf(malzemeler[j]));
                    Toast.makeText(con,String.valueOf(malzemeler[j]),Toast.LENGTH_SHORT).show();
                }*/

                F_bul fragmen=new F_bul();
                Bundle bundle=new Bundle();
                bundle.putIntArray("dizi",malzemeler);
                fragmen.setArguments(bundle);


                getFragmentManager().beginTransaction().replace(R.id.main_fragment, fragmen,"bul").addToBackStack("bul").commit();

            }
        });

        btnTemizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temizle();
                for (int i=0;i<malzemeler.length;i++){
                    malzemeler[i]=-1;
                    btnTemizle.setVisibility(View.INVISIBLE);
                    btnBul.setVisibility(View.INVISIBLE);
                    pos=0;
                    temp="";

                }
            }
        });



        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText("");
                malzemeler[0]=-1;
            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text2.setText("");
                malzemeler[1]=-1;
            }
        });

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text3.setText("");
                malzemeler[2]=-1;
            }
        });

        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text4.setText("");
                malzemeler[3]=-1;
            }
        });

        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text5.setText("");
                malzemeler[4]=-1;
            }
        });

        return parentView;
    }


    public void temizle(){
        text1.setText("");
        text2.setText("");
        text3.setText("");
        text4.setText("");
        text5.setText("");
    }

    public void invisible(){
        text1.setVisibility(View.INVISIBLE);
        text2.setVisibility(View.INVISIBLE);
        text3.setVisibility(View.INVISIBLE);
        text4.setVisibility(View.INVISIBLE);
        text5.setVisibility(View.INVISIBLE);
    }

    public static int idBul(String data){

        int id=-2;

        switch (data){
            case "Biber": id=1; break;
            case "Dolmalık Biber": id=2; break;
            case "Domates": id=3; break;
            case "Havuç": id=4; break;
            case "Ispanak": id=5; break;
            case "Kabak": id=6; break;
            case "Karnabahar": id=7; break;
            case "Lahana": id=8; break;
            case "Patates": id=9; break;
            case "Patlıcan": id=10; break;
            case "Pırasa": id=11; break;
            case "Soğan": id=12; break;
            case "Taze Fasulye": id=13; break;
            case "Yaprak": id=14; break;
            case "Kemikli et": id=15; break;
            case "Kuşbaşı et": id=16; break;
            case "Kıyma": id=17; break;
            case "Tavuk (but)": id=18; break;
            case "Tavuk (Bütün)": id=19; break;
            case "Tavuk (göğüs)": id=20; break;
            case "Mercimek": id=21; break;
            case "Mercimek (Yeşil)": id=22; break;
            case "Nohut": id=23; break;
            case "Pirinç": id=24; break;
            case "Alabalık": id=25; break;
            case "Hamsi": id=26; break;
            case "İstavrit": id=27; break;
            case "Uskumru": id=28; break;
            case "Kakao": id=29; break;
            case "Kaşar Peyniri": id=30; break;
            case "Makarna": id=31; break;
            case "Mantar": id=32; break;
            case "Nişasta": id=33; break;
            case "Salça (Biber)": id=34; break;
            case "Salça (Domates)": id=35; break;
            case "Süt": id=36; break;
            case "Un": id=37; break;
            case "Yoğurt": id=39; break;
            case "Yufka": id=40; break;
            case "Yumurta": id=41; break;

            default: id=99;
        }
        return id;
    }


    private void initData() {
        listDataHeader=new ArrayList<>();
        listHash=new HashMap<>();

        listDataHeader.add("Kırmızı Et");
        listDataHeader.add("Tavuk");
        listDataHeader.add("Balık");
        listDataHeader.add("Sebze");
        listDataHeader.add("Bakliyat");
        listDataHeader.add("Diğer");

        List<String> l_et=new ArrayList<>();
        l_et.add("Kemikli et");
        l_et.add("Kuşbaşı et");
        l_et.add("Kıyma");

        List<String> l_tavuk=new ArrayList<>();
        l_tavuk.add("Tavuk (but)");
        l_tavuk.add("Tavuk (Bütün)");
        l_tavuk.add("Tavuk (göğüs)");


        List<String> l_balik=new ArrayList<>();
        l_balik.add("Alabalık");
        l_balik.add("Hamsi");
        l_balik.add("İstavrit");
        l_balik.add("Uskumru");

        List<String> l_sebze=new ArrayList<>();
        l_sebze.add("Biber");
        l_sebze.add("Dolmalık Biber");
        l_sebze.add("Domates");
        l_sebze.add("Havuç");
        l_sebze.add("Ispanak");
        l_sebze.add("Kabak");
        l_sebze.add("Karnabahar");
        l_sebze.add("Lahana");
        l_sebze.add("Patates");
        l_sebze.add("Patlıcan");
        l_sebze.add("Pırasa");
        l_sebze.add("Soğan");
        l_sebze.add("Taze Fasulye");
        l_sebze.add("Yaprak");

        List<String> l_bakliyat=new ArrayList<>();
        l_bakliyat.add("Mercimek");
        l_bakliyat.add("Mercimek (Yeşil)");
        l_bakliyat.add("Nohut");
        l_bakliyat.add("Pirinç");

        List<String> l_diger=new ArrayList<>();
        l_diger.add("Kakao");
        l_diger.add("Kaşar Peyniri");
        l_diger.add("Makarna");
        l_diger.add("Mantar");
        l_diger.add("Nişasta");
        l_diger.add("Salça (Biber)");
        l_diger.add("Salça (Domates)");
        l_diger.add("Süt");
        l_diger.add("Un");
        l_diger.add("Yoğurt");
        l_diger.add("Yufka");
        l_diger.add("Yumurta");

        listHash.put(listDataHeader.get(0),l_et);
        listHash.put(listDataHeader.get(1),l_tavuk);
        listHash.put(listDataHeader.get(2),l_balik);
        listHash.put(listDataHeader.get(3),l_sebze);
        listHash.put(listDataHeader.get(4),l_bakliyat);
        listHash.put(listDataHeader.get(5),l_diger);

    }


    private void setUpViews() {
        MainActivity parentActivity = (MainActivity) getActivity();
        resideMenu = parentActivity.getResideMenu();
    }
}
