class Solution {
    public boolean searchMatrix(int[][] matrix, int t) {
               for(int i=0;i<matrix.length;i++){
        int s = 0;
        int e = matrix[i].length-1;
        while(s<=e){
            int m = s +(e-s)/2;
            if(matrix[i][m]<t){
           s = m+1;
            }else if(matrix[i][m]>t){
                e = m-1;
            }else{
                return true;
            }
        }
       } 
       return false;
    }
}
