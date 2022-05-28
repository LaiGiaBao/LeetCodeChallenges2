package com.company;

import java.util.ArrayList;

/*
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.
 */
public class ContainsDuplicate {
    public boolean containDuplicate(int[] lst) {
        ArrayList<Integer> duplicated = new ArrayList<>();
        for(int number: lst) {
            if (duplicated.contains(number)) {
                return true;
            }
            else {
                duplicated.add(number);
            }
        }
        return false;
    }
}
