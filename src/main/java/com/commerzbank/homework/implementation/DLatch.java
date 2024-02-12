package com.commerzbank.homework.implementation;

import com.commerzbank.homework.gates.NANDGate;

public class DLatch implements Updater {
    private final NANDGate nandGate = new NANDGate();
    private boolean q = false;

    @Override
    public boolean update(boolean d, boolean enable) {
        boolean store = nandGate.calculate(d, enable);
        boolean reset = nandGate.calculate(store, q);
        boolean inverse = nandGate.calculate(!store, !q);
        q = nandGate.calculate(reset, inverse);
        return q;
    }

    @Override
    public boolean getOutput() {
        return q;
    }
}
