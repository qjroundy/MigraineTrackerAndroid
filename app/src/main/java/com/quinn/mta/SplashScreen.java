package com.quinn.mta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class SplashScreen extends AppCompatActivity {

    private String TAG = "DEBUG_SETUP";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        Log.i(TAG, "Inflating Menu");

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
}
