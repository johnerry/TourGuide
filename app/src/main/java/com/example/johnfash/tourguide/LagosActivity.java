package com.example.johnfash.tourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class LagosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagos);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Lagos");
        ViewPager viewPager = findViewById(R.id.viewpager);
        MyFragmentPagerAdapter2 adapter = new MyFragmentPagerAdapter2(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
}

class MyFragmentPagerAdapter2 extends FragmentPagerAdapter {
    private String tabTitles[] = new String[] {"Accommodation", "Restaurant", "Attraction" };

    public MyFragmentPagerAdapter2(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Lagos_Fragment_1();
        } else if (position == 1){
            return new Lagos_Fragment_2();
        } else {
            return new Lagos_Fragment_3();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
