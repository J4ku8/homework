package com.commerzbank.homework.unitTests.gates;

import com.commerzbank.homework.gates.NORGate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NORGateTest {
    private final NORGate gate = new NORGate();

    @Test
    public void testNOR(){
        assertTrue(gate.calculate(false, false));
        assertFalse(gate.calculate(false, true));
        assertFalse(gate.calculate(true, true));
        assertFalse(gate.calculate(true, true));
    }

}
