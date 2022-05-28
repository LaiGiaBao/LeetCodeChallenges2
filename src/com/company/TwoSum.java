package com.company;

import java.util.HashMap;
import java.util.Map;

/*
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> sum = new HashMap<>();
        int[] results = new int[2];
        for(int i=0; i<nums.length;i++){
            int num2 = target - nums[i];
            if(sum.containsKey(num2)) {
                return new int[]{i,sum.get(num2)};

            }
            sum.put(nums[i],i);

        }
        return new int[]{};
    }
}
