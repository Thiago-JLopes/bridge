package factoryMethod;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.example.Veiculo;
import com.example.VeiculoFactory;

public class VeiculoFactoryTest {
    @Test
    void deveRetornarExcecaoParaVeiculoInexistente() {
        try {
            Veiculo veiculo = VeiculoFactory.obeterVeiculo("Onibus", "Mercedes-Benz");
            fail();          
        } catch (IllegalArgumentException e) {
            assertEquals("Veiculo inexistente", e.getMessage());
        }
    }

    @Test
    void deveObterNomeMarcaVeiculoCriado() {
        Veiculo veiculo = VeiculoFactory.obeterVeiculo("Caminhao", "Mercedes-Benz");
        assertEquals("Mercedes-Benz", veiculo.getMarca());
    }

    @Test
    void deveRetornarExcecaoParaVeiculoInvalido() {
        try {
            Veiculo veiculo = VeiculoFactory.obeterVeiculo("Bicicleta", "Caloi");
            fail();          
        } catch (IllegalArgumentException e) {
            assertEquals("Veiculo invalido", e.getMessage());
        }
    }
}
