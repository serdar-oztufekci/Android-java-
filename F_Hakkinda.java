package com.yeni;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class F_Hakkinda extends Fragment {

    private View root;
    Context con;

    TextView text1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.hakkinda, container, false);
        con = inflater.getContext();

        text1=(TextView) root.findViewById(R.id.tv9);
        text1.setText("Geliştirenler: \n \n M.Serdar ÖZTÜFEKÇİ - Özgür AKGÜL \n \n \n \n \n Bu uygulama bir Fırat Üniversite'si Öğrenci Projesidir...");

        return root;
    }
}
