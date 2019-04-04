package com.example.johnfash.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Abuja_Fragment_1 extends Fragment {
    public ListView listView;
    public ListAdapter adapter;
    ArrayList<Model> arrayList = new ArrayList<Model>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_1, container, false);
        setHasOptionsMenu(true);
        listView = rootView.findViewById(R.id.FragmentOneList);
        arrayList.add(new Model("3J’s Hotels","31 P.O.W. Mafemi Cres, Utako, Abuja",R.drawable.j_hotel,"geo:9.073864, 7.434916"));
        arrayList.add(new Model("Top Rank Hotels Galaxy","245 P.O.W. Mafemi Cres, Utako, Abuja",R.drawable.hotel_galaxy,"geo:9.068742, 7.435666"));
        arrayList.add(new Model("Chida Int'l Hotel"," 224 Solomon Lar Way, Mabushi, Abuja",R.drawable.chida_hotel,"geo:9.071757, 7.434620"));
        arrayList.add(new Model("Hotel De Bently","892 Ngozi Okonjo-Iweala, Utako, Abuja",R.drawable.bently_hotel,"geo:9.060937, 7.444912"));
        arrayList.add(new Model("1st Forty Hotel","38 Aminu Kano Cres, Wuse 2, Abuja",R.drawable.forty_hotel,"geo:9.083445, 7.464553"));
        arrayList.add(new Model("Hotel Reno","Plot 1068, Off, Nnamdi Azikiwe Expressway, Kado, Abuja",R.drawable.reno,"geo:9.464744, 7.498165"));
        arrayList.add(new Model("Stanzel Grand Resort","Plot C103, Along A Close Off First Avenue, Behind Fidelity Bank, Abuja",R.drawable.grand_resort,"geo:9.170989, 7.419392"));
        arrayList.add(new Model("Western Dreams Hotel","Plot 387 Idris Ibrahim Cres, Utako, Abuja",R.drawable.western_dreams,"geo:9.316060, 7.420751"));
        arrayList.add(new Model("Parkview Hotel","2390 Takoradi St, Wuse, Abuja",R.drawable.parkview,"geo:9.289062, 7.477178"));
        arrayList.add(new Model("Nippon Grand Hotel Abuja","Plot 102, Express Way, Jahi District, Ahmadu Bello Way, Kado, Abuja",R.drawable.nippon,"geo:9.333119, 7.451617"));
        arrayList.add(new Model("Grand Cubana Hotels","6 Ebitu Ukiwe St, Jabi, Abuja",R.drawable.cubana,"geo:9.370831, 7.446503"));
        arrayList.add(new Model("Reiz Continental Hotel","779 10th Street, Cadastral Zone, Abuja",R.drawable.continental_hotel,"geo:9.277454, 7.498380"));
        arrayList.add(new Model("Residency Hotel","4 Port Harcourt Cres, Garki, Abuja",R.drawable.residency,"geo:9.270497, 7.495974"));
        arrayList.add(new Model("Bolingo Hotel","777 Independence Ave, Central Business Dis, Abuja",R.drawable.bolingo,"geo:9.264991, 7.495935"));
        arrayList.add(new Model("Denis Hotel","910 Ndjamena Cres, Wuse, Abuja",R.drawable.denis,"geo:9.357804, 7.444537"));

        adapter = new ListAdapter(getActivity(), arrayList);
        listView.setAdapter(adapter);
        return rootView;
    }
}
