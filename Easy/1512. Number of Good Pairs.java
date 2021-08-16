// Brute Force (Time Complexity ; O(N^2)
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}




//Efficient Approach
// Time Complexity: O(N)
// Space Complexity : O(N)
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0; int[] arr = new int[101];
        for(Integer element : nums){
            count += arr[element]++;
        }
        return count;
    }
}
