package org.example;

public class ReverseStringWithMethod {
    public static void main(String[] args) {
        String str = new String("Naresh IT");
        ReverseStringWithMethod rsm = new ReverseStringWithMethod();
        rsm.reverseString(str);
    }
    public void  reverseString(String str){
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println("String Reverse "+stringBuffer.reverse());

    }
}
