class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int i, c = 0, d = 0;

        for(i = 0; i < n; i++) {
            if(c == 0) {
                d = nums[i];
            }

            if(nums[i] == d)
                c++;
            else
                c--;
        }

        return d;
    }
}