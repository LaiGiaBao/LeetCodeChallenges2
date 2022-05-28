package com.company;

public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
        if(needle.length() > haystack.length()){
            return -1;
        }
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            int curNeedle=0;
            int idx=0;
            if(haystack.charAt(i) == needle.charAt(curNeedle)){

                for(int j=0; j<needle.length();j++){
                    if(haystack.charAt(i+j) != needle.charAt(j)){
                        break;
                    }
                    if(j== needle.length()-1){
                        return i;
                    }
                }

            }

        }
        return -1;
    }
}
