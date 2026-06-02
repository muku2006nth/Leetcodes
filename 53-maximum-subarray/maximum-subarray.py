class Solution:
    def maxSubArray(self, nums: List[int]) -> int:

        max_sum = float('-inf')  
        c_sum = 0

        for num in nums:
            c_sum += num             

            max_sum = max(max_sum, c_sum)   

            if c_sum < 0:
                c_sum = 0                   
        return max_sum