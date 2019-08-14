package com.example.rona.kumatraining6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MoveWithBearBeartivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beartivity7);
        Bundle bundle = getIntent().getExtras();
        Bear s = bundle.getParcelable("Object");

        ((TextView) findViewById(R.id.bear_received)).setText("Nama : "+s.getName()+" Umur : "+s.getUmur()+
                " Kota : "+s.getCity()+" Email : "+s.getEmail());
    }
}
