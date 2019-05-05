package RemoveDuplicatesArray;

/* Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.

*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1,i=1;
        while(i<nums.length){
            if(nums[i]!=nums[i-1]){
                nums[j++]=nums[i++];
            }else{
                i++;
            }
        }
        return j;
    }
}
