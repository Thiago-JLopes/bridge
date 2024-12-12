package com.example;

public class Parametros {

    private static Parametros instance = new Parametros();

    private Parametros() {}

    public static Parametros getInstance() {
        return instance;
    }

    private float precoGasolina = 5.50f;
    private float precoDiesel = 4.00f;
    private float precoEletrico = 0.50f; 
    
    public float getPrecoGasolina() {
        return precoGasolina;
    }

    public void setPrecoGasolina(float precoGasolina) {
        this.precoGasolina = precoGasolina;
    }

    public float getPrecoDiesel() {
        return precoDiesel;
    }

    public void setPrecoDiesel(float precoDiesel) {
        this.precoDiesel = precoDiesel;
    }

    public float getPrecoEletrico() {
        return precoEletrico;
    }

    public void setPrecoEletrico(float precoEletrico) {
        this.precoEletrico = precoEletrico;
    }

}
