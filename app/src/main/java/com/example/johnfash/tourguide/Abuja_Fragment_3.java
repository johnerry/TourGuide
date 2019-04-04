package com.example.johnfash.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Abuja_Fragment_3 extends Fragment {
    public ListView listView;
    public ListAdapter adapter;
    ArrayList<Model> arrayList = new ArrayList<Model>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_1, container, false);
        setHasOptionsMenu(true);
        listView = rootView.findViewById(R.id.FragmentOneList);
        arrayList.add(new Model("Millennium Park","Old Federal Secretariat, Durumi, Abuja",R.drawable.millenium_park,"geo:9.400347, 7.484587"));
        arrayList.add(new Model("Abuja Childrens Park And Zoo","Childrens Park And Zoo, Abuja",R.drawable.abuja_children_park,"geo:9.426564, 7.526341"));
        arrayList.add(new Model("Maxtivity - Family Entertainment Center","L 33, Lake View Estate, Jabi, Abuja",R.drawable.maxtivity,"geo:9.323423, 7.429171"));
        arrayList.add(new Model("Kado, Abuja","Julius Berger Water Front Park",R.drawable.julius_berger_water_front,"geo:9.400980, 7.498032"));
        arrayList.add(new Model("Monoliza Amusement Park","Central Business Dis, Abuja",R.drawable.monoliza,"geo:9.446121, 7.511896"));
        arrayList.add(new Model("The Trukadero Place","130 Ademola Adetokunbo Cres, Wuse, Abuja",R.drawable.trukadero_place,"geo:9.456511, 7.475888"));
        arrayList.add(new Model("Marshoria Arena","Plot C72, Road 52, off, Tai Solarin Ave, Gwarinpa Estate 900108, Abuja",R.drawable.marsharia,"geo:9.376839, 7.473791"));
        arrayList.add(new Model("Magic Land Abuja","Constitution Ave, Wuse, Abuja",R.drawable.margic_land,"geo:9.352172, 7.492765"));
        arrayList.add(new Model("Hilltop Life Camp","Jabi, Abuja",R.drawable.hilltop,"geo:9.322398, 7.401625"));
        arrayList.add(new Model("IBB Golf Club","41, Udi Hill Street, Off Aso Dr, Abuja",R.drawable.ibb,"geo:9.343968, 7.512969"));
        arrayList.add(new Model("Amusement Park","Pope John Paul II St, Maitama, Abuja",R.drawable.amusement_park,"geo:9.311038, 7.506091"));
        arrayList.add(new Model("The Dome","Plot 423 Adekunle Fajuyi Way, Central Business District, Abuja",R.drawable.the_dome,"geo:9.285177, 7.490012"));
        arrayList.add(new Model("Abuja National Stadium","Constitution Ave, Kukwaba 900211, Abuja",R.drawable.national_stadium_abuja,"geo:9.391299, 7.484362"));
        arrayList.add(new Model("Dunes Center","N44 Aguiyi Ironsi St, Maitama, Abuja",R.drawable.dunes_center,"geo:9.309164, 7.487260"));
        arrayList.add(new Model("Eagle Square","Phase 1, Abuja",R.drawable.eagles_square,"geo:9.315708, 7.461381"));

        adapter = new ListAdapter(getActivity(), arrayList);
        listView.setAdapter(adapter);
        return rootView;
    }
}
