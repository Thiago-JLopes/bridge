package com.example;
public class Bicicleta {
    private String marca;

    public Bicicleta(String marca) {
        this.marca = marca;
    }
    

    public String descricao() {
        return "Bicicleta comun";
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }
}
