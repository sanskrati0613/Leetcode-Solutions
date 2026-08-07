/**
 * LeetCode 1480 - Running Sum of 1d Array
 * Difficulty: Easy
 * Language: Java
 */

class Solution {
    public int[] runningSum(int[] nums) {
       int sum = 0;
       int [] runningSum= new int[nums.length]; 
       for(int i=0; i<nums.length; i++){
        sum+=nums[i];
        runningSum[i]=sum;
       }
       return runningSum;
    }
}
