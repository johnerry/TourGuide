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

public class Ibadan_Fragment_2 extends Fragment {
    public ListView listView;
    public ListAdapter adapter;
    ArrayList<Model> arrayList = new ArrayList<Model>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_1, container, false);
        setHasOptionsMenu(true);
        listView = rootView.findViewById(R.id.FragmentOneList);
        arrayList.add(new Model("Wimpy Ibadan","Onireke Rd, Ibadan",R.drawable.wimpy,"geo:7.528739, 3.879479"));
        arrayList.add(new Model("Zen Restaurant","Premium House, Beside First Bank, Magazine Rd, Jericho, Ibadan",R.drawable.zen,"geo:7.528736, 3.888722"));
        arrayList.add(new Model("Ultima Executive Restaurant","NITEL Building, Customs Way, Customs, Bodija, Ibadan",R.drawable.ultimate_restaurant,"geo:7.501899, 3.911877"));
        arrayList.add(new Model("Ose Olohun Food Canteen","U.I Road, Bodija, Ibadan",R.drawable.olohun,"geo:7.529141, 3.900104"));
        arrayList.add(new Model("Mama Soji Restaurant","Eleyele, Ibadan",R.drawable.soji,"geo:7.550559, 3.872232"));
        arrayList.add(new Model("Kokodome","Liebu Bypass, Ibadan",R.drawable.kokdome,"geo:7.501467, 3.873965"));
        arrayList.add(new Model("Domino's Pizza Bodija","36 Awolowo Ave, Ibadan",R.drawable.domino_pizza,"geo:7.540036, 3.897024"));
        arrayList.add(new Model("Jàde's Cuisine","Queen Elizabeth I I Road, Mokola Hill, Ibadan",R.drawable.jade_cuisine,"geo:7.485552, 3.913966"));
        arrayList.add(new Model("Marthas Kitchen","129 railway side lane, Magazine Rd, Jericho, Ibadan",R.drawable.marthas,"geo:7.496014, 3.866705"));
        arrayList.add(new Model("Domino's Pizza Ring Road","6 MKO Abiola Way, Oluyole, Ibadan",R.drawable.domino_pizza_ring_road,"geo:7.490560, 3.867498"));
        arrayList.add(new Model("Ultima Executive Restaurant & Lounge","New Gra, Ibadan",R.drawable.ultimate_restaurant_and_louge,"geo:7.496017, 3.857463"));
        arrayList.add(new Model("Klazz Restaurant","TEDDER HALL, University of Ibadan, Ibadan",R.drawable.klazz,"geo:7.512784, 3.950427"));
        arrayList.add(new Model("Aroma Iwo Road Ibadan","Iwo Road, Ibadan",R.drawable.aromo,"geo:7.518246, 3.915161"));
        arrayList.add(new Model("Café Chrysalis","23 Ilaro St, Ibadan",R.drawable.chrysalis,"geo:7.550926, 3.906721"));
        arrayList.add(new Model("Mr Biggs","Iwo Rd, Iwo Road, Ibadan",R.drawable.mr_bigs,"geo:7.501899, 3.923910"));

        adapter = new ListAdapter(getActivity(), arrayList);
        listView.setAdapter(adapter);
        return rootView;
    }
}
