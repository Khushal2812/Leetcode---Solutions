class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;
        for(int i=n-2;i>=0;i--){   //here we found the pivot
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot==-1){          //thats when no pivot exists
            int i=0,j=n-1;
            while(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            return;
        }
        for(int i=n-1;i>pivot;i--){     //swapping of pivot element with its continuous greater element
            if(nums[i]>nums[pivot]){
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }
        int i = pivot+1;        //here we reversed the remaining array after the pivot till the last
        int j = n-1;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return;
    }
}