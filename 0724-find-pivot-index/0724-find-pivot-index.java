class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];

        prefix[0] = nums[0];

        for(int i = 1; i < n; i++) {
            prefix[i] = nums[i] + prefix[i-1];
        }

        int total = prefix[n-1];

        for(int i = 0; i < n; i++) {
            int leftSum = (i == 0) ? 0 : prefix[i-1];
            int rightSum = total - prefix[i];

            if(leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}