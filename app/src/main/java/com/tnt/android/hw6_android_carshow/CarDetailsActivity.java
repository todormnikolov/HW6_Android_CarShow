package com.tnt.android.hw6_android_carshow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class CarDetailsActivity extends AppCompatActivity {

    TextView txtBrand;
    TextView txtModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_details);

        txtBrand = (TextView) findViewById(R.id.txt_brand);
        txtModel = (TextView) findViewById(R.id.txt_model);

        Intent intent = getIntent();
        txtBrand.setText(intent.getStringExtra("brand"));
        txtModel.setText(intent.getStringExtra("model"));
    }
}
