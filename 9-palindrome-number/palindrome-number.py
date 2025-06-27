class Solution(object):
    def isPalindrome(self, x):
        return str(x) == str(x)[::-1]

# Function call
sol = Solution()
result = sol.isPalindrome(121)
print(result)  # Output: True


        