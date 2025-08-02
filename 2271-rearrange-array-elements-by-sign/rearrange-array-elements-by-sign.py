class Solution(object):
    def rearrangeArray(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        arr_p=[]
        arr_n=[]
        arr=[]
        for i in range (len(nums)):
            if nums[i]>0:
                arr_p.append(nums[i])
            else:
                arr_n.append(nums[i])

        n = len(arr_p)
        for i in range(n):
            arr.append(arr_p[i])
            arr.append(arr_n[i])
        return arr
                   