package com.example.rona.kumatraining6;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;

public class MoveForResultBeartivity extends AppCompatActivity {
    public static String Ex_Value = "";
    public static int result = 110;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beartivity5);

        findViewById(R.id.btn_choose_points).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg = findViewById(R.id.bear_group);
                if (rg.getCheckedRadioButtonId() != 0){
                    int value = 0;
                    switch (rg.getCheckedRadioButtonId()){
                        case R.id.id_50 :
                            value = 50;
                            break;
                        case R.id.id_100 :
                            value = 100;
                            break;
                        case R.id.id_150 :
                            value = 150;
                            break;
                        case R.id.id_200 :
                            value = 200;
                            break;

                    }
                    Intent bearsense = new Intent();
                    bearsense.putExtra(Ex_Value,value);
                    setResult(result,bearsense);
                    finish();
                }

            }
        });

    }

}
