package test;

import main.Retangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTest {

    @Test
    public void deveCriarRetanguloValido() {
        Retangulo retangulo = new Retangulo(3.0, 4.0);

        assertEquals(3.0, retangulo.getLargura(), 1e-9);
        assertEquals(4.0, retangulo.getAltura(), 1e-9);
        assertEquals("Retangulo", retangulo.getNome());
    }

    @Test
    public void deveLancarExceptionQuandoMedidasNaoPositivas() {
        IllegalArgumentException exception1 =
                assertThrows(IllegalArgumentException.class, () -> new Retangulo(0, 2));
        assertTrue(exception1.getMessage().toLowerCase().contains("0"));

        IllegalArgumentException exception2 =
                assertThrows(IllegalArgumentException.class, () -> new Retangulo(-1, 2));
        assertTrue(exception2.getMessage().toLowerCase().contains("menores"));

        IllegalArgumentException exception3 =
                assertThrows(IllegalArgumentException.class, () -> new Retangulo(2, 0));
        assertTrue(exception3.getMessage().toLowerCase().contains("0"));

        IllegalArgumentException exception4 =
                assertThrows(IllegalArgumentException.class, () -> new Retangulo(2, -1));
        assertTrue(exception4.getMessage().toLowerCase().contains("menores"));
    }

    @Test
    public void deveLancarExceptionQuandoLarguraIgualAltura() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> new Retangulo(5.0, 5.0));

        String msg = exception.getMessage().toLowerCase();

        assertTrue(msg.contains("quadrado") || msg.contains("iguais"));
    }

    @Test
    public void deveCalcularAreaCorretamente() {
        Retangulo retangulo = new Retangulo(3.0, 4.0);
        assertEquals(12.0, retangulo.calcularArea(), 1e-9);
    }

    @Test
    public void deveCalcularPerimetroCorretamente() {
        Retangulo retangulo = new Retangulo(3.0, 4.0);
        assertEquals(14.0, retangulo.calcularPerimetro(), 1e-9);
    }

    @Test
    public void settersDevemAtualizarMedidasERecalcular() {
        Retangulo retangulo = new Retangulo(2.0, 3.0);

        retangulo.setLargura(10.0);
        retangulo.setAltura(1.5);

        assertEquals(10.0, retangulo.getLargura(), 1e-9);
        assertEquals(1.5, retangulo.getAltura(), 1e-9);
        assertEquals(15.0, retangulo.calcularArea(), 1e-9);
        assertEquals(23.0, retangulo.calcularPerimetro(), 1e-9);
    }

    @Test
    public void devePermitirAlterarONome() {
        Retangulo retangulo = new Retangulo(3.0, 4.0);
        retangulo.setNome("Retângulo Custom");
        assertEquals("Retângulo Custom", retangulo.getNome());
    }


}

