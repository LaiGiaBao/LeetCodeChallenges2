package com.company;

import java.util.HashMap;

/*
* Given two strings s and t, return true if t is an anagram of s, and false otherwise.
*
* An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
* typically using all the original letters exactly once.*/
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<String, Integer> wordCount= new HashMap<>();
        HashMap<String, Integer> wordCount2= new HashMap<>();
        String[] words = s.split("");
        String[] words2 = t.split("");
        for(String word: words) {
            if(!wordCount.containsKey(word)){
                wordCount.put(word,1);
            }
            else {
                int count = wordCount.get(word);
                count++;
                wordCount.replace(word,count);
            }
        }
        for(String word: words2) {
            if(!wordCount2.containsKey(word)){
                wordCount2.put(word,1);
            }
            else {
                int count = wordCount2.get(word);
                count++;
                wordCount2.replace(word,count);
            }
        }
        for(String word: wordCount2.keySet()) {
            int count1=0;
            if(wordCount.containsKey(word)){
                count1=wordCount.get(word);
            }else{
                return false;
            }
            int count2 = wordCount2.get(word);
            if(count1 != count2) {
                return false;
            }
        }
        return true;
    }
}
