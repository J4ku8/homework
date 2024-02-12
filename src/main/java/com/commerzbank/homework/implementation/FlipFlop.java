package com.commerzbank.homework.implementation;


public class FlipFlop implements Updater {
    private boolean q;
    private final DLatch first_latch = new DLatch();
    private final DLatch second_latch = new DLatch();

    @Override
    public boolean update(boolean d, boolean enable) {
        boolean first_q = first_latch.update(d, enable);
        q = second_latch.update(first_q, !enable);
        return q;
    }

    @Override
    public boolean getOutput() {
        return q;
    }
}
