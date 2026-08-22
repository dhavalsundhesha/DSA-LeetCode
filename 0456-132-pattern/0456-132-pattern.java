class Solution {
    public boolean find132pattern(int[] nums) {

        int second = Integer.MIN_VALUE;

        java.util.Stack<Integer> stack = new java.util.Stack<>();

        for (int i = nums.length - 1; i >= 0; i--) {

            if (nums[i] < second) {
                return true;
            }

            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                second = stack.pop();
            }

            stack.push(nums[i]);
        }

        return false;
    }
}