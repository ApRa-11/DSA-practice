class Solution {
    public int reverse(int x) {
        int sign = (x < 0) ? -1 : 1;
        long num = Math.abs((long)x);
        long rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        rev = rev * sign; 
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }

        return (int)rev;
    }
}
