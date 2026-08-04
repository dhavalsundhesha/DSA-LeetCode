class Solution {
    public boolean isPowerOfFour(int n) {
        // Base case
        if (n == 1) return true;

        // Invalid cases
        if (n <= 0 || n % 4 != 0) return false;

        // Recursive call
        return isPowerOfFour(n / 4);
    }

}
