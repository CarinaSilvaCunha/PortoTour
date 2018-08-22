package com.example.carinacunha.portotour.Porto;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.carinacunha.portotour.Fragments.ActivitiesFragment;
import com.example.carinacunha.portotour.Fragments.ExperiencesFragment;
import com.example.carinacunha.portotour.Fragments.HotelsFragment;
import com.example.carinacunha.portotour.Fragments.RestaurantsFragment;
import com.example.carinacunha.portotour.R;

public class PortoPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    // This is the constructor for the ViewPager Adapter
    public PortoPagerAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        this.context = context;
    }

    // Gets the number of fragments available to be displayed
    @Override
    public int getCount() {
        return 4;
    }

    // Gives the Fragments needed to ViewPager
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ExperiencesFragment();
        } else if (position == 1) {
            return new HotelsFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new ActivitiesFragment();
        }
    }

    // Gives the titles of the tabs to TabLayout
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.experiences_tab);
        } else if (position == 1) {
            return context.getString(R.string.hotels_tab);
        } else if (position == 2) {
            return context.getString(R.string.restaurants_tab);
        } else {
            return context.getString(R.string.activities_tab);
        }
    }
}
