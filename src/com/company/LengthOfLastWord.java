package com.company;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String last = s.split(" ")[s.split(" ").length-1];
        return last.length();
    }
}
