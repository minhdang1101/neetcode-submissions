class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = 1;
        int n = 1;
        for (int i = 1; i < nums.length; i++) {
            output[i] = n * nums[i - 1];
            n = output[i];
        }

        int rn = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] = rn * output[i];
            rn = rn * nums[i];
        }
        return output;
    }
}
