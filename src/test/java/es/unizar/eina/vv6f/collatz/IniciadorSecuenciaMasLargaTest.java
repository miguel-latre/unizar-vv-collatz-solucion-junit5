package es.unizar.eina.vv6f.collatz;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class IniciadorSecuenciaMasLargaTest {
    /**
     * Vector con los resultados esperados para cada valor límite.
     */
    private static final int[] ESPERADOS = {
            /* Límite:  2  --> iniciador más largo: */   1,
            /* Límite:  3  --> iniciador más largo: */   2,
            /* Límite:  4  --> iniciador más largo: */   3,
            /* Límite:  5  --> iniciador más largo: */   3,
            /* Límite:  6  --> iniciador más largo: */   3,
            /* Límite:  7  --> iniciador más largo: */   6,
            /* Límite:  8  --> iniciador más largo: */   7,
            /* Límite:  9  --> iniciador más largo: */   7,
            /* Límite: 10  --> iniciador más largo: */   9,
            /* Límite: 11  --> iniciador más largo: */   9,
    };

    @TestFactory
    Collection<DynamicTest> testsInicidadorSecuenciaMasLarga() {
        List<DynamicTest> tests = new ArrayList<>();
        for (int i = 0; i < ESPERADOS.length; i++) {
            final int indice = i;
            final int limite = i + 2;
            tests.add(dynamicTest("iniciadorSecuenciaMasLarga("
                            + limite + ") devuelve " + ESPERADOS[indice],
                    () -> assertEquals(ESPERADOS[indice],
                            Main.iniciadorSecuenciaMasLarga(limite))
            ));
        }
        return tests;
    }
}
