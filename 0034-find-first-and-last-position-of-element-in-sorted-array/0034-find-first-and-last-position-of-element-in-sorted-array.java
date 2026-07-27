class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int []a={-1,-1};
        int i;
        for(i=0;i<n;i++){
            if(nums[i]==target){
                a[0]=i;
                break;
            }
        }
        for(i=n-1;i>=0;i--){
            if(nums[i]==target){
                a[1]=i;
                break;
            }
        }
        return a;
    }
}