class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        for(int j = 0, i = 0; j < n; j++){
            
            if(map.containsKey(s.charAt(j))){
                i = Math.max(i, map.get(s.charAt(j)));
            }
            ans = Math.max(ans, j-i+1);
            map.put(s.charAt(j), j+1);
        }
        return ans;
    }
}