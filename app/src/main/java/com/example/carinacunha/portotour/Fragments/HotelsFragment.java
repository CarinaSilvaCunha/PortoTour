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

public class HotelsFragment extends Fragment {

    // Required empty public constructor
    public HotelsFragment() {
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        final View portoView = inflater.inflate(R.layout.layout_list, container, false);

        // Create an ArrayList which contains the Fragment objects
        final ArrayList<Porto> porto = new ArrayList<>();
        porto.add(new Porto((getString(R.string.portoLocalName09)), (getString(R.string.portoLocalSmallDescription09)),
                (getString(R.string.portoLocalDescription09)), (getString(R.string.portoLocalURL09)), (getString(R.string.portoLocalEmail09)),
                R.integer.portoLocalPhone01, (getString(R.string.portoLocalAddress09)), R.drawable.activities_09));

        porto.add(new Porto((getString(R.string.portoLocalName10)), (getString(R.string.portoLocalSmallDescription10)),
                (getString(R.string.portoLocalDescription10)), (getString(R.string.portoLocalURL10)), (getString(R.string.portoLocalEmail10)),
                R.integer.portoLocalPhone01, (getString(R.string.portoLocalAddress10)), R.drawable.activities_10));

        porto.add(new Porto((getString(R.string.portoLocalName11)), (getString(R.string.portoLocalSmallDescription11)),
                (getString(R.string.portoLocalDescription11)), (getString(R.string.portoLocalURL11)), (getString(R.string.portoLocalEmail11)),
                R.integer.portoLocalPhone01, (getString(R.string.portoLocalAddress11)), R.drawable.activities_11));

        porto.add(new Porto((getString(R.string.portoLocalName12)), (getString(R.string.portoLocalSmallDescription12)),
                (getString(R.string.portoLocalDescription12)), (getString(R.string.portoLocalURL12)), (getString(R.string.portoLocalEmail12)),
                R.integer.portoLocalPhone01, (getString(R.string.portoLocalAddress12)), R.drawable.activities_12));

        // Connect with {@link portoAdapter}, so it creates the list correctly
        PortoAdapter portoAdapter = new PortoAdapter(getActivity(), porto);

        // Pass the Id of the list
        ListView portoListView = portoView.findViewById(R.id.porto_layout_list);

        // Connect Listview with the portoAdapter
        portoListView.setAdapter(portoAdapter);

        return portoView;
    }

}