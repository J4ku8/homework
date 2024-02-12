package com.commerzbank.homework.gates;

public class XORGate implements Calculator {
    @Override
    public boolean calculate(boolean input1, boolean input2) {
        return input1 != input2;
    }
}
