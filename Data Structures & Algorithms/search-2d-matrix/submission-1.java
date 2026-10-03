class Solution {
    public boolean searchMatrix(int[][] matrix, int t) {
int rows = matrix.length;
int cols = matrix[0].length;
int s =0;
int e = rows*cols-1;
while(s<=e){
    int m = s +(e-s)/2;
    int row = m/cols;
    int col = m%cols;
    if(matrix[row][col]<t){
        s = m+1;
    }else if(matrix[row][col]>t){
        e = m-1;
    }else {
        return true;
    }
}
return false;
    }
}
