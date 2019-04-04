package com.example.johnfash.tourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;

public class Lagos_Fragment_1 extends Fragment {
    public ListView listView;
    public ListAdapter adapter;
    ArrayList<Model> arrayList = new ArrayList<Model>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_1, container, false);
        setHasOptionsMenu(true);
        listView = rootView.findViewById(R.id.FragmentOneList);
        arrayList.add(new Model("Westown Hotel Ikeja","1 Ayeni 1010 Close Sheraton Link Road, Opebi, Ikeja, Lagos",R.drawable.westown_hotel_ikeja,"geo:6.584333, 3.362232"));
        arrayList.add(new Model("Presken Hotel Awolowo","131 Obafemi Awolowo Way, Oba Akran 100271, Ikeja",R.drawable.presken_hotel_awolowo,"geo:6.608496, 3.350368"));
        arrayList.add(new Model("Inglesias Hotel","Tejuosho, Yaba, 13 Martins St, Lagos",R.drawable.inglesias_hotel,"geo:6.510253, 3.367145"));
        arrayList.add(new Model("Best Western Plus Lagos Ikeja Hotel","12 Allen Ave, Allen, Ikeja",R.drawable.wester_plus ,"geo:6.597414, 3.354854"));
        arrayList.add(new Model("Eko Hotels & Suites","1415 Adetokunbo Ademola Street, Victoria Island, Lagos",R.drawable.eko_hotel ,"geo:6.426750, 3.430764"));
        arrayList.add(new Model("Hotel Bon Voyage","57A AJ Marinho Dr, Victoria Island, Lagos",R.drawable.hotel_voyage ,"geo:6.426419, 3.434147"));
        arrayList.add(new Model("Newcastle Hotel","PLOT 20/21 T. F. Kuboye Rd, Maroko, Lagos",R.drawable.newcastle_hotel ,"geo:6.429277, 3.460905"));
        arrayList.add(new Model("Sheraton Lagos Hotel","30 Mobolaji Bank Anthony Way, 021189, Lagos",R.drawable.sharaton_hotel ,"geo:6.583660, 3.360287"));
        arrayList.add(new Model("Hotel Ree Danielles","6 Emmanuel low St, Ojota 100242, Lagos",R.drawable.hotel_daniel ,"geo:6.579900, 3.381522"));
        arrayList.add(new Model("Dv8 Hotel","10 Abiona Close, Surulere, Lagos",R.drawable.dv8_hotel,"geo:6.507210, 3.353066"));
        arrayList.add(new Model("Hotel ibis Lagos Airport","Airport Rd, Ajao Estate, Lagos",R.drawable.hotel_ibis ,"geo:6.552044, 3.329180"));
        arrayList.add(new Model("Beni Gold Hotel","18 Adeleke Adedoyin St, Victoria Island, Lagos",R.drawable.beni_gold_hotel ,"geo:6.434219, 3.418924"));
        arrayList.add(new Model("Presken Hotel and Resorts Mojidi","16 Mojidi Street, Allen 100271, Lagos",R.drawable.presken_mojidi ,"geo:6.597918, 3.347501"));
        arrayList.add(new Model("Karma Hotel","17 Burma Rd, Apapa, Lagos",R.drawable.karma_hotel ,"geo:6.438041, 3.369359"));
        arrayList.add(new Model("Vintage Suites","15c Akinhanmi St, Surulere, Lagos",R.drawable.vintage,"geo:6.516431, 3.363051"));

        adapter = new ListAdapter(getActivity(), arrayList);
        listView.setAdapter(adapter);
        return rootView;
    }
}
