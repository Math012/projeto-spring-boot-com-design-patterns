package com.math012.padroes_projeto_spring.model;

import java.util.*;

public class Rates {
    Map<String, Double> rates = new HashMap<>();
    private double MXN;
    private double EUR;
    private double BRL;
    private double BOB;
    private double CLP;
    private double CNY;
    private double COP;
    private double UYU;
    private double VEF;
    private double ARS;
    private double USD;

    public Rates(double MXN, double EUR, double BRL, double BOB, double CLP, double CNY, double COP, double UYU, double VEF, double ARS, double USD) {
        this.MXN = MXN;
        this.EUR = EUR;
        this.BRL = BRL;
        this.BOB = BOB;
        this.CLP = CLP;
        this.CNY = CNY;
        this.COP = COP;
        this.UYU = UYU;
        this.VEF = VEF;
        this.ARS = ARS;
        this.USD = USD;
    }

    public Map<String,Double> listaDeMoedasDisponiveis(){
        rates.put("MXN", getMXN());
        rates.put("EUR", getEUR());
        rates.put("BRL", getBRL());
        rates.put("BOB", getBOB());
        rates.put("CLP", getCLP());
        rates.put("CNY", getCNY());
        rates.put("COP", getCOP());
        rates.put("UYU", getUYU());
        rates.put("VEF", getVEF());
        rates.put("ARS", getARS());
        rates.put("USD", getUSD());
        return rates;
    }


    public Double getMXN() {
        return MXN;
    }

    public void setMXN(Double MXN) {
        this.MXN = MXN;
    }

    public Double getEUR() {
        return EUR;
    }

    public void setEUR(Double EUR) {
        this.EUR = EUR;
    }

    public Double getBRL() {
        return BRL;
    }

    public void setBRL(Double BRL) {
        this.BRL = BRL;
    }

    public Double getBOB() {
        return BOB;
    }

    public void setBOB(Double BOB) {
        this.BOB = BOB;
    }

    public Double getCLP() {
        return CLP;
    }

    public void setCLP(Double CLP) {
        this.CLP = CLP;
    }

    public Double getCNY() {
        return CNY;
    }

    public void setCNY(Double CNY) {
        this.CNY = CNY;
    }

    public Double getCOP() {
        return COP;
    }

    public void setCOP(Double COP) {
        this.COP = COP;
    }

    public Double getUYU() {
        return UYU;
    }

    public void setUYU(Double UYU) {
        this.UYU = UYU;
    }

    public Double getVEF() {
        return VEF;
    }

    public void setVEF(Double VEF) {
        this.VEF = VEF;
    }

    public Double getARS() {
        return ARS;
    }

    public void setARS(Double ARS) {
        this.ARS = ARS;
    }

    public double getUSD() {
        return USD;
    }

    public void setUSD(double USD) {
        this.USD = USD;
    }
}
