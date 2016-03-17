package com.example.valen.titib.row_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.valen.titib.R;

import java.util.List;

import gestion.Groupe;

/**
 * Created by valen on 17/03/2016.
 */
public class GroupAdapter extends ArrayAdapter<Groupe>{

    public GroupAdapter(Context context, List<Groupe> groupes){
        super(context, 0, groupes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.rows_groupes, parent, false);
        }

        GroupViewHolder viewHolder = (GroupViewHolder)convertView.getTag();

        //On reccupere les elements dans le view holder
        if(viewHolder == null){
            viewHolder = new GroupViewHolder();
            viewHolder.nom = (TextView)convertView.findViewById(R.id.nom);
            viewHolder.id = (TextView)convertView.findViewById(R.id.id);
            //On ajoute
            convertView.setTag(viewHolder);
        }

        Groupe groupe = getItem(position);

        //Remplissage des vues
        viewHolder.nom.setText(groupe.getNom());
        viewHolder.id.setText(""+groupe.getId());

        return convertView;
    }

    private class GroupViewHolder {
        public TextView id;
        public TextView nom;
    }

}
