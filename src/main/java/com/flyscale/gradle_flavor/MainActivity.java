package com.flyscale.gradle_flavor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.flyscale.product.VersionSettings;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(getClass().getSimpleName(), "BuildConfig.APPLICATION_ID=" + BuildConfig.APPLICATION_ID);
        Log.d(getClass().getSimpleName(), "BuildConfig.LOG_DEBUG=" + BuildConfig.LOG_DEBUG);
        Log.d(getClass().getSimpleName(), "BuildConfig.PRODUCT_NAME=" + BuildConfig.PRODUCT_NAME);

        Log.d(getClass().getSimpleName(), "VersionSettings.VERSION_INFO=" + VersionSettings.VERSION_INFO);

        Log.d(getClass().getSimpleName(), "ServerUrl=" + VersionSettings.getServerUrl());

        Log.d(getClass().getSimpleName(), "product type=" + getString(R.string.product_type));
    }
}
