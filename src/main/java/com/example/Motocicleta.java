package com.example;

public class Motocicleta extends Veiculo {
    public Motocicleta(Combustivel combustivel) {
        super(combustivel);
    }

    public float calcularCustoPorKm() {
        return combustivel.custoPorLitro() / combustivel.eficiencia() * 0.8f; // Exemplo: custo reduzido em 20%
    }
}
