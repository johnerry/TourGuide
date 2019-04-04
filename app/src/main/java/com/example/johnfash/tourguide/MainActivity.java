package com.example.johnfash.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout lagos, abuja, ibadan, portHarcourt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        lagos = findViewById(R.id.lagos);
        abuja = findViewById(R.id.abuja);
        ibadan = findViewById(R.id.ibadan);

        lagos.setOnClickListener(onLayoutClick);
        abuja.setOnClickListener(onLayoutClick);
        ibadan.setOnClickListener(onLayoutClick);
    }

    private View.OnClickListener onLayoutClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.lagos: {
                    Intent change = new Intent(MainActivity.this, LagosActivity.class);
                    startActivity(change);
                    break;
                }
                case R.id.abuja: {
                    Intent change = new Intent(MainActivity.this, AbujaActivity.class);
                    startActivity(change);
                    break;
                }
                case R.id.ibadan: {
                    Intent change = new Intent(MainActivity.this, IbadanActivity.class);
                    startActivity(change);
                    break;
                }
            }
        }
    };
}
