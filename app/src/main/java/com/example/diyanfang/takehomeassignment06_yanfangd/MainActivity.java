package com.example.diyanfang.takehomeassignment06_yanfangd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    TextView baseCostText;
    TextView taxPercentText;
    TextView tipPercentText;

    double baseCost;
    double taxPercent;
    double tipPercent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        baseCostText = findViewById(R.id.baseCost_editText);
        taxPercentText = findViewById(R.id.taxPercent_editText);
        tipPercentText = findViewById(R.id.tipPercent_editText);
    }

    public void submit(View view){

        baseCost = Double.parseDouble(baseCostText.getText().toString());
        taxPercent = Double.parseDouble(taxPercentText.getText().toString());
        tipPercent = Double.parseDouble(tipPercentText.getText().toString());

        //then create an object with constructor that accepts everything
        //and pass it to the second activity
        TipCalculator tipCalculator = new TipCalculator(baseCost,taxPercent, tipPercent);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(Keys.TIP_CALCULATOR, (Serializable) tipCalculator);
        startActivity(intent);

    }
}
