package com.example.valen.titib;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.valen.titib.row_view.BonsAdaptor;

import java.util.ArrayList;
import java.util.List;

import gestion.Bon;


/**
 * A simple {@link Fragment} subclass.
 */
public class BonsFragment extends Fragment {


    private ListView listView;

    public BonsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bons, container, false);

        listView = (ListView)view.findViewById(R.id.listView2);

        BonsAdaptor adapter = new BonsAdaptor(container.getContext(), genererBons());
        listView.setAdapter(adapter);
        listView.setClickable(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                toBon(parent, view, position, id);
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

    private void toBon(AdapterView<?> parent, View view, int position, long id) {

    }

    private List<Bon> genererBons(){
        List<Bon> list = new ArrayList<>();
        list.add(new Bon("B1", 100));
        list.add(new Bon("B2", 300));
        list.add(new Bon("B3", 10));
        list.add(new Bon("B4", 400));
        return list;
    }

}
