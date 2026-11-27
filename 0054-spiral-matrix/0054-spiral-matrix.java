class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length,m = matrix[0].length;
        int Minrow=0,Mincol=0,Maxrow=n-1,Maxcol=m-1;
        while(Minrow<=Maxrow && Mincol<=Maxcol){
            for(int i=Mincol;i<=Maxcol;i++){
                ans.add(matrix[Minrow][i]);
            }
            Minrow++;
            for(int i=Minrow;i<=Maxrow;i++){
                ans.add(matrix[i][Maxcol]);
            }
            Maxcol--;
            if(Minrow<=Maxrow){
                for(int i=Maxcol;i>=Mincol;i--){
                ans.add(matrix[Maxrow][i]);
            }
            Maxrow--;
            }
            if(Mincol<=Maxcol){
                for(int i=Maxrow;i>=Minrow;i--){
                ans.add(matrix[i][Mincol]);
            }
            Mincol++;
            }
            
        }
        return ans;
    }
}