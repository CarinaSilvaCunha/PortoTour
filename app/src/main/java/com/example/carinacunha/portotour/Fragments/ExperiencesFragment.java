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

public class ExperiencesFragment extends Fragment {

    // Required empty public constructor
    public ExperiencesFragment() {
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        final View portoView = inflater.inflate(R.layout.layout_list, container, false);

        // Create an ArrayList which contains the Fragment objects
        final ArrayList<Porto> porto = new ArrayList<>();
        porto.add(new Porto((getString(R.string.portoLocalName05)), (getString(R.string.portoLocalSmallDescription05)),
                (getString(R.string.portoLocalDescription05)), (getString(R.string.portoLocalURL05)), (getString(R.string.portoLocalEmail05)),
                R.integer.portoLocalPhone01, (getString(R.string.portoLocalAddress05)), R.drawable.activities_05));

        porto.add(new Porto((getString(R.string.portoLocalName06)), (getString(R.string.portoLocalSmallDescription06)),
                (getString(R.string.portoLocalDescription06)), (getString(R.string.portoLocalURL06)), (getString(R.string.portoLocalEmail06)),
                R.integer.portoLocalPhone01, (getString(R.string.portoLocalAddress06)), R.drawable.activities_06));

        porto.add(new Porto((getString(R.string.portoLocalName07)), (getString(R.string.portoLocalSmallDescription07)),
                (getString(R.string.portoLocalDescription07)), (getString(R.string.portoLocalURL07)), (getString(R.string.portoLocalEmail07)),
                R.integer.portoLocalPhone01, (getString(R.string.portoLocalAddress07)), R.drawable.activities_07));

        porto.add(new Porto((getString(R.string.portoLocalName08)), (getString(R.string.portoLocalSmallDescription08)),
                (getString(R.string.portoLocalDescription08)), (getString(R.string.portoLocalURL08)), (getString(R.string.portoLocalEmail08)),
                R.integer.portoLocalPhone01, (getString(R.string.portoLocalAddress08)), R.drawable.activities_08));

        // Connect with {@link portoAdapter}, so it creates the list correctly
        PortoAdapter portoAdapter = new PortoAdapter(getActivity(), porto);

        // Pass the Id of the list
        ListView portoListView = portoView.findViewById(R.id.porto_layout_list);

        // Connect Listview with the portoAdapter
        portoListView.setAdapter(portoAdapter);

        return portoView;
    }

}