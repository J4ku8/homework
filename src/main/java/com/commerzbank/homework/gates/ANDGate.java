package com.commerzbank.homework.gates;

public class ANDGate extends NANDGate {
    @Override
    public boolean calculate(boolean input1, boolean input2) {
        return super.calculate(super.calculate(input1, input2), super.calculate(input1, input2));
    }
}
