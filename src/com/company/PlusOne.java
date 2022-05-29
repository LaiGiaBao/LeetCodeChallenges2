package com.company;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int[] newDigits = new int[length+1];
        digits[length-1] = digits[length-1]+1;
        for(int i=length;i>0;i--){
            newDigits[i] += digits[i-1];
            if (newDigits[i]==10){
                newDigits[i]=0;
                newDigits[i-1] +=1;
            }
        }
        if(newDigits[0] ==0) {
            return Arrays.copyOfRange(newDigits,1,newDigits.length);
        }
        else{
            return newDigits;
        }
    }
}
