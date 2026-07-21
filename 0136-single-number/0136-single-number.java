class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int i,j,c,t=0;
        for(i=0;i<n;i++){
            c=0;
            for(j=0;j<n;j++){
                if(nums[i]==nums[j])
                c++;
            }
            if(c<2){
                t=nums[i];
                continue;
            }
        }
        return t;
    }
}