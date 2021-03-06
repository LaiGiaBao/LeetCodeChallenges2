package com.company;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int curMax = nums[0];
        int max = nums[0];
        for(int i=1; i< nums.length;i++){
            curMax = Math.max(curMax+nums[i],nums[i]);
            max = Math.max(curMax,max);
        }
        return max;
    }
}
