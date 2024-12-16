package com.example;

public class Carro extends Veiculo{
    public Carro(String marca) {
        super(marca);
    }

    public float calcularCustoPorKm() {
        return combustivel.custoPorLitro() / combustivel.eficiencia();
    }

    @Override
    public String descricao() {
        return "Carro ["+ this.getMarca() +"] - " + this.calcularCustoPorKm() + "km/h";
    }
}
