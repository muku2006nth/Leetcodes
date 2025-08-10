class Solution(object):
    def removeOuterParentheses(self, s):
        """
        :type s: str
        :rtype: str
        """
        n=len(s)
        count=0
        ans=""
        for i in range (n):
             if s[i] == ')':
                count -= 1
             if count != 0:
                ans += s[i]
             if s[i] == '(':
                count += 1
        return ans           