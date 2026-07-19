class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int i,s=0;
        int []a=null;
        if(digits[n-1]!=9){
            digits[n-1]=digits[n-1]+1;
            return digits;
        }
        else{
            int carry = 1;

            for (i = n - 1; i >= 0; i--) {
                int sum = digits[i] + carry;
                digits[i] = sum % 10;
                carry = sum / 10;

                if (carry == 0)
                    break;
            }

            if (carry == 0)
                return digits;

            a = new int[n + 1];
            a[0] = 1;

            return a;
        }
    }
}