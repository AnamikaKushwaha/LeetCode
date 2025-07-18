class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int left = 0, right = numbers.length-1;
       while(left < right){
        int curr = numbers[left] + numbers[right];
        if(curr == target){
            return new int[] {left+1, right+1};
        }
        if(curr > target){
            right--;
        }else{
            left++;
        }
    } 
       return new int[] {-1, -1};
    }
}