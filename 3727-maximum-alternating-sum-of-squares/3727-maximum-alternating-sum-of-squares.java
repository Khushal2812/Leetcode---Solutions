class Solution {
    public long maxAlternatingSum(int[] nums) {
        long negativeSum = 0;
        long positiveSum = 0;
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length/2;i++){
            negativeSum += nums[i];
        }
        for(int i=(int)Math.ceil(nums.length/2);i<nums.length;i++){
            positiveSum += nums[i];
        }
        long result = positiveSum - negativeSum;
        return result;
    }
}