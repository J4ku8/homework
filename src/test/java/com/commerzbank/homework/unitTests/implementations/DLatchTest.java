package com.commerzbank.homework.unitTests.implementations;

import com.commerzbank.homework.implementation.DLatch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DLatchTest {
    private final DLatch dLatch = new DLatch();

    @Test
    public void testDlatch() {
        assertFalse(dLatch.update(false, true));
        assertTrue(dLatch.update(true, true));
    }
}
