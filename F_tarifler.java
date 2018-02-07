package com.yeni;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.yeni.turler.F_balik;
import com.yeni.turler.F_corba;
import com.yeni.turler.F_et;
import com.yeni.turler.F_sebze;
import com.yeni.turler.F_makarna;
import com.yeni.turler.F_tatli;

public class F_tarifler extends Fragment {

    private View parent;
    Context con;

    ImageView img_corba;
    ImageView img_et;
    ImageView img_sebze;
    ImageView img_makarna;
    ImageView img_balik;
    ImageView img_tatli;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        parent=inflater.inflate(R.layout.tarifler,container,false);

        img_corba=(ImageView) parent.findViewById(R.id.image_corba);
        img_et=(ImageView) parent.findViewById(R.id.image_et);
        img_sebze=(ImageView) parent.findViewById(R.id.image_sebze);
        img_makarna=(ImageView) parent.findViewById(R.id.image_makarna);
        img_balik=(ImageView) parent.findViewById(R.id.image_balik);
        img_tatli=(ImageView) parent.findViewById(R.id.image_tatli);

        img_corba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.main_fragment,new F_corba(),"main_corba").addToBackStack("main_corba").commit();
            }
        });


        img_et.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.main_fragment,new F_et(),"et").addToBackStack("et").commit();
            }
        });

        img_sebze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.main_fragment,new F_sebze(),"sebze").addToBackStack("sebze").commit();
            }
        });

        img_makarna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.main_fragment,new F_makarna(),"makarna").addToBackStack("makarna").commit();
            }
        });

        img_balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.main_fragment,new F_balik(),"balik").addToBackStack("balik").commit();
            }
        });

        img_tatli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.main_fragment,new F_tatli(),"tatli").addToBackStack("tatli").commit();
            }
        });






        return parent;
    }

}
