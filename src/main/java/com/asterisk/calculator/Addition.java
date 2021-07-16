package com.asterisk.calculator;

public class Addition extends MyCalculation{
    @Override
    public double calculate(double x, double y) {
        return x+y;
    }

    @Override
    public int calculate(int x, int y) {
        return x+y;
    }

    @Override
    public double calculate(int x, double y) {
        return x+y;
    }

    @Override
    public double calculate(double x, int y) {
        return x+y;
    }
}
