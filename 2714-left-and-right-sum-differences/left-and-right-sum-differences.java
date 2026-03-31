class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftsum[]=new int[nums.length];
        int rightsum[]=new int[nums.length];
        leftsum[0]=0;
        rightsum[nums.length-1]=0;
        int r_index=0, l_index=1;
        for(int i=0; i<nums.length-1; i++){
          leftsum[i+1] = sumOfArray(nums, 0, i);
        }

        for(int i=0; i<nums.length; i++){
            rightsum[r_index++]=sumOfArray(nums,i+1, nums.length-1);
        }
        int answer[]=new int[nums.length];
        for (int i=0; i<answer.length;i++){
            answer[i]=Math.abs(rightsum[i]-leftsum[i]);
        }     
        return answer;
    }

    private static int sumOfArray(int nums[], int start, int end){
        int sum=0;
        for(int i=start; i<=end;i++){
            sum += nums[i];
        }
        return sum;
    }
}