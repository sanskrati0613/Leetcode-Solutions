/**
 * LeetCode 1281 - Subtract the Product and Sum of Digits of an Integer
 * Difficulty: Easy
 * Language: Java
 */

class Solution {
    public int subtractProductAndSum(int n) {
        int num = n;
        int sum = 0;
        int product = 1;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        while(num>0){
            product*=num%10;
            num/=10;
        }
        return  product - sum;

    }
}
