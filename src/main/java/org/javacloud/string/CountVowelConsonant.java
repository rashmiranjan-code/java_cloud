package org.javacloud.string;

public class CountVowelConsonant {
    //easy
    public static void main(String[] args) {
        String s="cuttack fdfdwfw ae i o ffs u";
        char[] ch=s.toCharArray();
        int vowelCount=0;
        int consCount=0;
        for(int i=0;i< ch.length;i++){
            if((ch[i]== 'a' )|| (ch[i]=='e') || (ch[i]=='i') ||(ch[i]== 'o' ) || (ch[i]== 'o' )){
                vowelCount++;

            }
            else {
                consCount++;
            }
        }
        System.out.println("Total Number of Vowels are "+vowelCount+"total Number of Consonant are "+consCount);
    }
}
