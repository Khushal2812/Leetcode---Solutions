class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;
        long sum = 0;
        long max = 0;
        for(int right =0;right<nums.length;right++){
            sum +=nums[right];
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            if(right-left+1==k){
                if(map.size()==k){
                    max = Math.max(sum,max);
                }
                if(map.get(nums[left])==1){
                    map.remove(nums[left]);
                }
                else{
                    map.put(nums[left],map.get(nums[left])-1);
                }
                sum -= nums[left]; 
                left++;
            }
        }
        return max;
    }
}