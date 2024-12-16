package com.example;

public abstract class Veiculo {
    protected Combustivel combustivel;
    protected String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public String getMarca() {
        return marca;
    }
    
    public abstract float calcularCustoPorKm();
    public abstract String descricao();
}
