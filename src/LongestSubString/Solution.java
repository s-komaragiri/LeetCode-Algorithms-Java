package LongestSubString;

import java.io.*;
import java.util.*;

class Solution{
    public static void main(String args[]){
        String input="dvdf";
        int maxValue=0,i=0,j=0;

        HashMap<Character,Integer> subStringMap = new HashMap<Character,Integer>();

        while(i<input.length()&&j<input.length()){

            if(subStringMap.containsKey(input.charAt(j))){
                subStringMap.remove(input.charAt(i++));

            }else{

                subStringMap.put(input.charAt(j++),i);
                if(maxValue<subStringMap.size()){
                    maxValue=subStringMap.size();
                }
            }

        }

        System.out.println(maxValue);

    }
}
