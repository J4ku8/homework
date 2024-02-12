package com.commerzbank.homework.unitTests.gates;

import com.commerzbank.homework.gates.XORGate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class XORGateTest {
    private final XORGate gate = new XORGate();

    @Test
    public void testNOR(){
        assertTrue(gate.calculate(true, false));
        assertTrue(gate.calculate(false, true));
        assertFalse(gate.calculate(true, true));
        assertFalse(gate.calculate(false, false));
    }
}
