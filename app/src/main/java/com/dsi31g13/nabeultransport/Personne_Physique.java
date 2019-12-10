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
 */
public class Personne_Physique extends Fragment
{
    private EditText mCinPhysique;
    private EditText mNom;
    private EditText mPrenom;
    private EditText mAdresse;

    //Firebase instance variables
    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference mDatabaseReference;


    public Personne_Physique() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_personne__physique, container, false);

        // Initialize Firebase components
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mDatabaseReference = mFirebaseDatabase.getReference().child(MainActivity.Uid + "/Personne Physique");

        // Initialize views
        mCinPhysique = view.findViewById(R.id.editCin);
        mNom = view.findViewById(R.id.editNom);
        mPrenom = view.findViewById(R.id.editPrenom);
        mAdresse = view.findViewById(R.id.editAdresse);

        view.findViewById(R.id.btnConfirmer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((mCinPhysique.getText().toString().length() <8) || (mCinPhysique.getText().toString().length() == 0))
                {
                    Toast.makeText(getActivity() , "vérifier champs CIN", Toast.LENGTH_SHORT).show();
                    mCinPhysique.requestFocus();
                    InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
                }
                else if (mNom.getText().toString().length() == 0)
                {
                    Toast.makeText(getActivity() , "vérifier champs Nom", Toast.LENGTH_SHORT).show();
                    mNom.requestFocus();
                    InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
                }
                else if (mPrenom.getText().toString().length() == 0)
                {
                    Toast.makeText(getActivity() , "vérifier champs Prenom", Toast.LENGTH_SHORT).show();
                    mPrenom.requestFocus();
                    InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
                }
                else if (mAdresse.getText().toString().length() == 0)
                {
                    Toast.makeText(getActivity() , "vérifier champs Adresse", Toast.LENGTH_SHORT).show();
                    mAdresse.requestFocus();
                    InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
                }
                else
                {
                    Physique physique = new Physique(mAdresse.getText().toString(),mCinPhysique.getText().toString(), mNom.getText().toString(), mPrenom.getText().toString() );
                    mDatabaseReference.push().setValue(physique);

                    Toast.makeText(getActivity(), "Votre demande a été bien enregistré", Toast.LENGTH_SHORT).show();

                    mCinPhysique.setText("");
                    mNom.setText("");
                    mPrenom.setText("");
                    mAdresse.setText("");
                }
            }
        });
        return view;
    }
}
