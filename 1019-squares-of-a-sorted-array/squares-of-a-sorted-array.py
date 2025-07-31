class Solution(object):
    def sortedSquares(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        nums.sort()
        n=len(nums)
        ar=[]
        for i in range(n):
            x=nums[i]*nums[i]
            ar.append(x)
        ar.sort()    
        return ar    


        