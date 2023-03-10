package org.example;

import java.io.IOException;

public class SumCalculator {
    public static void main(String[] args) throws IOException {

        SumCalculator sumCalculator = new SumCalculator();
        System.out.println("set current n: ");
        System.out.println(sumCalculator.sum(System.in.read()));
    }
    int sum (int current) throws IllegalArgumentException {
        if (current == 0) {
            throw new IllegalArgumentException();
        }
        for (int i = current - 1; i >= 0; --i) current+=i;
        return current;
    }
}