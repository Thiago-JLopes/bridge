package com.example;

public class Caminhao extends Veiculo {
    public Caminhao(String marca) {
        super(marca);
    }

    public float calcularCustoPorKm() {
        return (combustivel.custoPorLitro() / combustivel.eficiencia()) * 1.5f;
    }

    public String descricao() {
        return "Caminhao ["+ this.getMarca() +"] - " + this.calcularCustoPorKm() + "km/h";
    }
}
