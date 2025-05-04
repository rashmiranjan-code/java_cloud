package org.javacloud.arraycollection;
//took time to think
public class MaxArrayElement {
    public static void main(String[] args) {
        int[] arr={45,76,98,75,654,89,87,-8,700};
        int max=0;
        for (int i=0;i<arr.length;i++){

                if(arr[i]>max){
                    max=arr[i];
                }



        }
        System.out.println(max);
    }
}
