class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int i,j;
        int[] output= new int[2];
        for(i=0;i<n;i++){
            int a=nums[i];
            for(j=0;j<n;j++){
                int b=nums[j];
                if(i==j)
                continue;
                if(a+b==target){
                    output[0]=i;
                    output[1]=j;
                }
            }
        }
        return output;
    }
}