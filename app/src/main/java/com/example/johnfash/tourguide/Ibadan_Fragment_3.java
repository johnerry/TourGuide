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
import android.widget.SearchView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class Ibadan_Fragment_3 extends Fragment {
    public ListView listView;
    public ListAdapter adapter;
    ArrayList<Model> arrayList = new ArrayList<Model>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_1, container, false);
        setHasOptionsMenu(true);
        listView = rootView.findViewById(R.id.FragmentOneList);
        arrayList.add(new Model("Agodi Gardens","Secretariat Rd, Mokola Hill, Ibadan",R.drawable.agodi,"geo:7.469070, 3.904294"));
        arrayList.add(new Model("Mapo Hall","Old Quarter, Ibadan",R.drawable.mapo_hall,"geo:7.418750, 3.895537"));
        arrayList.add(new Model("The Ventura Mall","Agodi Gra, Ibadan",R.drawable.ventura_mall,"geo:7.486480, 3.899212"));
        arrayList.add(new Model("Obafemi Awolowo Stadium","New Gra, Ibadan",R.drawable.awolowo_statium,"geo:7.406932, 3.875794"));
        arrayList.add(new Model("Trans-Amusement Park","Old airport bodija ibadan. Aba-Alfa Ibadan",R.drawable.trans_park,"geo:7.463543, 3.911529"));
        arrayList.add(new Model("Tree Club Park","Onireke Rd, Ibadan",R.drawable.tree_club,"geo:7.557222, 3.882021"));
        arrayList.add(new Model("National Library of Nigeria, Ibadan","",R.drawable.national_library,"geo:7.485106, 3.867129"));
        arrayList.add(new Model("Moniya Motor Park","Balogun Area, Moniya Road, Ibadan",R.drawable.moniya,"geo:7.659882, 3.910368"));
        arrayList.add(new Model("","Heritage Mall, Dugbe, Ibadan",R.drawable.dugbe,"geo:7.556009, 3.895996"));
        arrayList.add(new Model("Kakanfo Conference Center","1 Nihinlola Street, New Gra, Ibadan",R.drawable.kakafo_center,"geo:7.431353, 3.859986"));
        arrayList.add(new Model("National Museum of Unity","Jericho, Ibadan",R.drawable.unity_museum,"geo:7.400440, 3.869865"));
        arrayList.add(new Model("Hi-Impact Planet","km 12, Lagos - Ibadan Expy, Ibafo",R.drawable.hi_impact,"geo:6.874454, 3.409047"));
        arrayList.add(new Model("Ibadan Solidarity House","Oyo Road, New Gra, Ibadan",R.drawable.solidarity_house,"geo:7.490560, 3.867132"));
        arrayList.add(new Model("Palms Shopping Mall Ibadan","New Gra, Ibadan",R.drawable.palms_mall_ibadan,"geo:7.506917, 3.890468"));
        arrayList.add(new Model("Cocoa House Building, Dugbe","Cocoa House, Liebu Bypass, Waroaden Street, Ibadan",R.drawable.cocoa_house,"geo:7.534186, 3.906985"));

        adapter = new ListAdapter(getActivity(), arrayList);
        listView.setAdapter(adapter);
        return rootView;
    }
}
