package org.example;

public class StringReverseWithoutBuiltIn {
    public static void main(String[] args) {

        String str = new String ("Sujini");
        System.out.println("String " + str );
        char[] ch = str.toCharArray();
        for (int i = ch.length -1; i >= 0 ; i--) {
            System.out.print(ch[i]);
        }
    }
}
