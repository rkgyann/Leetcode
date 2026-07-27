class Solution {
    public int reverse(int x) {
        long x1=0;
        while(x!=0){
            int r=x%10;
            x1=x1*10+r;
            x/=10;
        }
        if(x1>Integer.MAX_VALUE || x1 < Integer.MIN_VALUE)
        return 0;
        
        return (int)x1;
    }
}