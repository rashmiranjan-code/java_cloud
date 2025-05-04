package org.javacloud.arraycollection;

import java.util.HashMap;
import java.util.Map;

public class PrintUnique {
    public static void main(String[] args) {
        int[] arr = {45, 12, -3, 45, 1, 11, 12, -3};
        HashMap<Integer, Integer> occMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!occMap.containsKey(arr[i])) {
                occMap.put(arr[i], 1);
            } else {
                occMap.put(arr[i], occMap.getOrDefault(arr[i], 1) + 1);
            }

        }
        System.out.println("The Distinct Element Are");
        for (Map.Entry<Integer, Integer> hs : occMap.entrySet()) {
            if (hs.getValue() == 1) {
                System.out.println(hs.getKey());

            }
        }
    }
}
