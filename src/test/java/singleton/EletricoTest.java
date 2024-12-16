package singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.Eletrico;

public class EletricoTest {
     @Test
    void deveRetornarCustoCombustivel() {
        Eletrico.getInstance().setCusto(5);
        assertEquals(5.0f, Eletrico.getInstance().custoPorLitro());
    }

    @Test
    void deveRetornarEficienciaCombustivel() {
        Eletrico.getInstance().setEficienciaCombustivel(8);
        assertEquals(8.0f, Eletrico.getInstance().eficiencia());
    }

    @Test
    void deveRetornarDetalhesCombustivel() {
        Eletrico.getInstance().setCusto(5);
        Eletrico.getInstance().setEficienciaCombustivel(8);
        
        assertEquals("Eletrico [Custo: 5.0 | Eficiência: 8.0 km/l]", Eletrico.getInstance().toString());
    }
}
