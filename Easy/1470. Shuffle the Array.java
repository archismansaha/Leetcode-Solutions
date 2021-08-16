class Solution {
    public int[] shuffle(int[] nums, int n) {
       int i=0, j = n;
        int[] arr = new int[nums.length];
        for(int k = 0; k<nums.length; ){
            arr[k++] = nums[i++];
            arr[k++] = nums[j++];
        }
        return arr;
    }
}
