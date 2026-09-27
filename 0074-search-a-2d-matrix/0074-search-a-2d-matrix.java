class Solution {
    public boolean searchcol(int[][] matrix, int target,int row){
       int n = matrix[0].length;
       int start = 0;
       int end = n-1;
       while(start<=end){
        int mid = start + (end-start)/2;
        if(target == matrix[row][mid]){
            return true;
        }
        else if(target>matrix[row][mid]){
            start = mid+1;
        }
        else{
            end = mid-1;
        }
       }
       return false; 
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int startrow = 0;
        int endrow = m-1;
        while(startrow<=endrow){
            int mid = startrow + (endrow-startrow)/2;
            if(target>=matrix[mid][0] && target<=matrix[mid][n-1]){
                return searchcol(matrix,target,mid);
            }
            else if(target>=matrix[mid][n-1]){
                startrow = mid+1;
            }
            else{
                endrow = mid-1;
            }
        }
        return false;
    }
}