package com.company;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        HashMap<Character,Character> parenthesisMap = new HashMap<>();
        Stack<Character> parenthesisStack = new Stack<>();
        parenthesisMap.put('(',')');
        parenthesisMap.put('{','}');
        parenthesisMap.put('[',']');
        for(int i =0;i< s.length();i++){
            if (parenthesisMap.containsKey(s.charAt(i)) ) {
                parenthesisStack.push(s.charAt(i));
            }
            if (parenthesisMap.containsValue(s.charAt(i))){
                if (parenthesisStack.isEmpty()) {
                    return false;
                }
                else {
                    if(parenthesisMap.get(parenthesisStack.pop())!=s.charAt(i)){
                        return false;
                    }
                }
            }
        }
        return parenthesisStack.isEmpty();
        
    }
}
