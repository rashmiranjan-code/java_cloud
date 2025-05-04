package org.javacloud.arraycollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintDistinct {
    //took time to think
    public static void main(String[] args) {
        int[] arr = {45, 12, -3, 45, 1, 11, 12, -3};
        List<Integer> numberList=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!numberList.contains(arr[i]) ){
                numberList.add(arr[i]);

            }

        }
        System.out.println(numberList);


    }
}
