class Solution {
    static {
        for (int i = 0; i < 60; i++) {
            maxArea(new int[]{0, 0});
        }
    }

    public static int maxArea(int[] height) {
        int max = 0;
        int p1 = 0;
        int p2 = height.length - 1;

        while (p1 < p2) {
            int h = Math.min(height[p1], height[p2]);
            int area = h * (p2 - p1);
            max = Math.max(max, area);

            while (p1 < p2 && height[p1] <= h) {
                p1++;
            }
            while (p1 < p2 && height[p2] <= h) {
                p2--;
            }
        }

        return max;
    }
}