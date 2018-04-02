package com.example.diyanfang.takehomeassignment06_yanfangd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    //you'll need a variable to display text
    TextView displayText;

    double baseCost;
    double taxPercent;
    double tipPercent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        displayText =  (TextView) findViewById(R.id.display_text);

        //passing object from main activity to second activity
        Intent intent = getIntent();
        TipCalculator tCalculator = (TipCalculator) intent.getSerializableExtra(Keys.TIP_CALCULATOR);

        baseCost = tCalculator.getBaseCost();
        taxPercent = tCalculator.getTaxPercent();
        tipPercent = tCalculator.getTipPercent();
        displayText.setText(tCalculator.toString());
    }
}
