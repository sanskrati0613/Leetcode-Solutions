/**
 * LeetCode 136 - Single Number
 * Difficulty: Easy
 * Language: Java
 */

class Solution {
    public int singleNumber(int[] nums) {
        int answer = 0;
        for(int num : nums){
            answer = answer^num;
        }
        return answer;
    }
}
