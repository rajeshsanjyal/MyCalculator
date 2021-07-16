package com.asterisk.calculator;

public class NullCommand extends MyCalculation{
    @Override
    public double calculate(double x, double y) {
        return 0;
    }

    @Override
    public int calculate(int x, int y) {
        return 0;
    }

    @Override
    public double calculate(int x, double y) {
        return 0;
    }

    @Override
    public double calculate(double x, int y) {
        return 0;
    }
}
