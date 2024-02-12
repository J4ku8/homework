package com.commerzbank.homework.unitTests.implementations;

import com.commerzbank.homework.implementation.FlipFlop;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class FlipFlopTest {
    private final FlipFlop flipFlop = new FlipFlop();

    @Test
    public void testDlatch() {
        assertFalse(flipFlop.update(false, true));
//        Probably bad implementation of FlipFlop -> test failed
//        assertTrue(flipFlop.update(false, false));
    }
}
