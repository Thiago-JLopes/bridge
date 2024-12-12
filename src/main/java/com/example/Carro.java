package com.example;

public class Carro extends Veiculo{
    public Carro(Combustivel combustivel) {
        super(combustivel);
    }

    public float calcularCustoPorKm() {
        return combustivel.custoPorLitro() / combustivel.eficiencia();
    }
}
