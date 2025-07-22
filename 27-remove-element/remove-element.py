class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """

        n = len(nums)
        removed = 0
        
        for i in range(n):
            if nums[i - removed] == val:  # adjust index due to shrinking list
                nums.pop(i - removed)
                removed +=1
        print (len(nums))