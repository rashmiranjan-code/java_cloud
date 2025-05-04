package org.javacloud.string;


public class PalindromCheck {
    public static void main(String[] args) {
        String orginalString = "madam";
        char[] ch = orginalString.toCharArray();
        String afterReverse = "";
        for (int i = ch.length - 1; i >= 0; i--) {

            afterReverse = afterReverse + ch[i];


        }
        if (orginalString == afterReverse) {
            System.out.println("is is a palindrom string");

        }
    }
}
