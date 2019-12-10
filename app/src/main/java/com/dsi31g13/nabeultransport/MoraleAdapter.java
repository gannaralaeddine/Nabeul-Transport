package com.dsi31g13.nabeultransport;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class MoraleAdapter extends ArrayAdapter <Morale>
{
    public MoraleAdapter(Context context , List<Morale> objects)
    {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position , View convertView, ViewGroup parent)
    {
        if (convertView == null)
        {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.morale_items, parent, false);
        }

        TextView nomsocial = convertView.findViewById(R.id.nomsocialTextView);
        TextView idFiscale = convertView.findViewById(R.id.idFiscaleTextView);
        TextView accompagnant = convertView.findViewById(R.id.accompagnantTextView);
        TextView cinMorale = convertView.findViewById(R.id.cinMoraleTextView);

        TextView busType = convertView.findViewById(R.id.busTypeTextView);
        TextView nbVoyageurs = convertView.findViewById(R.id.nbVoyageursTextView);
        TextView causeLoc = convertView.findViewById(R.id.causeLocTextView);
        TextView progVoyage = convertView.findViewById(R.id.progVoyageTextView);

        TextView dateDep = convertView.findViewById(R.id.dateDepTextView);
        TextView heureDep = convertView.findViewById(R.id.heureDepTextView);
        TextView lieuDep = convertView.findViewById(R.id.lieuDepTextView);
        TextView dateArr = convertView.findViewById(R.id.dateArrTextView);
        TextView heureArr = convertView.findViewById(R.id.heureArrTextView);

        Morale currentDemande = getItem(position);

        nomsocial.setText(currentDemande.getmSociale());
        idFiscale.setText(currentDemande.getmIdFiscale());
        accompagnant.setText(currentDemande.getmAccompagnant());
        cinMorale.setText(currentDemande.getmCinMorale());

        busType.setText(currentDemande.getmTypeBus());
        nbVoyageurs.setText(currentDemande.getmNombreVoyageurs());
        causeLoc.setText(currentDemande.getmCauseLocation());
        progVoyage.setText(currentDemande.getmProgVoyage());

        dateDep.setText(currentDemande.getmDateDepart());
        heureDep.setText(currentDemande.getmHeureDepart());
        lieuDep.setText(currentDemande.getmLieuDepart());
        dateArr.setText(currentDemande.getmDateArrivee());
        heureArr.setText(currentDemande.getmHeureArrivee());

        return convertView;

    }
}
