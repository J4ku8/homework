package com.commerzbank.homework.implementation;

import java.util.Objects;

public class OneBitCounter {
      private boolean negative_q;

    public boolean getQ() {
        return !negative_q;
    }
    FlipFlop flipFlop = new FlipFlop();

    public boolean increment(Boolean q) {
        boolean data;
        data = Objects.requireNonNullElseGet(q, () -> this.negative_q);
        this.negative_q = !flipFlop.update(data, true);
        return this.negative_q;
    }

}
