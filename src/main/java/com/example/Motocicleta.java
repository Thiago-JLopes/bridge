package com.example;

public class Motocicleta extends Veiculo {
    public Motocicleta(String marca) {
        super(marca);
    }

    public float calcularCustoPorKm() {
        return combustivel.custoPorLitro() / combustivel.eficiencia() * 0.8f;
    }

    @Override
    public String descricao() {
        return "Motocicleta ["+ this.getMarca() +"] - " + this.calcularCustoPorKm() + "km/h";
    }
}
