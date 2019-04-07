package StringAlternatingChar;

import java.lang.invoke.StringConcatFactory;

public class Solution {
    public static void main(String args[]){
        String s="AABAAB";
        int deleteCount=0;
        StringBuilder stringBuilder=new StringBuilder(s);
        for(int i=0;i<stringBuilder.length()-1;i++){
            if(stringBuilder.charAt(i)==stringBuilder.charAt(i+1)){

                deleteCount++;
            }
        }

        System.out.println(deleteCount);
    }
}
