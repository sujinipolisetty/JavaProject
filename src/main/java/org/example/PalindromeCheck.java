package org.example;

import com.sun.deploy.security.SelectableSecurityManager;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = new String("madam");
        PalindromeCheck palindromeCheck = new PalindromeCheck();
        boolean results =palindromeCheck.isPalindrome(str);
        System.out.println("Is Palindrome "+results);
    }
    public boolean isPalindrome(String str){
        StringBuffer reverseSting = new StringBuffer(str);
        if (str.equalsIgnoreCase(reverseSting.reverse().toString())) {
            return true;
        }
        else {
            return false;
        }
    }
}
