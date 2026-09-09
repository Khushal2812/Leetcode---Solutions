class Solution {
    public long countCommas(long n) {
        long a = Math.max(n-999,0);
        long b = Math.max(n-999999,0);
        long c = Math.max(n-999999999,0);
        long d = Math.max(n-999999999999L,0);
        long e = Math.max(n-999999999999999L,0);
        return a+b+c+d+e;
    }
}