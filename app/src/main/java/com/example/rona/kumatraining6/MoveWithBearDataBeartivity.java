package com.example.rona.kumatraining6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MoveWithBearDataBeartivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beartivity6);

        Bundle bundle = getIntent().getExtras();
        String[] s = bundle.getStringArray("Data");

        ((TextView)findViewById(R.id.bear_data_received)).setText("Nama : "+s[0]+" Umur : "+s[1]);

    }
}
