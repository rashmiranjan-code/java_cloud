package org.javacloud.exceptionhandeling;

import java.util.Scanner;
//easy
public class ArithimaticExceptionHandeling {
    public  static int divideTwoNumber(int a,int b){
        int result=0;
        try {
             result = a / b;
        }
catch (ArithmeticException ae){
            System.out.println("Divisor Can not be zero");
        }
        catch(Exception e){
            e.getMessage();
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int firstNumber= sc.nextInt();
        int secondNumber=sc.nextInt();
        System.out.println(divideTwoNumber(firstNumber,secondNumber));

    }
}
