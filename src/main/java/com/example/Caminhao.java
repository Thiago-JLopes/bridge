package com.example;

public class Caminhao extends Veiculo {
    public Caminhao(Combustivel combustivel) {
        super(combustivel);
    }

    public float calcularCustoPorKm() {
        return (combustivel.custoPorLitro() / combustivel.eficiencia()) * 1.5f; // Exemplo: custo adicional de 50%
    }
}
