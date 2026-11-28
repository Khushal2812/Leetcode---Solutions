class Solution {
    public int[][] generateMatrix(int n) {
      int[][] arr = new int[n][n];
      int Mincol=0,Minrow=0,Maxcol=n-1,Maxrow=n-1;
      int num =1;
      while(Minrow<=Maxrow && Mincol<=Maxcol){
        for(int i=Mincol;i<=Maxcol;i++){
            arr[Minrow][i]=num++;
        }
        Minrow++;
        for(int i=Minrow;i<=Maxrow;i++){
            arr[i][Maxcol]=num++;
        }
        Maxcol--;
        for(int i=Maxcol;i>=Mincol;i--){
            arr[Maxrow][i]=num++;
        }
        Maxrow--;
        for(int i=Maxrow;i>=Minrow;i--){
            arr[i][Mincol]=num++;
        }
        Mincol++;
      }  
      return arr;
    }
}