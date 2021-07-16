package com.asterisk.calculator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class History {
    public void Write(Double operand1,Double operand2,String operator,Double result){
        Calculator calculator=new Calculator();
        calculator.setOp1(operand1);
        calculator.setOp2(operand2);
        calculator.setOperator(operator);
        calculator.setResult(result);
        try
        {
            FileOutputStream fileOutputStream=new FileOutputStream("calHistory.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(calculator);
            objectOutputStream.close();
            fileOutputStream.close();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    public Calculator Read(){
        Calculator calculator=null;
        try{
            FileInputStream fileInputStream=new FileInputStream("calHistory.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            calculator= (Calculator) objectInputStream.readObject();
            System.out.println(calculator);
            fileInputStream.close();
            objectInputStream.close();
        }catch (Exception ex){
            System.out.println(ex);
        }
        return calculator;
    }
}
