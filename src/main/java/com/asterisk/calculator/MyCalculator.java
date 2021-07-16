package com.asterisk.calculator;

import java.util.Locale;
import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        System.out.println("This is my Calculator");
        calstart();

    }
    public static void mycal(){

        History history=new History();
        System.out.println("Enter first operand:");
        Scanner sc1=new Scanner(System.in);
        Double operand1= sc1.nextDouble();
        System.out.println("Enter second operand:");
        Double operand2=sc1.nextDouble();
        System.out.println("Enter operation:");
        String operator=sc1.next();
        MyCalculation myCalculation=CalculationFactory.get(operator);
        Double result=myCalculation.calculate(operand1,operand2);
        System.out.println(result);
        history.Write(operand1,operand2,operator,result);
    }
    public static void checkMore(){
        System.out.println("Do you want to continue?Press any key to continue and press \"N\" for quite !!");
        Scanner in=new Scanner(System.in);
        String mykey=in.next().toUpperCase(Locale.ROOT);
        if (mykey=="N"){
            System.out.println("Thanks for using calculator");
            in.close();
        }else{
            calstart();
        }
    }
    public static void calstart(){
        System.out.println("Enter a key");
        System.out.println("H for history");
        System.out.println("C for calculation");
        System.out.println("Q for quit calculator");
        Scanner scanner=new Scanner(System.in);
        String key=scanner.nextLine().toUpperCase(Locale.ROOT);
        History history=new History();
        switch (key){
            case "H":
                history.Read();
                checkMore();
                break;
            case "C":
                mycal();
                checkMore();
                break;
            case "Q":
                System.out.println("Thank you for using our calculator ! Have a good day");
                break;
            default:
                System.out.println("Invalid Command");
                checkMore();
                break;
        }
    }
}
