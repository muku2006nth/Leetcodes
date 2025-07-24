class Solution(object):
    def findNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        count_1 = 0
        for i in range(len(nums)):
            count = 0
            x = str(nums[i])
            for f in x:
                count += 1
            if count % 2 == 0:
                count_1 += 1
        return count_1


