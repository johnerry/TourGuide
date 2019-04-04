package com.example.johnfash.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Abuja_Fragment_2 extends Fragment {
    public ListView listView;
    public ListAdapter adapter;
    ArrayList<Model> arrayList = new ArrayList<Model>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_1, container, false);
        setHasOptionsMenu(true);
        listView = rootView.findViewById(R.id.FragmentOneList);
        arrayList.add(new Model("Crossover Restaurant","3 Cairo Cres, Wuse 2, Abuja",R.drawable.cross_over,"geo:9.423564, 7.474479"));
        arrayList.add(new Model("Nkoyo","Ceddi Plaza, Central Business Dis 900211, Abuja",R.drawable.nikoyo,"geo:9.323013, 7.501411"));
        arrayList.add(new Model("BluCabana Restaurant & Cafe","1322 Shehu Yaradua Blvd, Mabushi, Abuja",R.drawable.cabana_restaurant,"geo:9.324149, 7.451689"));
        arrayList.add(new Model("Jevinik Restaurant Abuja","494 Bangui St, Wuse 2, Abuja",R.drawable.jevinik_restaurant,"geo:9.321750, 7.474404"));
        arrayList.add(new Model("Chez Victor","7 Ganges St, Maitama, Abuja",R.drawable.chez,"geo:9.464864, 7.482120"));
        arrayList.add(new Model("Johnny Rockets","Discovery Mall, 215 Konoko Cres St, Wuse, Abuja",R.drawable.johnny,"geo:9.390620, 7.473126"));
        arrayList.add(new Model("Gourmet Pizza Company","20, Thaba-Tseka Street, Off IBB Way, Wuse 2, Abuja",R.drawable.gourmet,"geo:9.300332, 7.480865"));
        arrayList.add(new Model("The Clubhouse Restaurant And Gym","TAK Continental Estate, 11 Aliyu Mohammed Rd, Jabi, Abuja",R.drawable.clubhouse,"geo:9.333309, 7.413060"));
        arrayList.add(new Model("355 Steakhouse & Lounge","38 Osun Cres, Maitama 900271, Abuja",R.drawable.steakhouse,"geo:9.332991, 7.502971"));
        arrayList.add(new Model("Serendib Restaurant And Bar","Lake Crescent Hotel, 29 Umaru Dikko St, Jabi, Abuja",R.drawable.serendib,"geo:9.339619, 7.424056"));
        arrayList.add(new Model("DUO Restaurant","99 Aminu Kano Cres, Wuse, Abuja",R.drawable.dou,"geo:9.332477, 7.513172"));
        arrayList.add(new Model("Panache Restaurant","1061 Herbert Macaulay Way, Central Business Dis, Abuja",R.drawable.panache,"geo:9.268186, 7.489751"));
        arrayList.add(new Model("City View Restaurant","zone 4, 7 Cape Town, Wuse, Abuja",R.drawable.city_view,"geo:9.382191, 7.499315"));
        arrayList.add(new Model("The Charcoal Grill","Penthouse (KFC Building, 112 Aminu Kano Cres, Abuja",R.drawable.charcoal_grill,"geo:9.409467, 7.493294"));
        arrayList.add(new Model("Dunes Continental","N44 Aguiyi Ironsi St, Maitama, Abuja",R.drawable.dunes,"geo:9.331119, 7.487562"));


        adapter = new ListAdapter(getActivity(), arrayList);
        listView.setAdapter(adapter);
        return rootView;
    }
}
