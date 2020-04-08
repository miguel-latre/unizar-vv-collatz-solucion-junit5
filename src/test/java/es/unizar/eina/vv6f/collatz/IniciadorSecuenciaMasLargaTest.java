package es.unizar.eina.vv6f.collatz;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class IniciadorSecuenciaMasLargaTest {
    private static final int[][] PARAMETERS = {
            {2, 1},
            {3, 2},
            {4, 3},
            {5, 3},
            {6, 3},
            {7, 6},
            {8, 7},
            {9, 7},
            {10, 9}};

    private static final int INPUT_INDEX = 0;
    private static final int OUTPUT_INDEX = 1;

    @TestFactory
    Collection<DynamicTest> testsInicidadorSecuenciaMasLarga() {
        List<DynamicTest> tests = new ArrayList<>();
        for (int i = 0; i < PARAMETERS.length; i++) {
            final int testNumber = i;
            tests.add(dynamicTest("longitudCollatz(" + PARAMETERS[testNumber][INPUT_INDEX] + ")",
                    () -> assertEquals(PARAMETERS[testNumber][OUTPUT_INDEX],
                            Main.iniciadorSecuenciaMasLarga(PARAMETERS[testNumber][INPUT_INDEX]))
            ));
        }
        return tests;
    }
}
