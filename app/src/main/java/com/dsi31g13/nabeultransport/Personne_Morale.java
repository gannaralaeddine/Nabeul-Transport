package com.dsi31g13.nabeultransport;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * A simple {@link Fragment} subclass.
 * */
public class Personne_Morale extends Fragment
{
    private EditText mNomSocial, mIdFiscale, mAccompagnant, meditCin, meditTypeBus, meditNbVoyageur, meditCauseLocation, meditProgrammeVoyage,
            meditDateDepart, meditHeureDepart, meditLieuDepart, meditDateArrivee, meditHeureArrivee;

    //Firebase instance variables
    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference mMessagesDatabaseReference;

    public Personne_Morale() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_personne__morale, container, false);

        // Initialize Firebase components
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mMessagesDatabaseReference = mFirebaseDatabase.getReference().child(MainActivity.Uid + "/Personne Morale");

        mNomSocial = view.findViewById(R.id.editNomSocial);
        mIdFiscale = view.findViewById(R.id.editIdFiscale);
        mAccompagnant = view.findViewById(R.id.editAccompagnant);
        meditCin = view.findViewById(R.id.editCin);
        meditTypeBus = view.findViewById(R.id.editTypeBus);
        meditNbVoyageur = view.findViewById(R.id.editNbVoyageur);
        meditCauseLocation =  view.findViewById(R.id.editCauseLocation);
        meditProgrammeVoyage = view.findViewById(R.id.editProgrammeVoyage);
        meditDateDepart = view.findViewById(R.id.editDateDepart);
        meditHeureDepart = view.findViewById(R.id.editHeureDepart);
        meditLieuDepart = view.findViewById(R.id.editLieuDepart);
        meditDateArrivee = view.findViewById(R.id.editDateArrivee);
        meditHeureArrivee = view.findViewById(R.id.editHeureArrivee);

        view.findViewById(R.id.Confirmer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mNomSocial.getText().toString().length() == 0)
                {
                    Toast.makeText(getActivity() , "vérifier champs Nom Social", Toast.LENGTH_SHORT).show();
                    mNomSocial.requestFocus();
                    InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
                }
                else    if (mIdFiscale.getText().toString().length() == 0)
                {
                    Toast.makeText(getActivity() , "vérifier champs N° d'identification fiscale", Toast.LENGTH_SHORT).show();
                    mIdFiscale.requestFocus();
                    InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
                }
                else    if (mAccompagnant.getText().toString().length() == 0)
                {
                    Toast.makeText(getActivity() , "vérifier champs N° d'identification fiscale", Toast.LENGTH_SHORT).show();
                    mAccompagnant.requestFocus();
                    InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
                }
                else if ((meditCin.getText().toString().length() <8) || (meditCin.getText().toString().length() == 0))
                {
                    Toast.makeText(getActivity() , "vérifier champs CIN", Toast.LENGTH_SHORT).show();
                    meditCin.requestFocus();
                    InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
                }
                else    if (meditTypeBus.getText().toString().length() == 0)
                {
                    Toast.makeText(getActivity() , "vérifier champs N° d'identification fiscale", Toast.LENGTH_SHORT).show();
                    meditTypeBus.requestFocus();
                    InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
                }
                else    if (meditNbVoyageur.getText().toString().length() == 0)
                {
                    Toast.makeText(getActivity() , "vérifier champs N° d'identification fiscale", Toast.LENGTH_SHORT).show();
                    meditNbVoyageur.requestFocus();
                    InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
                }
                else    if (meditCauseLocation.getText().toString().length() == 0)
                {
                    Toast.makeText(getActivity() , "vérifier champs N° d'identification fiscale", Toast.LENGTH_SHORT).show();
                    meditCauseLocation.requestFocus();
                    InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
                }
                else    if (meditProgrammeVoyage.getText().toString().length() == 0)
                {
                    Toast.makeText(getActivity() , "vérifier champs N° d'identification fiscale", Toast.LENGTH_SHORT).show();
                    meditProgrammeVoyage.requestFocus();
                    InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
                }
                else    if (meditDateDepart.getText().toString().length() == 0)
                {
                    Toast.makeText(getActivity() , "vérifier champs N° d'identification fiscale", Toast.LENGTH_SHORT).show();
                    meditDateDepart.requestFocus();
                    InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
                }
                else    if (meditHeureDepart.getText().toString().length() == 0)
                {
                    Toast.makeText(getActivity() , "vérifier champs N° d'identification fiscale", Toast.LENGTH_SHORT).show();
                    meditHeureDepart.requestFocus();
                    InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
                }
                else    if (meditLieuDepart.getText().toString().length() == 0)
                {
                    Toast.makeText(getActivity() , "vérifier champs N° d'identification fiscale", Toast.LENGTH_SHORT).show();
                    meditLieuDepart.requestFocus();
                    InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
                }
                else    if (meditDateArrivee.getText().toString().length() == 0)
                {
                    Toast.makeText(getActivity() , "vérifier champs N° d'identification fiscale", Toast.LENGTH_SHORT).show();
                    meditDateArrivee.requestFocus();
                    InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
                }
                else    if (meditHeureArrivee.getText().toString().length() == 0)
                {
                    Toast.makeText(getActivity() , "vérifier champs N° d'identification fiscale", Toast.LENGTH_SHORT).show();
                    meditHeureArrivee.requestFocus();
                    InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
                }
                else
                {
                    Morale morale = new Morale(mNomSocial.getText().toString(), mIdFiscale.getText().toString(), mAccompagnant.getText().toString(),
                            meditCin.getText().toString(), meditTypeBus.getText().toString(), meditNbVoyageur.getText().toString(),
                            meditCauseLocation.getText().toString(), meditProgrammeVoyage.getText().toString(), meditDateDepart.getText().toString(),
                            meditHeureDepart.getText().toString(), meditLieuDepart.getText().toString(), meditDateArrivee.getText().toString(),
                            meditHeureArrivee.getText().toString());

                    mMessagesDatabaseReference.push().setValue(morale);

                    Toast.makeText(getActivity(), "Votre demande a été bien enregistré", Toast.LENGTH_SHORT).show();

                    mNomSocial.setText("");
                    mIdFiscale.setText("");
                    mAccompagnant.setText("");
                    meditCin.setText("");
                    meditTypeBus.setText("");
                    meditNbVoyageur.setText("");
                    meditCauseLocation.setText("");
                    meditProgrammeVoyage.setText("");
                    meditDateDepart.setText("");
                    meditHeureDepart.setText("");
                    meditLieuDepart.setText("");
                    meditDateArrivee.setText("");
                    meditHeureArrivee.setText("");
                }
            }
        });
        return view;
    }
}