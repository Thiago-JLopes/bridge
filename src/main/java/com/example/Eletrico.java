package com.example;

public class Eletrico implements Combustivel {

    private static Eletrico instance = new Eletrico(); 
    private Eletrico() {}

    public static Eletrico getInstance() {
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
        return "Eletrico [Custo: " + custoPorLitro() + " | Eficiência: " + eficiencia() + " km/l]";
    }
}
