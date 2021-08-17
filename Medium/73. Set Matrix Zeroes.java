// Time Complexity: O(M*N) if M and N are the numbers of rows and columns
// Space Complexity: O(M+N)

class Solution {
    public void setZeroes(int[][] matrix) {
         List<Integer>row_set = new ArrayList<>();
        List<Integer>col_set = new ArrayList<>();

        for(int row = 0; row<matrix.length; row++){
            for(int col = 0; col<matrix[row].length; col++){
                if (matrix[row][col]==0){
                    row_set.add(row);
                    col_set.add(col);
                }
            }
        }

        for(int row = 0; row<matrix.length; row++){
            for(int col = 0; col<matrix[row].length; col++){
                if (row_set.contains(row) || col_set.contains(col)){
                    matrix[row][col] = 0;
                }
            }
        } 
    }
}
