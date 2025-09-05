package test;

import main.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuadradoTest {

    @Test
    public void deveCriarQuadradoComLadoValido() {
        Quadrado quadrado = new Quadrado(2.0);

        assertEquals("Quadrado", quadrado.getNome());
    }

    @Test
    public void deveLancarExceptionQuandoLadoZero() {
        IllegalArgumentException ex1 =
                assertThrows(IllegalArgumentException.class, () -> new Quadrado(0));
        assertTrue(ex1.getMessage().toLowerCase().contains("lado"));

    }

    @Test
    public void deveLancarExceptionQuandoLadoNegativo() {

        IllegalArgumentException ex2 =
                assertThrows(IllegalArgumentException.class, () -> new Quadrado(-3.0));
        assertTrue(ex2.getMessage().toLowerCase().contains("lado"));
    }

    @Test
    public void deveCalcularAreaCorretamente() {
        Quadrado quadrado = new Quadrado(3.0);
        double esperado = 3.0 * 3.0;
        assertEquals(esperado, quadrado.calcularArea(), 1e-9);
    }

    @Test
    public void deveCalcularPerimetroCorretamente() {
        Quadrado quadrado = new Quadrado(4.0);
        double esperado = 4 * 4.0;
        assertEquals(esperado, quadrado.calcularPerimetro(), 1e-9);
    }

    @Test
    public void devePermitirAlterarONome() {
        Quadrado quadrado = new Quadrado(5.0);
        quadrado.setNome("quadronildo");
        assertEquals("quadronildo", quadrado.getNome());
    }


}
