class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
       int n = img1.length;
       int answer = 0;
       for(int down = -(n-1) ; down<=n-1 ; down++){
        for(int right = -(n-1) ; right<=n-1 ; right++){
            int count = 0;
            for(int row = 0;row<n;row++){
                for(int col = 0;col<n;col++){
                    if(img1[row][col]==1){
                        int NewRow = row + down;
                        int NewCol = col + right;
                        if(NewRow>=0 && NewRow<n && NewCol>=0 && NewCol<n && img2[NewRow][NewCol]==1){
                            count++;
                        }
                    }
                }
            }
            answer = Math.max(answer,count);
        }
       }
       return answer; 
    }
}