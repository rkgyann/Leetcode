import java.util.Arrays;

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) ->
            a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]
        );

        int ans = 0;
        int maxEnd = -1;

        for (int[] in : intervals) {
            if (in[1] > maxEnd) {
                ans++;
                maxEnd = in[1];
            }
        }

        return ans;
    }
}