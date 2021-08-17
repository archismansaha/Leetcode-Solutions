        List<Integer>res = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int up = 0;
        int left = 0;
        int down = row-1;
        int right = col-1;

        while (res.size()<row*col){
            // Traversing from left to right
            for(int column=left; column<=right; column++){
                res.add(matrix[up][column]);
            }

            //Traversing from top to bottom
            for(int rows = up+1; rows<down; rows++){
                res.add(matrix[rows][right]);
            }

            // Traversing from right to left
            // Make sure that you are in different rows
            if(up!=down){
                for (int column=right; column>=left; column--){
                    res.add(matrix[down][column]);
                }
            }

            // Traversing from bottom to top
            // Make sure that you are in different column
            if(left!=right){
                for(int rows=down-1; rows>up; rows--){
                    res.add(matrix[rows][left]);
                }
            }
            up++;
            down--;
            left++;
            right--;
        }
        return res;
        
        
// Time Complexity : O(M*N) //Lets assume that no. of rows is M and columns is N
// Space Complexity: O(1) // This is because we don't use other data structures. Remember that we don't include the output array in the space complexity.
