/**
 * LeetCode 326 - Power of Three
 * Difficulty: Easy
 * Language: Java
 */

class Solution {
    public boolean isPowerOfThree(int n) {
        while(n>1){
            if(n%3==0){
                n/=3;
            }else{
                break;
            }
        }
        return n==1;
    }
}
