class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int i,t=-1;
        if(target>nums[n-1])
        t=n;
        else if(target<nums[0])
        t=0;
        else
            for(i=0;i<n;i++){
                if(nums[i]==target)
                t=i;
                else if(target<nums[i] && target>nums[i-1] && i>0)
                t=i;
            }
        return t;
    }
}