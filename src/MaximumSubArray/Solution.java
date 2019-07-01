package MaximumSubArray;

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            for(int j=i+1;j<nums.length;j++){
                sum=sum+nums[j];
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        return maxSum;
    }
}
