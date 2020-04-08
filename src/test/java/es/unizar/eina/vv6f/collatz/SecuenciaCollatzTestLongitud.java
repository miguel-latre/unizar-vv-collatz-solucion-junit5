package es.unizar.eina.vv6f.collatz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static es.unizar.eina.vv6f.collatz.SecuenciaCollatzTestSiguiente.EXAMPLE_SEQUENCE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class SecuenciaCollatzTestLongitud {

    private static final int[] INPUTS =  {1, 2, 3, 4, 5, 6,  7, 8,  9, 10, 13, 16, 20, 40};
    private static final int[] OUTPUTS = {1, 2, 8, 3, 6, 9, 17, 4, 20,  7, 10,  5,  8,  9};

    @TestFactory
    Collection<DynamicTest> testsSecuenciasCollatzLongitud() {
        List<DynamicTest> tests = new ArrayList<>();
        for (int i = 0; i < INPUTS.length; i++) {
            final int testNumber = i;
            tests.add(dynamicTest("longitud iniciando en " + INPUTS[i]
                            + " es de " + OUTPUTS[testNumber] + " elementos",
                    () -> assertEquals(OUTPUTS[testNumber],
                            new SecuenciaCollatz(INPUTS[testNumber]).longitud())));
        }
        return tests;
    }

    @TestFactory
    Collection<DynamicTest> testsSecuenciasCollatzLongitud_secuenciaEjemplo() {
        List<DynamicTest> tests = new ArrayList<>();
        for (int i = 0; i < EXAMPLE_SEQUENCE.length; i++) {
            final int testNumber = i;
            final int inicio = EXAMPLE_SEQUENCE[i];
            final int longitud = EXAMPLE_SEQUENCE.length - i;
            tests.add(dynamicTest("longitud iniciando en " + inicio
                            + " es de " + longitud + " elementos",
                    () -> assertEquals(longitud,
                            new SecuenciaCollatz(inicio).longitud())));
        }
        return tests;
    }


    @Test
    @DisplayName("assert new SecuenciaCollatz(0) lanza IllegalArgumentException")
    public void testSiguienteCollatz_0() {
        assertThrows(IllegalArgumentException.class,
                () -> new SecuenciaCollatz(0));
    }

    @Test
    @DisplayName("assert new SecuenciaCollatz(-1) lanza IllegalArgumentException")
    public void testSiguienteCollatz_negativo() {
        assertThrows(IllegalArgumentException.class,
                () -> new SecuenciaCollatz(0));
    }

}
