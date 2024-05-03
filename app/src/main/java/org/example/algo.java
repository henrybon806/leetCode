package org.example;

import java.util.ArrayList;

public class algo {
    public boolean isValid(String s) {
        ArrayList<Character> values = new ArrayList<>();
        if(s.length() % 2 != 0){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{'  || s.charAt(i) == '[' ){
                values.add(s.charAt(i));
            }
            else{
                if(i == 0){
                    return false;
                }
                if(values.size() > 0){
                    if((values.get(values.size() - 1) == '(' && s.charAt(i) == ')') || (values.get(values.size() - 1) == '[' && s.charAt(i) == ']') || ((values.get(values.size() - 1) == '{' && s.charAt(i) == '}'))){
                        values.remove(values.size() - 1);
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        if(values.size() == 0){
            return true;
        }
        return false;
    }
}