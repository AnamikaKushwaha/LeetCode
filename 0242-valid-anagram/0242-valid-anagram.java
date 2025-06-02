class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> counter = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(counter.containsKey(ch)){
                counter.put(ch, counter.get(ch) + 1);
            }else{
                counter.put(ch, 1);
            }
            //counter.put(ch, counter.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            /*if(!counter.containsKey(ch) || counter.get(ch) == 0){
                return false;
            }*/
            if(counter.containsKey(ch)){
                if(counter.get(ch) == 1){
                    counter.remove(ch);
                }else{
                    counter.put(ch, counter.get(ch) - 1);
                }
            }else{
                return false;
            }
        }
        if(counter.size() > 0) return false;
        return true;
    }
}