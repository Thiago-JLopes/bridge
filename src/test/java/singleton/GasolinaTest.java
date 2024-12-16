package singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.Gasolina;

public class GasolinaTest {
    @Test
    void deveRetornarCustoCombustivel() {
        Gasolina.getInstance().setCusto(5);
        assertEquals(5.0f, Gasolina.getInstance().custoPorLitro());
    }

    @Test
    void deveRetornarEficienciaCombustivel() {
        Gasolina.getInstance().setEficienciaCombustivel(8);
        assertEquals(8.0f, Gasolina.getInstance().eficiencia());
    }

    @Test
    void deveRetornarDetalhesCombustivel() {
        Gasolina.getInstance().setCusto(5);
        Gasolina.getInstance().setEficienciaCombustivel(8);
        
        assertEquals("Gasolina [Custo: 5.0 | Eficiência: 8.0 km/l]", Gasolina.getInstance().toString());
    }
}
