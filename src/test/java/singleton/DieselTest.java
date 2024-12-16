package singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.Diesel;

public class DieselTest {
 @Test
    void deveRetornarCustoCombustivel() {
        Diesel.getInstance().setCusto(9);
        assertEquals(9.0f, Diesel.getInstance().custoPorLitro());
    }

    @Test
    void deveRetornarEficienciaCombustivel() {
        Diesel.getInstance().setEficienciaCombustivel(15);
        assertEquals(15.0f, Diesel.getInstance().eficiencia());
    }

    @Test
    void deveRetornarDetalhesCombustivel() {
        Diesel.getInstance().setCusto(9);
        Diesel.getInstance().setEficienciaCombustivel(15);
        
        assertEquals("Diesel [Custo: 9.0 | Eficiência: 15.0 km/l]", Diesel.getInstance().toString());
    }
}
