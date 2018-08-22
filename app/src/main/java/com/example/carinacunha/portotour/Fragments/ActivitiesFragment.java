package com.example.carinacunha.portotour.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.carinacunha.portotour.R;
import com.example.carinacunha.portotour.Porto.Porto;
import com.example.carinacunha.portotour.Porto.PortoAdapter;

import java.util.ArrayList;

public class ActivitiesFragment extends Fragment {

    // Required empty public constructor
    public ActivitiesFragment() {
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        final View portoView = inflater.inflate(R.layout.layout_list, container, false);

        // Create an ArrayList which contains the Fragment objects
        final ArrayList<Porto> porto = new ArrayList<>();
        porto.add(new Porto((getString(R.string.portoLocalName01)), (getString(R.string.portoLocalSmallDescription01)),
                (getString(R.string.portoLocalDescription01)), (getString(R.string.portoLocalURL01)), (getString(R.string.portoLocalEmail01)),
                R.integer.portoLocalPhone01, (getString(R.string.portoLocalAddress01)), R.drawable.activities_01));

        porto.add(new Porto((getString(R.string.portoLocalName02)), (getString(R.string.portoLocalSmallDescription02)),
                (getString(R.string.portoLocalDescription02)), (getString(R.string.portoLocalURL02)), (getString(R.string.portoLocalEmail02)),
                R.integer.portoLocalPhone01, (getString(R.string.portoLocalAddress02)), R.drawable.activities_02));

        porto.add(new Porto((getString(R.string.portoLocalName03)), (getString(R.string.portoLocalSmallDescription03)),
                (getString(R.string.portoLocalDescription03)), (getString(R.string.portoLocalURL03)), (getString(R.string.portoLocalEmail03)),
                R.integer.portoLocalPhone01, (getString(R.string.portoLocalAddress03)), R.drawable.activities_03));

        porto.add(new Porto((getString(R.string.portoLocalName04)), (getString(R.string.portoLocalSmallDescription04)),
                (getString(R.string.portoLocalDescription04)), (getString(R.string.portoLocalURL04)), (getString(R.string.portoLocalEmail04)),
                R.integer.portoLocalPhone01, (getString(R.string.portoLocalAddress04)), R.drawable.activities_04));

        // Connect with {@link portoAdapter}, so it creates the list correctly
        PortoAdapter portoAdapter = new PortoAdapter(getActivity(), porto);

        // Pass the Id of the list
        ListView portoListView = portoView.findViewById(R.id.porto_layout_list);

        // Connect Listview with the portoAdapter
        portoListView.setAdapter(portoAdapter);

        return portoView;
    }

}
