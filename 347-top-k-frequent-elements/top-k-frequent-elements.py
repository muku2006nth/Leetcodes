class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        frequency = {}

        for i in nums :
            if i in frequency :
                frequency[i] += 1
            else :
                frequency[i] = 1

        sorted_freq_val = dict(sorted(frequency.items(), key = lambda x : x[1], reverse=True))

        return list(sorted_freq_val.keys())[:k]