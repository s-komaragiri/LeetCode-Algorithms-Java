package MaximumSubArray;

class Solution2 {
    public static void main(String args[]) {
        int nums[]={-2,-1,-3,-4,-1,-2,-1,-5,-4};
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(maxSum<sum){
                maxSum=sum;
            }
            if(sum<0)
                sum=0; // that is maxSum is already holding a negative value //if negative gets added again looks for greater value and replaces
        }
        System.out.println(maxSum);
    }
}

