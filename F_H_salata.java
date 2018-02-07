package com.yeni;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class F_H_salata extends Fragment {
    private View root;

    Context con;

    TextView text1,text2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.h_salata, container, false);


        text1=(TextView) root.findViewById(R.id.tv3);
        text2=(TextView) root.findViewById(R.id.tv4);

        text2.setText("• Salata hazırlarken malzemeleri tamamen kurutursanız sosun nüfuz etmesine olanak sağlarsınız.\n" +
                "• Salataya sos dökerken en son yağını ekleyin, öncesinde eklerseniz yağ sosun geçmesini engeller.\n" +
                "• Yeşillikleri muhafaza ederken kuru olmalarına ve hava almayacak bir kapta buzdolabında bekletin.\n" +
                "• Limonun daha çok su vermesi için sıkmadan önce sıcak suda bekletin ve çatalla üzerini delin.\n" +
                "• Meyve ve sebzeleri yıkamadan buzdolabında saklayın, daha uzun süre dayanacaktır.");

        return root;


    }


}
