package com.yeni;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by asus on 6.4.2017.
 */

public class ExpandableListAdapter extends BaseExpandableListAdapter {

    private Context cont;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHashMap;

    public ExpandableListAdapter(Context cont, List<String> listDataHeader, HashMap<String, List<String>> listHashMap) {
        this.cont = cont;
        this.listDataHeader = listDataHeader;
        this.listHashMap = listHashMap;
    }

    @Override
    public int getGroupCount() {
        return listDataHeader.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return listHashMap.get(listDataHeader.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return listDataHeader.get(i);
    }

    @Override
    public Object getChild(int i, int i1) { // i=group position i=item position
        return listHashMap.get(listDataHeader.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        String headerTitle=(String)getGroup(i);

        if (view==null){
            LayoutInflater inflater1=(LayoutInflater)this.cont.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater1.inflate(R.layout.list_group,null);


        }

        TextView lblHeader=(TextView)view.findViewById(R.id.header);
        lblHeader.setTypeface(null, Typeface.BOLD);
        lblHeader.setText(headerTitle);
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        final String childText=(String)getChild(i,i1);

        if (view==null){
            LayoutInflater inflater1=(LayoutInflater)this.cont.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater1.inflate(R.layout.list_item,null);

        }

        TextView txtListChild=(TextView)view.findViewById(R.id.list_item);
        txtListChild.setText(childText);
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
