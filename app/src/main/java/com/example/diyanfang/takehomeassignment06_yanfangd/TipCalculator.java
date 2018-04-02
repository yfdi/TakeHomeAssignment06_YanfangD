package com.example.diyanfang.takehomeassignment06_yanfangd;

import java.io.Serializable;

/**
 * Created by diyanfang on 4/1/18.
 */

public class TipCalculator implements Serializable {

    private double baseCost;
    private double tipPercent;
    private double tipAmount;
    private double taxPercent;
    private double taxAmount;
    private double totalAmount;

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public double getTipPercent() {
        return tipPercent;
    }

    public void setTipPercent(double tipPercent) {
        this.tipPercent = tipPercent;
    }

    public double getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(double taxPercent) {
        this.taxPercent = taxPercent;
    }


    public TipCalculator(double baseCost, double tipPercent, double taxPercent) {
        this.baseCost = baseCost;
        this.tipPercent = tipPercent;
        this.taxPercent = taxPercent;

        this.tipAmount = tipPercent * baseCost;
        this.taxAmount = taxPercent * baseCost;
        this.totalAmount = baseCost + taxAmount + tipAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String toString(){
        return "Base Cost: " + baseCost + "\nTax Amount: " + taxAmount + "\nTip Amount: " + tipAmount +
                "\nTotal Amount: " + totalAmount;
    }


}