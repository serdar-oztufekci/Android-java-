package com.yeni;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.ButtonBarLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Color.GREEN;


public class F_deneme extends Fragment {

    private View Parent;
    Context con;
    public Button btn1;
    private TextView text1;

    Cursor c=null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Parent=inflater.inflate(R.layout.deneme,container,false);  //1.parametre(inflate) Resource yani hangi layout ile ilişkilendirilecek
        con=inflater.getContext();
        return Parent;
}}
