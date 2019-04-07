package StringAnagram;

public class Solution {
    public static void main(String[] args) {
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

        StringBuilder stringBuilder1 = new StringBuilder(a);
        StringBuilder stringBuilder2 = new StringBuilder(b);
        int i=0;
        boolean deleted=false;
        while (i < stringBuilder1.length()) {
            int j=0;
            deleted=false;
            while (j < stringBuilder2.length()) {
                if (stringBuilder1.charAt(i) == stringBuilder2.charAt(j)) {
                    stringBuilder1.deleteCharAt(i);
                    stringBuilder2.deleteCharAt(j);
                    deleted=true;
                    break;
                } else {
                    j++;
                }
            }
            if(deleted){
                i=0;
            }else {
                i++;
            }
        }

        System.out.println((stringBuilder1.length())+stringBuilder2.length());
    }
}
