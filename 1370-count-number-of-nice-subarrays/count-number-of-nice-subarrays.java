class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       int right=0;
       int left=0;
       int oddcount=0;
       int result=0;
       int tempresult=0;

       while (right<nums.length){
        if(nums[right]%2!=0){
            oddcount++;
            tempresult=0;
        }
        while (oddcount==k){
            tempresult++;
            if(nums[left]%2!=0){
                oddcount--;
            }
            left++;    
        }
        result=result+tempresult;
        right++;
       }
       return result;    
    }
}