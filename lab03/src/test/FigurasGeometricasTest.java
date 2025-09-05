package test;

import main.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FigurasGeometricasTest {

    private FigurasGeometricas figuras;

    @BeforeEach
    public void setUp() {
        figuras = new FigurasGeometricas();
    }


    private static class FiguraFixa implements Forma {
        private final double area;
        private final double perimetro;
        private final String repr;

        FiguraFixa(double area, double perimetro, String repr) {
            this.area = area;
            this.perimetro = perimetro;
            this.repr = repr;
        }

        @Override
        public double calcularArea() {
            return area;
        }

        @Override
        public double calcularPerimetro() {
            return perimetro;
        }

        @Override
        public String toString() {
            return repr;
        }
    }

    @Test
    public void aoCalcularAreaTotalComListaVaziaRetornaZero() {
        assertEquals(0.0, figuras.calcularAreaTotal(), 1e-9);
    }

    @Test
    public void aoCalcularPerimetroTotalComListaVaziaRetornaZero() {
        assertEquals(0.0, figuras.calcularPerimetroTotal(), 1e-9);
    }

    @Test
    public void adicionarFormaNullNaoAfetaCalculosTotais() {

        figuras.adicionarForma(null);

        assertEquals(0.0, figuras.calcularAreaTotal(), 1e-9);
        assertEquals(0.0, figuras.calcularPerimetroTotal(), 1e-9);
    }

    @Test
    public void adicionarFormaValidaSomaNosCalculosTotais() {

        figuras.adicionarForma(new FiguraFixa(10.0, 4.0, "A"));

        assertEquals(10.0, figuras.calcularAreaTotal(), 1e-9);
        assertEquals(4.0, figuras.calcularPerimetroTotal(), 1e-9);
    }

    @Test
    public void somatorioDeMultiplasFormas() {
        figuras.adicionarForma(new FiguraFixa(3.5, 2.0, "A"));
        figuras.adicionarForma(new FiguraFixa(6.5, 8.0, "B"));
        figuras.adicionarForma(new FiguraFixa(0.0, 1.3, "C")); // valida somar zero também

        assertEquals(3.5 + 6.5 + 0.0, figuras.calcularAreaTotal(), 1e-9);
        assertEquals(2.0 + 8.0 + 1.3, figuras.calcularPerimetroTotal(), 1e-9);
    }


}
