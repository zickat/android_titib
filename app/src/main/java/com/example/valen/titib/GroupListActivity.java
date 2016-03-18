package com.example.valen.titib;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.valen.titib.row_view.GroupAdapter;

import java.util.ArrayList;
import java.util.List;

import gestion.Groupe;

public class GroupListActivity extends AppCompatActivity {

    String[] prenoms = new String[]{
            "Antoine", "Benoit", "Cyril", "David", "Eloise", "Florent",
            "Gerard", "Hugo", "Ingrid", "Jonathan", "Kevin", "Logan",
            "Mathieu", "Noemie", "Olivia", "Philippe", "Quentin", "Romain",
            "Sophie", "Tristan", "Ulric", "Vincent", "Willy", "Xavier",
            "Yann", "Zoé"
    };

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Mes Groupes");
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toCreationGroup();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = (ListView)findViewById(R.id.listView);

        GroupAdapter adapter = new GroupAdapter(this, genererGroupes());
        listView.setAdapter(adapter);
        listView.setClickable(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                toGroupe(parent, view, position, id);
            }
        });

    }

    private List<Groupe> genererGroupes(){
        List<Groupe> liste = new ArrayList<>();
        liste.add(new Groupe(0, "G0"));
        liste.add(new Groupe(1, "G1"));
        liste.add(new Groupe(2, "G2"));
        liste.add(new Groupe(3, "G3"));
        liste.add(new Groupe(4, "G4"));
        return liste;
    }

    private void toCreationGroup(){
        //TO DO creation groupe
        //Intent intent = new Intent(this, .class);
        //params : idPerso ? objet Serialize ?
        //startActivity(intent);
    }

    private void toGroupe(AdapterView<?> parent, View view, int position, long id){
        Groupe groupe = (Groupe)parent.getItemAtPosition(position);
        Intent intent = new Intent(this, GroupActivity.class);
        //intent.putExtra("idPers", idPers);
        //intent.putExtra("idGroupe", groupe.getId());
        startActivity(intent);
    }

}
