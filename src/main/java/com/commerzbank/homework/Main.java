package com.commerzbank.homework;

import com.commerzbank.homework.implementation.FourBitCounter;

public class Main {
    public static void main(String[] args) {
        FourBitCounter counter = new FourBitCounter();
        counter.count(null, 0);
        System.out.println(counter.getResult());
    }
}
