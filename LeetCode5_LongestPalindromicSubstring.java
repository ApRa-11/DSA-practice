//LeetCode 5
//Longest Palindromic Substring 
//Level - Medium
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        int start = 0, end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // Odd-length palindrome
            int left = i, right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left > end - start) {
                    start = left;
                    end = right;
                }
                left--;
                right++;
            }
            
            // Even-length palindrome
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left > end - start) {
                    start = left;
                    end = right;
                }
                left--;
                right++;
            }
        }
        
        return s.substring(start, end + 1);
    }
}
