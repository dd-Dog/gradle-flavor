package com.flyscale.gradle_flavor;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProdcutALauncher extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(getClass().getSimpleName(), "This is ProdcutALauncher");
        Log.d(getClass().getSimpleName(), "product type=" + getString(R.string.product_type));
    }
}
