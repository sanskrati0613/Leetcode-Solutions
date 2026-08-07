/**
 * LeetCode 1929 - Concatenation of Array
 * Difficulty: Easy
 * Language: Java
 */

class Solution {
    public int[] getConcatenation(int[] nums) {
      int n = nums.length;  
      int ans[] = new int[2*n];   
      for(int row=0; row<n; row++) {
        ans[row] = nums[row];
        ans[row+n] = nums[row];
      }
      return ans;  
    }
}
