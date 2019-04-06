package ThreeSumZero;/*Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]

*/

import java.util.ArrayList;
import java.util.List;

public  class ThreeSumZero {
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> triplets = new ArrayList<>();

        List<Integer> bufferList;



        int reductionValue=0;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=i+2;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        bufferList =new ArrayList<>();
                        bufferList.add(nums[i]);
                        bufferList.add(nums[j]);
                        bufferList.add(nums[k]);
                        triplets.add(bufferList);
                        i=k;
                    }
                }
            }
        }

        System.out.println(triplets);

        return triplets;
    }

    public static void main(String args[]){
        int[] a= {-1, 0, 1, 2, -1, -4};
        ThreeSumZero.threeSum(a);
    }
}

