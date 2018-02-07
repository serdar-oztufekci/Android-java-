package com.yeni;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class F_H_pilav extends Fragment {
    private View root;

    Context con;

    TextView text1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.h_pilav, container, false);

        text1=(TextView) root.findViewById(R.id.tv5);

        text1.setText("• Pilav yaparken, pirincin nişastasını iyice yıkarsanız pilav beyaz olur.\n" +
                "• Pilav pişirirken birkaç damla limon damlatırsanız parlak ve tane tane bir pilav elde edersiniz.\n" +
                "• Pilav pişirirken toz şeker ilave ederseniz, lezzetine katkıda bulunursunuz.");

        return root;
    }


}
