package com.company;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        //nums = [0,1,3]
        //nums2 = [0,1,2,3]
        int length = nums.length+1;
        int sum1 = 0;
        int sum2 =0;
        for(int i=0;i<= nums.length;i++) {
            if(i < nums.length) {
                sum1+=nums[i];
            }
            sum2 += i;
        }
        return sum2 - sum1;
    }
}
