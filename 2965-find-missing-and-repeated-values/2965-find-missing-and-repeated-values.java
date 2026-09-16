class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> hs = new HashSet<>();
        int[] ans = new int[2];
        int expsum = 0,actsum = 0;
        int n = grid.length;
        for(int i =0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                actsum += grid[i][j];
                if(hs.contains(grid[i][j]))
                ans[0] = grid[i][j];
                else
                hs.add(grid[i][j]);
            }
        }
        expsum = (n*n) * (n*n+1)/2;
        int b = expsum+ans[0]-actsum;
        ans[1] = b;
        return ans;
    }
}