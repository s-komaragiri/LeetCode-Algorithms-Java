package StringSherlockValid;

public class Solution {
    public static void main(String args[]){
        String s="aabbc";
        int count=0;
        String result="YES";
        for(int i=0;i<s.length()-1;i++){

            if(s.charAt(i)==s.charAt(i+1)){
                count++;
                if(count>1){
                    result="NO";
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
