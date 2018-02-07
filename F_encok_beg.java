package com.yeni;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class F_encok_beg extends Fragment {

    private View parentView;
    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        parentView = inflater.inflate(R.layout.encok_beg, container, false);
        listView   = (ListView) parentView.findViewById(R.id.listView);
        initView();
        return parentView;
    }

    private void initView(){
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                getCalendarData());
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), "Clicked item!", Toast.LENGTH_LONG).show();
            }
        });
    }

    private ArrayList<String> getCalendarData(){
        ArrayList<String> calendarList = new ArrayList<String>();
        calendarList.add("Hünkar Beğendi");
        calendarList.add("İçli Köfte");
        calendarList.add("Hamsi Tava");
        calendarList.add("Döner");
        calendarList.add("Yaprak Sarma");
        calendarList.add("Çiğ Köfte");
        calendarList.add("İskender Kebap");
        calendarList.add("Etli Kuru Fasulye");
        calendarList.add("Lahmacun");
        calendarList.add("Adana Kebap");

        return calendarList;
    }
}
