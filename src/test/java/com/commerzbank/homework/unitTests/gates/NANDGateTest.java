package com.commerzbank.homework.unitTests.gates;

import com.commerzbank.homework.gates.NANDGate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NANDGateTest {
    private final NANDGate gate = new NANDGate();

    @Test
    public void testNand() {
        assertTrue(gate.calculate(false, false));
        assertTrue(gate.calculate(false, true));
        assertTrue(gate.calculate(true, false));
        assertFalse(gate.calculate(true, true));
    }
}
