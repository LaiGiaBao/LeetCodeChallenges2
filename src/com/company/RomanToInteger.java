package com.company;

import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> roman= new HashMap<>();
        int total=0;
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        for(int i=0; i<s.length();i++) {
            int current = roman.get(s.charAt(i));
            if (i==0) {
                total+= current;
            } else {
                int before = roman.get(s.charAt(i-1));
                if (current <= before) {
                    total += current;
                }
                else {
                    total += current - before *2;
                }
            }
        }
        return total;
    }
}
