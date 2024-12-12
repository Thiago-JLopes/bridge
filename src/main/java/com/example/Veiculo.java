package com.example;

public abstract class Veiculo {
    protected Combustivel combustivel;

    public Veiculo(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public abstract float calcularCustoPorKm();
}
