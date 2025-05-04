package org.javacloud.arraycollection;

public class ArraySort {


    public static void main(String[] args) {
        int[] arr = {45, 5, 12, 24, 0, -3, 42, 1};
        int temp = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }


        }
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
