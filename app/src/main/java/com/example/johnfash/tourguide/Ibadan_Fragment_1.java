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

public class Ibadan_Fragment_1 extends Fragment {
    public ListView listView;
    public ListAdapter adapter;
    ArrayList<Model> arrayList = new ArrayList<Model>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_1, container, false);
        setHasOptionsMenu(true);
        listView = rootView.findViewById(R.id.FragmentOneList);
        arrayList.add(new Model("Owu Crown Hotel Ibadan","2 Iwo Rd, Iwo Road 200224, Ibadan",R.drawable.owu,"geo:7.513781, 3.950389"));
        arrayList.add(new Model("Carlton Gate Xclusive Hotel","Quarters 860, Total Garden Road Agodi, GRA, Ibadan",R.drawable.carlton_gate,"geo:7.529136, 3.910705"));
        arrayList.add(new Model("Palms 77 Hotel","Agboji, Ikolaba, Agodi Gra, Agodi, Ibadan",R.drawable.palms_hotel,"geo:7.518244, 3.912560"));
        arrayList.add(new Model("His Grace Hotel","Plot 1 Aare Ave, Ibadan",R.drawable.his_grace,"geo:7.523689, 3.911145"));
        arrayList.add(new Model("Koltol Paradise Inn","Opp BCOS Oluwokekere Street, Basorun Rd, Ibadan",R.drawable.koltol,"geo:7.529141, 3.907361"));
        arrayList.add(new Model("Premier Hotel","Oremeji Court, Mokola Hill, Ibadan",R.drawable.premier_hotel,"geo:7.529143, 3.886847"));
        arrayList.add(new Model("Orchard Hotel","Onireke Quarters Rd, Ibadan",R.drawable.orchard,"geo:7.572371, 3.907008"));
        arrayList.add(new Model("la maison Hotel","23 Jibowu Cres, New Gra, Ibadan",R.drawable.la_maison,"geo:7.506920, 3.878140"));
        arrayList.add(new Model("Labod Hotel","55 Awolowo Road, Mokola Hill, Ibadan",R.drawable.labod,"geo:7.550924, 3.910809"));
        arrayList.add(new Model("Nest Spa & Suites","Plot 807, Oba Abimbola Way, Agodi Gra, Ibadan",R.drawable.nest_spa,"geo:7.518241, 3.911842"));
        arrayList.add(new Model("Peak Court Hotel","Alabiyamo Street, Ibadan",R.drawable.peak_hotel,"geo:7.550929, 3.900554"));
        arrayList.add(new Model("ABK Elegance Hotel & Suites","Plot 809, Oba GRA,, Abimbola Street, Ibadan",R.drawable.abk_hotel,"geo:7.534586, 3.905212"));
        arrayList.add(new Model("Motel Liberty","SW8 / 1546, Liberty Rd, Ibadan",R.drawable.motel_liberty,"geo:7.474197, 3.868452"));
        arrayList.add(new Model("Best Western Plus Ibadan","25 Jibowu Cres, GRA, Ibadan",R.drawable.wester_plus,"geo:7.496013, 3.872634"));



        adapter = new ListAdapter(getActivity(), arrayList);
        listView.setAdapter(adapter);
        return rootView;
    }
}
