
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int total = n * n;

        int expectedSum = total * (total + 1) / 2;
        int actualSum = 0;
        int a = 0;

        boolean[] seen = new boolean[total + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = grid[i][j];

                actualSum += num;

                if (seen[num]) {
                    a = num;
                } else {
                    seen[num] = true;
                }
            }
        }

        int b = expectedSum + a - actualSum;

        return new int[]{a, b};
    }
}
