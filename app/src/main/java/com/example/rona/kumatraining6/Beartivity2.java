package com.example.rona.kumatraining6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Beartivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beartivity2);
        TextView t = findViewById(R.id.showdata);
        Bundle bundle = getIntent().getExtras();
        String s = bundle.getString("BearName");
        t.setText(s);

    }
}
