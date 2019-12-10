package com.dsi31g13.nabeultransport;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class PhysiqueAdapter extends ArrayAdapter <Physique>
{
    public PhysiqueAdapter( Context context,  List<Physique> objects)
    {
        super(context, 0 , objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if (convertView == null)
        {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.physique_items, parent, false);
        }

        TextView cinPhysique = convertView.findViewById(R.id.cinTextView);
        TextView nom = convertView.findViewById(R.id.nomTextView);
        TextView prenom = convertView.findViewById(R.id.prenomTextView);
        TextView adresse = convertView.findViewById(R.id.adresseTextView);

        Physique currentDemande = getItem(position);

        cinPhysique.setText(currentDemande.getmCinPhysique());
        nom.setText(currentDemande.getmNom());
        prenom.setText(currentDemande.getmPrenom());
        adresse.setText(currentDemande.getmAdresse());

        return convertView;
    }
}
