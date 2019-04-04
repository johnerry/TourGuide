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

public class Lagos_Fragment_2 extends Fragment {
    public ListView listView;
    public ListAdapter adapter;
    ArrayList<Model> arrayList = new ArrayList<Model>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_1, container, false);
        setHasOptionsMenu(true);
        listView = rootView.findViewById(R.id.FragmentOneList);
        arrayList.add(new Model("Metisse Restaurant","Victoria Island, Lagos",R.drawable.metisse,"geo:6.433117, 3.438227"));
        arrayList.add(new Model("Bungalow's","1296 Akin Adesola St, Victoria Island, Lagos",R.drawable.bungalow,"geo:6.429318, 3.424301"));
        arrayList.add(new Model("NOK Restaurant","12a Akin Olugbade St, Victoria Island, Lagos",R.drawable.nok,"geo:6.430387, 3.421396"));
        arrayList.add(new Model("Craft Gourmet By Lou Baker","14 Idowu Martins St, Victoria Island, Lagos",R.drawable.lou_baker,"geo:6.433343, 3.420355"));
        arrayList.add(new Model("Yellow Chilli","Bishop Oluwole Street, 27 Oju Olobun Cl, Victoria Island, Lagos",R.drawable.yellow_chilli,"geo:6.425014, 3.415219"));
        arrayList.add(new Model("Orchid House Apapa","15a Marine Rd, Apapa, Lagos",R.drawable.house_apapa,"geo:6.440815, 3.357846"));
        arrayList.add(new Model("Cactus Restaurant","20, 24 Ozumba Mbadiwe Rd, Victoria Island, Lagos",R.drawable.cactus,"geo:6.439254, 3.437799"));
        arrayList.add(new Model("RSVP Victoria Island Lagos","9 Eletu Ogabi St, Victoria Island 101001, Lagos",R.drawable.rsvp,"geo:6.428529, 3.421450"));
        arrayList.add(new Model("The Lagoon","1c Ozumba Mbadiwe Ave, Eti-Osa, Lagos",R.drawable.lagoon,"geo:6.436686, 3.414812"));
        arrayList.add(new Model("B.L. Restaurant","147 Younis Bashorun Street, Victoria Island, Lagos",R.drawable.bl_restaurant,"geo:6.428266, 3.436979"));
        arrayList.add(new Model("Gurunar's Viceroy Restaurant","33 Akin Adesola St, Victoria Island, Lagos",R.drawable.vinceroy,"geo:6.428660, 3.423434"));
        arrayList.add(new Model("Bungalow Restaurant Ikeja","9 Adekunle Fajuyi Way, Ikeja GRA 101001, Ikeja",R.drawable.bungalow_ikeja,"geo:6.573001, 3.358839"));
        arrayList.add(new Model("Jevinik Place","21 Isaac John St, Ikeja G.R.A, Ikeja",R.drawable.jevinik,"geo:6.580197, 3.358606"));
        arrayList.add(new Model("L'afric Restaurant and Bar","1 Adeola Hopewell St, Victoria Island, Lagos",R.drawable.lafrica,"geo:6.431419, 3.429124"));
        arrayList.add(new Model("Kasa Indiana Restaurant","4a Babatunde Oki St, Ilupeju, Lagos",R.drawable.indiana,"geo:6.557662, 3.361318"));
        adapter = new ListAdapter(getActivity(), arrayList);
        listView.setAdapter(adapter);
        return rootView;
    }
}
