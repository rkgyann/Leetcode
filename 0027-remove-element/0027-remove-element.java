class Solution {
    public int removeElement(int[] nums, int val) {
        int k = removeElements(nums, val);
        return k;
    }

    public int removeElements(int[] nums, int val) {
        int n = nums.length;
        int i, j, k = 0, a = n - 1;

        for (i = n - 1; i >=0; i--) {
            if (nums[i] == val) {
                int t=nums[i];
                nums[i]=nums[a];
                nums[a--]=t;
                k++;
            }
        }

        return n-k;
    }

}