class Solution {
    public void setZeroes(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0)
                   inOrderReverse(matrix,i,j);
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == -99)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }    
        public void inOrderReverse(int[][] matrix,int row,int col){
            for(int i=0;i<matrix.length;i++){
                matrix[i][col] = matrix[i][col] == 0 ?0:-99;
            }
            for(int j=0;j<matrix[0].length;j++){
                matrix[row][j] = matrix[row][j] == 0?0:-99;
            }
        }
}
