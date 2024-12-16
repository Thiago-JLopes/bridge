package com.example;

import java.lang.reflect.Constructor;

public class VeiculoFactory {
    public static Veiculo obeterVeiculo(String veiculo, String marca) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("com.example." + veiculo);
            Constructor constructor = classe.getConstructor(String.class);
            objeto = constructor.newInstance(marca);
        
        } catch (Exception e) {
            throw new IllegalArgumentException("Veiculo inexistente");
        }

        if(!(objeto instanceof Veiculo)) {
            throw new IllegalArgumentException("Veiculo invalido");
        }

        return (Veiculo) objeto;
    }
}
