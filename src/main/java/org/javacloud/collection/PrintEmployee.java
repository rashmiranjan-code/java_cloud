package org.javacloud.collection;

import java.util.HashMap;
//easy
public class PrintEmployee {
    public static void main(String[] args) {
        HashMap<Integer,String> empMap=new HashMap<>();
        empMap.put(321,"rashmi");
        empMap.put(322,"ram");
        System.out.println(empMap);
    }
}
