class Solution {
    public void sortColors(int[] nums) {
        int c_0=0;int c_1=0;int c_2=0;
        int n=nums.length;

        for (int i=0;i<n;i++)
        {
            if (nums[i]==0){
                c_0++;
            }
            if (nums[i]==1){
                c_1++;
            }
            if (nums[i]==2){
                c_2++;
            }

        }
        int idx=0;
        for(int i=0;i<c_0;i++){
            nums[idx++]=0;
        }
        for (int i=0;i<c_1;i++){
            nums[idx++]=1;
        }
        for (int i=0;i<c_2;i++){
            nums[idx++]=2;
        }
        
    }
}