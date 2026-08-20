class Solution {
    public long minimumSteps(String s) {

        long left = 0;
        long count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '1') {
                left++;
            } else {
                count += left;
            }
        }

        return count;
    }
}