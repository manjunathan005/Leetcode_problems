class Solution {
    public int countPoints(String rings) {
        int[] r = new int[10];
        int[] g = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < rings.length(); i += 2) {

            char color = rings.charAt(i);
            int rod = rings.charAt(i + 1) - '0';

            if (color == 'R') {
                r[rod]++;
            } else if (color == 'G') {
                g[rod]++;
            } else {
                b[rod]++;
            }
        }
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (r[i] > 0 && g[i] > 0 && b[i] > 0) {
                count++;
            }
        }

        return count;
    }
}