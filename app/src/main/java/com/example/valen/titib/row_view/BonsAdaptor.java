package com.example.valen.titib.row_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.valen.titib.R;

import java.util.List;

import gestion.Bon;
import gestion.Groupe;

/**
 * Created by valen on 18/03/2016.
 */
public class BonsAdaptor extends ArrayAdapter<Bon>{

    public BonsAdaptor(Context context, List<Bon> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.rows_bons, parent, false);
        }

        BonsViewHolder viewHolder = (BonsViewHolder)convertView.getTag();

        //On reccupere les elements dans le view holder
        if(viewHolder == null){
            viewHolder = new BonsViewHolder();
            viewHolder.nom = (TextView)convertView.findViewById(R.id.nom);
            viewHolder.prix = (TextView)convertView.findViewById(R.id.prix);
            //On ajoute
            convertView.setTag(viewHolder);
        }

        Bon bon = getItem(position);

        //Remplissage des vues
        viewHolder.nom.setText(bon.getNom());
        viewHolder.prix.setText("" + bon.getPrix());

        return convertView;
    }

    private class BonsViewHolder{
        public TextView nom;
        public TextView prix;
    }

}
