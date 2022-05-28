package com.company;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int count=1; //total array
        int cur=1;
        for(int i =1;i< nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[cur] = nums[i];
                cur++;
                count++;
            }
        }
        return count;
    }
}
