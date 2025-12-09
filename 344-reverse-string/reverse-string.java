class Solution {
    public void reverseString(char[] s) {
       int right=s.length - 1;
       int left = 0;

       while(right>left){
        char temp = s[left];
        s[left]=s[right];
        s[right]=temp;
        left++;
        right--;
       }         
    }
}