package com.company;

public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        int xtemp = x;
        int reverse=0;
        while(xtemp !=0) {
            reverse = reverse * 10 + xtemp % 10;
            xtemp /=10;
        }
        return x == reverse;
    }
}
