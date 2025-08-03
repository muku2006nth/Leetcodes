class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        count_map = {}

        for num in nums:
            if num in count_map:
                count_map[num] += 1
            else:
                count_map[num] = 1

        result = []
        for num in count_map:
            if count_map[num] == 1:
                result.append(num)

        return result
