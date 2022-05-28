package com.company;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int cur=0;
        int count=0;
        for(int i=0;i < nums.length;i++){
            if(nums[i] !=val){
                nums[cur]= nums[i];
                cur++;
                count++;
            }
        }
        return count;
    }
}
