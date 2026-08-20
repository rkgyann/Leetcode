class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int t = n;

        for (int i = 0; i < n; i++) {
            t ^= i ^ nums[i];
        }

        return t;
    }
}