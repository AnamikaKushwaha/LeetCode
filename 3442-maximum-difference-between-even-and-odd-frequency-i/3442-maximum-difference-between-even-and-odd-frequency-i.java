class Solution {
    public int maxDifference(String s) {
        int[] frequency = new int[26];
        for(char c : s.toCharArray()){
            frequency[c-'a']++;
        }
        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;
        for(int count :  frequency){
            if(count%2==1){
                maxOdd = Math.max(maxOdd, count);
            }else if (count > 0){
                minEven = Math.min(minEven, count);
            }
        }
        return maxOdd - minEven;
        
    }
}