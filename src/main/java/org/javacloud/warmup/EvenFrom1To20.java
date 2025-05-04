package org.javacloud.warmup;

public class EvenFrom1To20 {
    public static void main(String[] args) {
        System.out.println("Even Number from 1 to 20 are:-");
        for(int i=2;i<=20;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
