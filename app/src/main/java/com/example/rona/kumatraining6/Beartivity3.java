package com.example.rona.kumatraining6;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Beartivity3 extends AppCompatActivity {

   private int REQUEST_CODE= 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beartivity3);

        initIntent(findViewById(R.id.btn_move),MoveBeartivity.class);

        String[] data = new String[]{"Zhofron Al Fajr GP","17"};
        initIntent(findViewById(R.id.btn_move_data),MoveWithBearDataBeartivity.class,data);

        Bear bayibear = new Bear();
        bayibear.setName("Kuma Yuru");
        bayibear.setCity("Everywhere Yuna go");
        bayibear.setEmail("Why would a bear have one?");
        bayibear.setUmur(5);

        initIntent(findViewById(R.id.btn_move_bear),MoveWithBearBeartivity.class,bayibear);

        initIntent(findViewById(R.id.btn_dial),"082123018338");

        initIntent(findViewById(R.id.btn_move_bear_result),MoveForResultBeartivity.class,REQUEST_CODE);
    }

    public void initIntent(View btn, final Class bear){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bearsense = new Intent(Beartivity3.this,bear);
                startActivity(bearsense);
            }
        });
    }

    public void initIntent(View btn, final Class bear,final String[] data){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bearsense = new Intent(Beartivity3.this,bear);

                bearsense.putExtra("Data",data);
                startActivity(bearsense);
            }
        });
    }
    public void initIntent(View btn, final Class bear,final Bear kuma){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bearsense = new Intent(Beartivity3.this,bear);
                bearsense.putExtra("Object",kuma);
                startActivity(bearsense);
            }
        });
    }

    public void initIntent(View btn, final String number){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bearsense = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+number));
                startActivity(bearsense);
            }
        });
    }

    public void initIntent(View btn,final Class bear,final int request){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bearsense = new Intent(Beartivity3.this,bear);
                startActivityForResult(bearsense,request);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
            if(requestCode == REQUEST_CODE){
            if (resultCode == MoveForResultBeartivity.result){
                int selectedValue = data.getIntExtra(MoveForResultBeartivity.Ex_Value, 0);
                ((TextView) findViewById(R.id.bear_tv)).setText(String.format("Hasil : %s",selectedValue));
            }
        }
    }
}
