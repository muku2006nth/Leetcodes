class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        n = 0
        s = s.rstrip()
        for i in range(len(s) - 1, -1, -1):
          if s[i] == " ":
             break
          n += 1
        return n