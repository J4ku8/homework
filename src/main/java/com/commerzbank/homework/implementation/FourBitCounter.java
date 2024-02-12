package com.commerzbank.homework.implementation;

import java.util.ArrayList;

public class FourBitCounter {
    private final int size = 4;
    private final ArrayList<OneBitCounter> counters = new ArrayList<>();

    private final ArrayList<Boolean> result = new ArrayList<>();
    public int getResult() {
        return binaryToDecimal(result);
    }

    public FourBitCounter() {
        for (int i = 0; i < this.size; i++) {
            this.counters.add(new OneBitCounter());
        }
    }

    public void count(Boolean q, int level) {
        if (level == size) {
            return;
        }
        OneBitCounter currentCounter = counters.get(level);
        boolean next = !currentCounter.increment(q);
        result.add(currentCounter.getQ());
        count(next, level + 1);
    }

    private int binaryToDecimal(ArrayList<Boolean> binaryArray) {
        int decimalNumber = 0;
        for (Boolean value : binaryArray) {
            decimalNumber = decimalNumber * 2 + (value ? 1 : 0);
        }
        return decimalNumber;
    }
}
