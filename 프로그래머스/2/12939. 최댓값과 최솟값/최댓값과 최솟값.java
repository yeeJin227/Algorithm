import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s) {
        
        String[] arr = s.split(" ");
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(String str : arr){
            int num = Integer.parseInt(str);
            if(num > max){
                max = num;
            }
            if(num < min){
                min= num;
            }
        }
        
        return min+" "+max;
    }
}