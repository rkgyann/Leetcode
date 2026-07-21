class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int i,t=0;
        for(i=0;i<n;i++){
            t=t^nums[i];
        }
        return t;
    }
}