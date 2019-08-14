package com.example.rona.kumatraining6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainBear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bear);
        initIntent(findViewById(R.id.btn1),Beartivity.class);
        initIntent(findViewById(R.id.btn2),Beartivity3.class);
    }

    public void initIntent(View btn,final Class bear){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bearsense = new Intent(MainBear.this,bear);
                startActivity(bearsense);
            }
        });
    }
}
