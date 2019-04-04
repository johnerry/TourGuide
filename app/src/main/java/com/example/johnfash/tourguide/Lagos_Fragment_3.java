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

public class Lagos_Fragment_3 extends Fragment {
    public ListView listView;
    public ListAdapter adapter;
    ArrayList<Model> arrayList = new ArrayList<Model>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_1, container, false);
        setHasOptionsMenu(true);
        listView = rootView.findViewById(R.id.FragmentOneList);
        arrayList.add(new Model("Snake Island","Amuwo Odofin, Lagos",R.drawable.snake_island,"geo:6.424250, 3.293762"));
        arrayList.add(new Model("Freedom Park","Broad St, Lagos Island, Lagos",R.drawable.freedom_pack,"geo:6.448987, 3.396473"));
        arrayList.add(new Model("Tafawa Balewa Square","45/57 Massey Bamgboshe Street, Lagos Island, Lagos",R.drawable.tafawa_balewa,"geo:6.445515, 3.401557"));
        arrayList.add(new Model("Fela's Shrine Ikeja","12A Adeleke St, Allen, Ikeja",R.drawable.fela,"geo:6.601884, 3.351495"));
        arrayList.add(new Model("Nigerian National Museum","Onikan Rd, Ikoyi, Lagos",R.drawable.nigeria_museum,"geo:6.444295, 3.403654"));
        arrayList.add(new Model("City Hall Lagos Island","Catholic Mission St, Lagos Island, Lagos",R.drawable.city_hall,"geo:6.451243, 3.397436"));
        arrayList.add(new Model("Boomskysmoothies","17 Taoridi St, Iganmu 101001, Lagos",R.drawable.boomskysmoothies,"geo:6.489310, 3.347256"));
        arrayList.add(new Model("Kids Beach Garden"," 3rd Roundabout Opp, Oba Elegushi Beach Rd, Lekki",R.drawable.kids_beach_garden,"geo:6.422910, 3.480393"));
        arrayList.add(new Model("Elegushi Royal Beach Lekki Phase I Lagos","Rd 3, Lekki Phase I, Lekki",R.drawable.elegusi,"geo:6.422207, 3.486608"));
        arrayList.add(new Model("Lekki Leisure Lake","Eti-Osa, Lagos",R.drawable.lekki_lake,"geo:6.424365, 3.462019"));
        arrayList.add(new Model("National Arts Theatre","ganmu, Lagos",R.drawable.national_theatre,"geo:6.476582, 3.369363"));
        arrayList.add(new Model("Palms Shopping Mall","1 Bisway St, Maroko, Lagos",R.drawable.palms_mall,"geo:6.435518, 3.451575"));
        arrayList.add(new Model("Bay Lounge","Block 12A, 10 Admiralty Rd, Lekki Phase 1, Lagos",R.drawable.bay_louge,"geo:6.454890, 3.470029"));
        arrayList.add(new Model("GET Arena","Plot 6 Abila, Oniru Rd, Ikoyi, Lagos",R.drawable.get_arena,"geo:6.434726, 3.444998"));
        arrayList.add(new Model("Club Quilox","873 Ozumba Mbadiwe Rd, Victoria Island, Lagos",R.drawable.club_quilox,"geo:6.438043, 3.438064"));
        adapter = new ListAdapter(getActivity(), arrayList);
        listView.setAdapter(adapter);
        return rootView;
    }
}
