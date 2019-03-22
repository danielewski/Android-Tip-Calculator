package com.example.taylordanielewski.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tipTot;
    EditText checkTot;
    EditText customTip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkTot = (EditText) findViewById(R.id.checkTot);
        customTip = (EditText) findViewById(R.id.customTip);
        tipTot = (TextView) findViewById(R.id.tipTot);

/*
        checkTot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tipTot.setText("");
            }
        });
*/

        Button shittyBtn = (Button) findViewById(R.id.badBtn);

        shittyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float checkTotFlt = Float.parseFloat(checkTot.getText().toString());
                tipTot.setText("$"+Float.toString(checkTotFlt*15/100));

            }
        });

        Button goodBtn = (Button) findViewById(R.id.goodBtn);
        goodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float checkTotFlt = Float.parseFloat(checkTot.getText().toString());
                tipTot.setText("$"+Float.toString(checkTotFlt*20/100));

            }
        });
        Button greatBtn = (Button) findViewById(R.id.greatBtn);
        greatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float checkTotFlt = Float.parseFloat(checkTot.getText().toString());
                tipTot.setText("$"+Float.toString(checkTotFlt*25/100));

            }
        });

        Button customBtn = (Button) findViewById(R.id.customBtn);
        customBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float checkTotFlt = Float.parseFloat(checkTot.getText().toString());
                float checkTipFlt = Float.parseFloat(customTip.getText().toString());
                tipTot.setText("$"+Float.toString(checkTotFlt*checkTipFlt/100));

            }
        });


    }



}
