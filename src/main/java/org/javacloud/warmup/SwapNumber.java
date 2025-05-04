package org.javacloud.warmup;

import java.util.Scanner;
//saw the algorithim
public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int firstNumber=sc.nextInt();
        int secondNumber=sc.nextInt();
        System.out.println("Before Swapping First Number Is"+firstNumber+" Second Number Is "+secondNumber);
        firstNumber=firstNumber+secondNumber;
        secondNumber=firstNumber-secondNumber;
                firstNumber=firstNumber-secondNumber;
        System.out.println("After Swapping First Number Is"+firstNumber+" Second Number Is "+secondNumber);
    }
}
