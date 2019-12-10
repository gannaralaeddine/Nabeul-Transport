package com.dsi31g13.nabeultransport;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Nav_Header_Main extends AppCompatActivity
{
    private String username;
    TextView userName;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_header_main);
    }
}