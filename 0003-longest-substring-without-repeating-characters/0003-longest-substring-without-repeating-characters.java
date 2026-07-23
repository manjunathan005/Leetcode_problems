class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int maxLen = 0;

        for (int j = 0; j < s.length(); j++) {
            for (int k = i; k < j; k++) {
                if (s.charAt(k) == s.charAt(j)) {
                    i = k + 1;
                    break;
                }
            }
            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;
    }
}