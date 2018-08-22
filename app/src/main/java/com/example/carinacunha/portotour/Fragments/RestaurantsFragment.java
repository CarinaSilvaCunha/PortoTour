package com.example.carinacunha.portotour.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.carinacunha.portotour.Porto.Porto;
import com.example.carinacunha.portotour.Porto.PortoAdapter;
import com.example.carinacunha.portotour.R;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    // Required empty public constructor
    public RestaurantsFragment() {
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        final View portoView = inflater.inflate(R.layout.layout_list, container, false);

        // Create an ArrayList which contains the Fragment objects
        final ArrayList<Porto> porto = new ArrayList<>();
        porto.add(new Porto((getString(R.string.portoLocalName13)), (getString(R.string.portoLocalSmallDescription13)),
                (getString(R.string.portoLocalDescription13)), (getString(R.string.portoLocalURL13)), (getString(R.string.portoLocalEmail13)),
                R.integer.portoLocalPhone01, (getString(R.string.portoLocalAddress13)), R.drawable.activities_13));

        porto.add(new Porto((getString(R.string.portoLocalName14)), (getString(R.string.portoLocalSmallDescription14)),
                (getString(R.string.portoLocalDescription14)), (getString(R.string.portoLocalURL14)), (getString(R.string.portoLocalEmail14)),
                R.integer.portoLocalPhone01, (getString(R.string.portoLocalAddress14)), R.drawable.activities_14));

        porto.add(new Porto((getString(R.string.portoLocalName15)), (getString(R.string.portoLocalSmallDescription15)),
                (getString(R.string.portoLocalDescription15)), (getString(R.string.portoLocalURL15)), (getString(R.string.portoLocalEmail15)),
                R.integer.portoLocalPhone01, (getString(R.string.portoLocalAddress15)), R.drawable.activities_15));

        porto.add(new Porto((getString(R.string.portoLocalName16)), (getString(R.string.portoLocalSmallDescription16)),
                (getString(R.string.portoLocalDescription16)), (getString(R.string.portoLocalURL16)), (getString(R.string.portoLocalEmail16)),
                R.integer.portoLocalPhone01, (getString(R.string.portoLocalAddress16)), R.drawable.activities_16));

        // Connect with {@link portoAdapter}, so it creates the list correctly
        PortoAdapter portoAdapter = new PortoAdapter(getActivity(), porto);

        // Pass the Id of the list
        ListView portoListView = portoView.findViewById(R.id.porto_layout_list);

        // Connect Listview with the portoAdapter
        portoListView.setAdapter(portoAdapter);

        return portoView;
    }

}