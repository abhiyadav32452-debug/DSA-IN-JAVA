class Solution {
    static final long MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        return (int) (pow(5, even) * pow(4, odd) % MOD);
    }

    private long pow(long x, long n) {
        long ans = 1;

        while (n > 0) {
            if (n % 2 == 1) {
                ans = ans * x % MOD;
            }

            x = x * x % MOD;
            n /= 2;
        }

        return ans;
    }
}