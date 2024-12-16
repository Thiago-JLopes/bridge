package bridge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.Diesel;
import com.example.Eletrico;
import com.example.Gasolina;
import com.example.Veiculo;
import com.example.VeiculoFactory;

public class CarroTest {

    @Test
    void deveCalcularCustoPorKmDiesel() {
        Diesel.getInstance().setCusto(9);
        Diesel.getInstance().setEficienciaCombustivel(3);
        Veiculo veiculo = VeiculoFactory.obeterVeiculo("Carro", "Volvo");
        veiculo.setCombustivel(Diesel.getInstance());

        assertEquals(3.0f, veiculo.calcularCustoPorKm(), 0.01f);

    }

    @Test
    void deveCalcularCustoPorKmGasolina() {
        Gasolina.getInstance().setCusto(6);
        Gasolina.getInstance().setEficienciaCombustivel(5);
        Veiculo veiculo = VeiculoFactory.obeterVeiculo("Carro", "FIAT");
        veiculo.setCombustivel(Gasolina.getInstance());

        assertEquals(1.2f, veiculo.calcularCustoPorKm(), 0.01f);

    }

    @Test
    void deveCalcularCustoPorKmEletrico() {
        Eletrico.getInstance().setCusto(9);
        Eletrico.getInstance().setEficienciaCombustivel(3);
        Veiculo veiculo = VeiculoFactory.obeterVeiculo("Carro", "Toyota");
        veiculo.setCombustivel(Eletrico.getInstance());

        assertEquals(3.0f, veiculo.calcularCustoPorKm(), 0.01f);

    }

    @Test
    void deveRetornarDescricao() {
        Diesel.getInstance().setCusto(9);
        Diesel.getInstance().setEficienciaCombustivel(3);
        Veiculo veiculo = VeiculoFactory.obeterVeiculo("Carro", "Nissan");
        veiculo.setCombustivel(Diesel.getInstance());

        assertEquals("Carro [Nissan] - 3.0km/h", veiculo.descricao());
    }
}
