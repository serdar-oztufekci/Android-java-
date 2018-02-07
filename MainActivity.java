package com.yeni;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.special.ResideMenu.ResideMenu;
import com.special.ResideMenu.ResideMenuItem;

import java.util.HashMap;
import java.util.List;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1;
    

    private ResideMenu resideMenu;
    private Context mContext;
    private ResideMenuItem itemAnasayfa;
    private ResideMenuItem itemTarifler;
   // private ResideMenuItem itemEncok;
    private ResideMenuItem itemHakkinda;

    private ResideMenuItem itemHint;

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;

    private View view2;

    private TextView ogrbilgi;
    private TextView tx_bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        setUpMenu();
        if (savedInstanceState == null) {

            changeFragment(new F_ana_sayfa());

        }

    }

    private void setUpMenu() {
        resideMenu = new ResideMenu(this);
        resideMenu.setBackground(R.drawable.menu_background);
        resideMenu.attachToActivity(this);


        resideMenu.setMenuListener(menuListener);
        resideMenu.setScaleValue(0.6f);
        //create menu items;
        itemAnasayfa = new ResideMenuItem(this, R.drawable.icon_home, "Ana Sayfa");
        itemTarifler = new ResideMenuItem(this, R.drawable.icon7, "Tarifler");
      //  itemEncok = new ResideMenuItem(this, R.drawable.icon_calendar, "En cok begenilenler");
        itemHakkinda = new ResideMenuItem(this, R.drawable.icon10, "Hakkında");

        itemHint =new ResideMenuItem(this,R.drawable.icon12,"İpuçları");

        itemAnasayfa.setOnClickListener(this);
        itemTarifler.setOnClickListener(this);
       // itemEncok.setOnClickListener(this);
        itemHakkinda.setOnClickListener(this);


        itemHint.setOnClickListener(this);

        resideMenu.addMenuItem(itemAnasayfa, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(itemTarifler, ResideMenu.DIRECTION_LEFT);

       // resideMenu.addMenuItem(itemEncok, ResideMenu.DIRECTION_RIGHT);
        resideMenu.addMenuItem(itemHakkinda, ResideMenu.DIRECTION_RIGHT);


        resideMenu.addMenuItem(itemHint,ResideMenu.DIRECTION_RIGHT);

        findViewById(R.id.title_bar_left_menu).setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                resideMenu.openMenu(ResideMenu.DIRECTION_LEFT);
            }
        });

        findViewById(R.id.title_bar_right_menu).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                resideMenu.openMenu(ResideMenu.DIRECTION_RIGHT);
            }
        });
    }

    @Override

    public boolean dispatchTouchEvent(MotionEvent ev) {
        return resideMenu.dispatchTouchEvent(ev);
    }

    @Override
    public void onClick(View view) {

        if (view == itemAnasayfa) {
            changeFragment(new F_ana_sayfa());
        }
        else if (view == itemTarifler) {
            changeFragment(new F_tarifler());
        }
/*        else if (view == itemEncok) {
            changeFragment(new F_encok_beg());
        }*/
        else if (view == itemHakkinda) {
            changeFragment(new F_Hakkinda());
        }

        else if (view== itemHint) {
            changeFragment(new F_ipucu());
        }



        resideMenu.closeMenu();
    }


    private ResideMenu.OnMenuListener menuListener = new ResideMenu.OnMenuListener() {
        @Override
        public void openMenu() {
            // Toast.makeText(mContext, "Menu is aÇILDIIII!", Toast.LENGTH_SHORT).show();

        }

        @Override
        public void closeMenu() {

           // Toast.makeText(mContext, "Menu is KAPANDI!", Toast.LENGTH_SHORT).show();
        }


    };




    private void changeFragment(Fragment targetFragment) {
        resideMenu.clearIgnoredViewList();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_fragment, targetFragment, "fragment")
                .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }

    public ResideMenu getResideMenu(){
        return resideMenu;}


}
