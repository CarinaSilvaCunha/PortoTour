package com.example.carinacunha.portotour;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.carinacunha.portotour.Porto.PortoPagerAdapter;

public class PortoActivity extends AppCompatActivity {

    // Get the real App Layout
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.porto_layout);

        // Attach the ViewPager view to the porto_layout
        ViewPager portoViewPager = findViewById(R.id.portoViewPager);

        // Link the Porto Page Adapter with the ViewPager
        PortoPagerAdapter portoAdapter = new PortoPagerAdapter(getSupportFragmentManager(), this);
        portoViewPager.setAdapter(portoAdapter);

        //Set the TabLayout for the ViewPager
        TabLayout portoTabs = findViewById(R.id.portoTabLayout);
        portoTabs.setupWithViewPager(portoViewPager);
        portoTabs.setTabMode(TabLayout.MODE_SCROLLABLE);
    }
}