/**
 * LeetCode 728 - Self Dividing Numbers
 * Difficulty: Easy
 * Language: Java
 */

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> answer = new ArrayList<>();
        for(int n=left; n<=right; n++){
            int temp = n;
            boolean isValid = true;
            while(temp>0){
                int digit = temp%10;
                if(digit==0){
                    isValid = false;
                    break;
                }
                if(n%digit!=0){
                    isValid = false;
                    break;
                }
                temp=temp/10;
            }
            if(isValid){
                answer.add(n);
            }
        }
        return answer;
        
    }
}
