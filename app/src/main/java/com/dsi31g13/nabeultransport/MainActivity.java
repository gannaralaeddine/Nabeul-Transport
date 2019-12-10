package com.dsi31g13.nabeultransport;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.bumptech.glide.Glide;
import com.firebase.ui.auth.AuthUI;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity
{
    public static final int RC_SIGN_IN = 1;

    private FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    private ListView ls;
    private String [] liste_agences;
    public static String Uid;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("MainActivity", "hello");

        ls = findViewById(R.id.liste_agence);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //  list of agencies
        List<String> agences = new ArrayList<>();
        agences.add("Agence Nabeul");
        agences.add("Agence Korba");
        agences.add("Agence Menzel Temime");
        agences.add("Agence Kelibia");
        agences.add("Agence Haouaria");
        agences.add("Agence Soliman");
        agences.add("Agence Manzel Bouzalfa");
        agences.add("Agence ElFahs");
        agences.add("Agence Bab Alioua");
        agences.add("Agence Beni Khalled");
        agences.add("Agence Grombalia");
        agences.add("Agence Hammamet");
        agences.add("Agence Zaghouan");



        ArrayAdapter<String> adapter = new ArrayAdapter (this, android.R.layout.simple_list_item_1, agences);
        ls.setAdapter(adapter);

        ls.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position)
                {
                    case 0:
                    {
                        String uri0 = String.format(Locale.ENGLISH, "geo:%f,%f", 36.7884317 ,10.1782923);
                        Intent intent0 = new Intent(Intent.ACTION_VIEW, Uri.parse(uri0));
                        startActivity(intent0);
                        break;
                    }
                    case 1:
                        String uri1 = String.format(Locale.ENGLISH, "geo:%f,%f", 36.6513412, 10.5894175);
                        Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(uri1));
                        startActivity(intent1);
                        break;
                    case 2:
                        String uri2 = String.format(Locale.ENGLISH, "geo:%f,%f", 36.3758851, 9.9020729);
                        Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse(uri2));
                        startActivity(intent2);
                        break;

                    case 3:
                        String uri3 = String.format(Locale.ENGLISH, "geo:%f,%f", 36.6020043, 10.4956911);
                        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse(uri3));
                        startActivity(intent3);
                        break;

                    case 4:
                        String uri4 = String.format(Locale.ENGLISH, "geo:%f,%f", 36.4074345, 10.6118355);
                        Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse(uri4));
                        startActivity(intent4);
                        break;
                    case 5:
                        String uri5 = String.format(Locale.ENGLISH, "geo:%f,%f", 37.0537972, 11.00028);
                        Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse(uri5));
                        startActivity(intent5);
                        break;
                    case 6:
                        String uri6 = String.format(Locale.ENGLISH, "geo:%f,%f", 36.5811224, 10.8615566);
                        Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse(uri6));
                        startActivity(intent6);
                        break;
                    case 7:
                        String uri7 = String.format(Locale.ENGLISH, "geo:%f,%f", 36.682032, 10.584478);
                        Intent intent7 = new Intent(Intent.ACTION_VIEW, Uri.parse(uri7));
                        startActivity(intent7);
                        break;
                    case 8:
                        String uri8 = String.format(Locale.ENGLISH, "geo:%f,%f", 36.7811472, 10.9938364);
                        Intent intent8 = new Intent(Intent.ACTION_VIEW, Uri.parse(uri8));
                        startActivity(intent8);
                        break;
                    case 9:
                        String uri9 = String.format(Locale.ENGLISH, "geo:%f,%f", 36.4516598, 10.7295138);
                        Intent intent9 = new Intent(Intent.ACTION_VIEW, Uri.parse(uri9));
                        startActivity(intent9);
                        break;
                    case 10:
                        String uri10 = String.format(Locale.ENGLISH, "geo:%f,%f", 36.8483391, 11.0874398);
                        Intent intent10 = new Intent(Intent.ACTION_VIEW, Uri.parse(uri10));
                        startActivity(intent10);
                        break;
                    case 11:
                        String uri11 = String.format(Locale.ENGLISH, "geo:%f,%f", 36.6932594, 10.4932033);
                        Intent intent11 = new Intent(Intent.ACTION_VIEW, Uri.parse(uri11));
                        startActivity(intent11);
                        break;
                    case 12:
                        String uri12 = String.format(Locale.ENGLISH, "geo:%f,%f", 36.4001202, 10.1473317);
                        Intent intent12 = new Intent(Intent.ACTION_VIEW, Uri.parse(uri12));
                        startActivity(intent12);
                        break;

                    default:
                        Toast.makeText(MainActivity.this, "Erreur", Toast.LENGTH_SHORT).show();
                }
            }
        });
       mFirebaseAuth = FirebaseAuth.getInstance();


        final DrawerLayout drawer = findViewById(R.id.drawer);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        final NavigationView navigationView = findViewById(R.id.nav_view);
        View headerview = navigationView.getHeaderView(0);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // Handle navigation view item clicks here.
                switch (item.getItemId())
                {
                    case R.id.nav_sign_up:
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
                        return true;
                    }
                    case R.id.nav_demande_location_bus:
                        startActivity(new Intent(MainActivity.this , LocatationBusActivity.class));
                        return true;
                    case R.id.nav_reservation:
                        startActivity(new Intent(MainActivity.this , MesReservations.class));
                        return true;
                    case R.id.nav_about:

                        return true;
                    case R.id.nav_log_out:
                        Intent intent = getIntent();
                        AuthUI.getInstance().signOut(MainActivity.this);
                        finish();
                        startActivity(intent);
                        return true;
                }
                DrawerLayout drawer = findViewById(R.id.drawer);
                drawer.closeDrawer(GravityCompat.START);
                return true;
            }
        });


        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth)
            {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null)
                {
                    Uid = user.getUid();
                    assert user.getPhotoUrl() != null;
                    initializingData(user.getPhotoUrl() , user.getDisplayName() , user.getEmail() );
                    navigationView.getMenu().removeItem(R.id.nav_sign_up);
                }
            }
         };
        mFirebaseAuth.addAuthStateListener(mAuthStateListener);

        headerview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                AlertDialog dialog = new AlertDialog(MainActivity.this );
//                dialog.create();
            }
        });
    }

    @Override
    public void onBackPressed()
    {
        DrawerLayout drawer = findViewById(R.id.drawer);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId() == R.id.action_settings)
        {
            Toast.makeText(this, getResources().getString(R.string.Settings), Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    // onPause and onResume for mAuthStateListener
    @Override
    protected void onPause() {
        super.onPause();
        mFirebaseAuth.removeAuthStateListener(mAuthStateListener);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mFirebaseAuth.addAuthStateListener(mAuthStateListener);
    }

    public void initializingData(Uri pic , String user , String email)
    {
        NavigationView navigationView = findViewById(R.id.nav_view);
        View nav = navigationView.getHeaderView(0);

        CircleImageView profilePicture = nav.findViewById(R.id.profilePicture);
        TextView username = nav.findViewById(R.id.usernameTextView);
        TextView mail = nav.findViewById(R.id.mailTextView);

        Glide.with(this).load(pic.toString()).into(profilePicture);
        username.setText(user);
        mail.setText(email);
    }
}