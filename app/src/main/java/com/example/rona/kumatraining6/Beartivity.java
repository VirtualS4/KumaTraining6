package com.example.rona.kumatraining6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Beartivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beartivity);
        final EditText bearname = findViewById(R.id.fill_the_bear);
        Button btn = findViewById(R.id.btn_submit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bearsense = new Intent(Beartivity.this,Beartivity2.class);
                bearsense.putExtra("BearName", bearname.getText().toString());
                startActivity(bearsense);
            }
        });
    }
}
