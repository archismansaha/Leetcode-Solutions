class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int row=0; row<accounts.length; row++){
             int currentSum = 0;
            for(int col=0; col<accounts[0].length; col++){
               currentSum+=accounts[row][col];
            }
            
            if(currentSum>max){
                max = currentSum;
            }
        }
        
        return max;
    }
}
