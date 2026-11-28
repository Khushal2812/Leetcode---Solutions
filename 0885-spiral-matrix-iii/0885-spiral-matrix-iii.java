class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] ans = new int[rows*cols][2];
        int num = 0;
        int r = rStart;
        int c = cStart;
        int steps = 1;
        ans[num++] = new int[]{r,c};
        while(num<rows*cols){
            for(int i=0;i<steps;i++){
            c++;
            if(r>=0 && r<rows && c>=0 && c<cols){
                ans[num++] = new int[]{r,c};
            }
        }
        for(int i=0;i<steps;i++){
            r++;
            if(r>=0 && r<rows && c>=0 && c<cols){
                ans[num++] = new int[]{r,c};
            }
        }
        steps++;
        for(int i=0;i<steps;i++){
            c--;
            if(r>=0 && r<rows && c>=0 && c<cols){
                ans[num++] = new int[]{r,c};
            }
        }
        for(int i=0;i<steps;i++){
            r--;
            if(r>=0 && r<rows && c>=0 && c<cols){
                ans[num++] = new int[]{r,c};
            }
        }
        steps++;
        }
        return ans;
    }
}