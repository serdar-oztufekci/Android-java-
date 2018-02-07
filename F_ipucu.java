package com.yeni;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class F_ipucu extends Fragment {

    private View root;

    Context con;

    Button btnCorba,btnPilav,btnSalata;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.ipucu, container, false);
        con=inflater.getContext();

        btnCorba=(Button) root.findViewById(R.id.btn_corba);
        btnPilav=(Button) root.findViewById(R.id.btn_pilav);
        btnSalata=(Button) root.findViewById(R.id.btn_salata);

        btnCorba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.main_fragment,new F_H_corba(),"i1").addToBackStack("i1").commit();
            }
        });

        btnSalata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.main_fragment,new F_H_salata(),"i2").addToBackStack("i2").commit();
            }
        });

        btnPilav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.main_fragment,new F_H_pilav(),"i3").addToBackStack("i3").commit();
            }
        });


        return root;
    }



    }
