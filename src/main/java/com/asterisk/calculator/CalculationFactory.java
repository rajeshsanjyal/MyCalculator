package com.asterisk.calculator;

public class CalculationFactory {
    public static MyCalculation get(String operator){
        MyCalculation myCalculation=null;
        switch (operator){
            case "add":
                myCalculation=new Addition();
                break;
            case "sub":
                myCalculation= new Subtraction();
                break;
            case "mul":
                myCalculation= new Multiplication();
                break;
            case "div":
                myCalculation= new Division();
                break;
            default:
                myCalculation= new NullCommand();
                break;
        }
        return myCalculation;
    }
}
