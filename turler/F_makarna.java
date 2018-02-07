package com.yeni.turler;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.yeni.F_yemek;
import com.yeni.R;


public class F_makarna extends Fragment {

    View parent;
    Button btn1;
    ImageView image1,image2,image3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        parent=inflater.inflate(R.layout.main_makarna,container,false);

        image1=(ImageView)parent.findViewById(R.id.image_makarna1);
        image2=(ImageView)parent.findViewById(R.id.image_makarna2);
        image3=(ImageView)parent.findViewById(R.id.image_makarna3);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int target=12;
                F_yemek frag=new F_yemek();
                Bundle bundle=new Bundle();
                bundle.putInt("veri",target);
                frag.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.main_fragment, frag,"view_yemek").addToBackStack("view_yemek").commit();
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int target=13;
                F_yemek frag=new F_yemek();
                Bundle bundle=new Bundle();
                bundle.putInt("veri",target);
                frag.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.main_fragment, frag,"view_yemek").addToBackStack("view_yemek").commit();
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int target=14;
                F_yemek frag=new F_yemek();
                Bundle bundle=new Bundle();
                bundle.putInt("veri",target);
                frag.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.main_fragment, frag,"view_yemek").addToBackStack("view_yemek").commit();
            }
        });
        return parent;

    }


}
