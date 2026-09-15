class Solution {
    public int[] rearrangeArray(int[] nums) {
        int left = 0;
        int right = 0;
        int[] positive = new int[nums.length/2];
        int[] negative = new int[nums.length/2];
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                positive[left] = nums[i];
                left++;
            }
            else{
                negative[right] = nums[i];
                right++;
            }
        }
        left = 0;
        for(int i=0;i<positive.length;i++){
            result[left++] = positive[i];
            result[left++] = negative[i];
        }
        return result;
    }
}