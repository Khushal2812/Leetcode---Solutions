class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int diff = Integer.MAX_VALUE;
        int result = 0;
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                int x = Math.abs(target-sum);
                if(diff>x){
                    diff = x;
                    result = sum;
                }
                if(sum==target)
                return result;
                else if(sum<target)
                j++;
                else
                k--;
            }
        }
        return result;
    }
}