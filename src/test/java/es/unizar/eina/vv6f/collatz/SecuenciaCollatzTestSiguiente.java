package es.unizar.eina.vv6f.collatz;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;
import static es.unizar.eina.vv6f.collatz.SecuenciaCollatz.siguienteCollatz;

@SuppressWarnings("ResultOfMethodCallIgnored")
public class SecuenciaCollatzTestSiguiente {
    public static final int[] EXAMPLE_SEQUENCE = {13, 40, 20, 10, 5, 16, 8, 4, 2, 1};

    @TestFactory
    Collection<DynamicTest> testsSecuenciasCollatzSiguiente() {
        List<DynamicTest> tests = new ArrayList<DynamicTest>();
        for (int i = 0; i < EXAMPLE_SEQUENCE.length - 1; i++) {
            final int testNumber = i;
            tests.add(dynamicTest(" assert siguienteCollatz("
                            + EXAMPLE_SEQUENCE[testNumber] + ") es "
                            + EXAMPLE_SEQUENCE[testNumber + 1],
                    () -> Assertions.assertEquals(EXAMPLE_SEQUENCE[testNumber + 1],
                            siguienteCollatz(EXAMPLE_SEQUENCE[testNumber]))));
        }
        return tests;
    }

    @Test
    @DisplayName("assert siguienteCollatz(0) lanza IllegalArgumentException")
    public void testSiguienteCollatz_0() {
        assertThrows(IllegalArgumentException.class,
                () -> SecuenciaCollatz.siguienteCollatz(0));
    }

    @Test
    @DisplayName("assert siguienteCollatz(-1) lanza IllegalArgumentException")
    public void testSiguienteCollatz_negativo() {
        assertThrows(IllegalArgumentException.class,
                () -> SecuenciaCollatz.siguienteCollatz(-1));
    }
}
