package bridge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.Diesel;
import com.example.Eletrico;
import com.example.Gasolina;
import com.example.Veiculo;
import com.example.VeiculoFactory;

public class MotocicletaTest {

    @Test
    void deveCalcularCustoPorKmDiesel() {
        Diesel.getInstance().setCusto(9);
        Diesel.getInstance().setEficienciaCombustivel(3);
        Veiculo veiculo = VeiculoFactory.obeterVeiculo("Motocicleta", "Yamaha");
        veiculo.setCombustivel(Diesel.getInstance());

        assertEquals(2.4, veiculo.calcularCustoPorKm(), 0.01f);

    }

    @Test
    void deveCalcularCustoPorKmGasolina() {
        Gasolina.getInstance().setCusto(6);
        Gasolina.getInstance().setEficienciaCombustivel(5);
        Veiculo veiculo = VeiculoFactory.obeterVeiculo("Motocicleta", "BMW");
        veiculo.setCombustivel(Gasolina.getInstance());

        assertEquals(0.96f, veiculo.calcularCustoPorKm(), 0.01f);

    }

    @Test
    void deveCalcularCustoPorKmEletrico() {
        Eletrico.getInstance().setCusto(9);
        Eletrico.getInstance().setEficienciaCombustivel(3);
        Veiculo veiculo = VeiculoFactory.obeterVeiculo("Motocicleta", "BMW");
        veiculo.setCombustivel(Eletrico.getInstance());

        assertEquals(2.4f, veiculo.calcularCustoPorKm(), 0.01f);

    }

    @Test
    void deveRetornarDescricao() {
        Diesel.getInstance().setCusto(9);
        Diesel.getInstance().setEficienciaCombustivel(3);
        Veiculo veiculo = VeiculoFactory.obeterVeiculo("Motocicleta", "Honda");
        veiculo.setCombustivel(Diesel.getInstance());

        assertEquals("Motocicleta [Honda] - 2.4km/h", veiculo.descricao());
    }
}
