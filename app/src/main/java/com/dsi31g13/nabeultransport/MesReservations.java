package com.dsi31g13.nabeultransport;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.firebase.ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MesReservations extends AppCompatActivity {

    private ListView mPhysiqueListView;
    private PhysiqueAdapter mPhysiqueAdapter;
    private MoraleAdapter mMoraleAdapter;
    private FirebaseAuth.AuthStateListener mAuthStateListener;
    public static String Uid;
    public static final int RC_SIGN_IN = 1;
    private FirebaseAuth mFirebaseAuth;

    //Firebase
    private FirebaseDatabase mFirebaseDatabase;
    public DatabaseReference mPhysiqueReference,mMoraleReference;
    private ChildEventListener mChildEventListenerMorale,mChildEventListenerPhysique;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mes_reservations);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mFirebaseAuth = FirebaseAuth.getInstance();
        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth)
            {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null)
                {
                    Uid = user.getUid();
                    mFirebaseDatabase = FirebaseDatabase.getInstance();
                    mPhysiqueReference = mFirebaseDatabase.getReference().child(MainActivity.Uid+"/Personne Physique");
                    mMoraleReference = mFirebaseDatabase.getReference().child(MainActivity.Uid + "/Personne Morale");

                    mPhysiqueListView = findViewById(R.id.physiqueListView);

                    List <Physique> listPhysique = new ArrayList<>();
                    //List <Morale> listMorale = new ArrayList<>();

                    mPhysiqueAdapter = new PhysiqueAdapter(MesReservations.this , listPhysique);
                    mPhysiqueListView.setAdapter(mPhysiqueAdapter);

                    mChildEventListenerPhysique = new ChildEventListener() {
                        @Override
                        public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s)
                        {
                            Physique physique = dataSnapshot.getValue(Physique.class);
                            mPhysiqueAdapter.add(physique);
                        }

                        @Override
                        public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                        }

                        @Override
                        public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

                        }

                        @Override
                        public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }
                    };
                    mPhysiqueReference.addChildEventListener(mChildEventListenerPhysique);
                }
                else
                {
                    // Choose authentication providers
                    //onSignedOutCleanup();
                   List<AuthUI.IdpConfig> providers = Arrays.asList(
                            //  new AuthUI.IdpConfig.FacebookBuilder().build(),
                            new AuthUI.IdpConfig.EmailBuilder().build(),
                            new AuthUI.IdpConfig.GoogleBuilder().build()
                    );

                    // Create and launch sign-in intent
                    startActivityForResult(
                            AuthUI.getInstance()
                                    .createSignInIntentBuilder()
                                    .setIsSmartLockEnabled(false)
                                    .setLogo(R.drawable.user_logo)
                                    .setAvailableProviders(providers)
                                    .build(),
                            RC_SIGN_IN);
                }
            }
        };
        mFirebaseAuth.addAuthStateListener(mAuthStateListener); // add authentication listener to this class


 /*
        mMoraleAdapter = new MoraleAdapter(this , listMorale);
        mPhysiqueListView.setAdapter(mMoraleAdapter);

        mChildEventListenerMorale = new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s)
            {
                Morale morale = dataSnapshot.getValue(Morale.class);
                mMoraleAdapter.add(morale);
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        mMoraleReference.addChildEventListener(mChildEventListenerMorale);
*/

    }
}
