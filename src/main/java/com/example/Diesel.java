package com.example;

public class Diesel implements Combustivel {

    private static Diesel instance =  new Diesel(); 
    private Diesel() {}

    public static Diesel getInstance() {
        return instance;
    }

    private float custo = 0.0f;
    private float eficienciaCombustivel= 0.0f;


    public void setCusto(float custo) {
        this.custo = custo;
    }

    public void setEficienciaCombustivel(float eficienciaCombustivel) {
        this.eficienciaCombustivel = eficienciaCombustivel;
    }

    public float custoPorLitro() {
        return custo; 
    }

    public float eficiencia() {
        return eficienciaCombustivel;
    }

    @Override
    public String toString() {
        return "Diesel [Custo: " + custoPorLitro() + " | Eficiência: " + eficiencia() + " km/l]";
    }
}
