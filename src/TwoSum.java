/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

Source : LeetCode
 */

public class TwoSum {

    public  static int[] twoSum(int[] nums, int target) {
        int resultIndices[] = new int[2];
        int sum=0;
        int value;
        for(int i=0;i<nums.length;i++){
            value=nums[i];
            resultIndices[0]=i;

            for(int j=0;j<nums.length;j++) {
                if(i!=j) {
                    sum = value + nums[j];
                    if(sum==target){
                        resultIndices[1]=j;
                        return resultIndices;
                    }else{
                        sum=0;
                    }
                }
            }

        }
        return resultIndices;
    }

    public static void main(String[] args){

        int a[]={2,7,11,15};
        int resultIndices[];
        resultIndices=twoSum(a,13);
            for (int i = 0; i < resultIndices.length; i++) {
                System.out.println(resultIndices[i]);
            }
    }
}
