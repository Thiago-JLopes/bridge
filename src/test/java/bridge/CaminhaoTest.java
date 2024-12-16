package bridge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.Diesel;
import com.example.Eletrico;
import com.example.Gasolina;
import com.example.Veiculo;
import com.example.VeiculoFactory;

public class CaminhaoTest {

    @Test
    void deveCalcularCustoPorKmDiesel() {
        Diesel.getInstance().setCusto(9);
        Diesel.getInstance().setEficienciaCombustivel(3);
        Veiculo veiculo = VeiculoFactory.obeterVeiculo("Caminhao", "Volvo");
        veiculo.setCombustivel(Diesel.getInstance());

        assertEquals(4.5f, veiculo.calcularCustoPorKm(), 0.01f);

    }

    @Test
    void deveCalcularCustoPorKmGasolina() {
        Gasolina.getInstance().setCusto(6);
        Gasolina.getInstance().setEficienciaCombustivel(5);
        Veiculo veiculo = VeiculoFactory.obeterVeiculo("Caminhao", "Iveco");
        veiculo.setCombustivel(Gasolina.getInstance());

        assertEquals(1.8f, veiculo.calcularCustoPorKm(), 0.01f);

    }

    @Test
    void deveCalcularCustoPorKmEletrico() {
        Eletrico.getInstance().setCusto(9);
        Eletrico.getInstance().setEficienciaCombustivel(3);
        Veiculo veiculo = VeiculoFactory.obeterVeiculo("Caminhao", "MAN");
        veiculo.setCombustivel(Eletrico.getInstance());

        assertEquals(4.5f, veiculo.calcularCustoPorKm(), 0.01f);

    }

    @Test
    void deveRetornarDescricao() {
        Diesel.getInstance().setCusto(9);
        Diesel.getInstance().setEficienciaCombustivel(3);
        Veiculo veiculo = VeiculoFactory.obeterVeiculo("Caminhao", "Scania");
        veiculo.setCombustivel(Diesel.getInstance());

        assertEquals("Caminhao [Scania] - 4.5km/h", veiculo.descricao());
    }
}
