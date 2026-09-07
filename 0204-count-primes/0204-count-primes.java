class Solution {
    public int countPrimes(int n) {

        boolean[] a = new boolean[n];

        int p = 0;

        for (int i = 2; i < n; i++) {
            if (a[i] == false) {
                p++;

                for (int j = i * 2; j < n; j = j + i) {
                    a[j] = true;
                }
            }
        }

        return p;
    }
}