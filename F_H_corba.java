package com.yeni;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class F_H_corba extends Fragment {
    private View root;

    Context con;

    TextView text1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root=inflater.inflate(R.layout.h_corba, container, false);

        text1=(TextView) root.findViewById(R.id.tv4);

        text1.setText("• Sebze çorbalarda kullanacağız sebzenin kararmaması için içine biraz sirke ekleyin.\n" +
                "• Çorbanın kıvananını tutturamayıp çok sulu olursa, yağ ve unu kavurup çorbanın içine ekleyiniz.\n" +
                "• Fazla bayatlamış ekmeklerinizi değerlendirin. Bayat ekleri garnitür olarak çorbaların yanında servis edebilirsiniz. Ekmeyi küçük karecikler halinde kesip bir kâsenin içene koyun. Ekmeyin üzerine hoşunuza giden baharat çeşitlerini ekleyerek zeytinyağı ile birlikte fırına verir kizartin. Altın gibi kızardıktan sonra kavanozun içinde alıp çorba sevisi için bekletin.");

        return root;
    }

}
