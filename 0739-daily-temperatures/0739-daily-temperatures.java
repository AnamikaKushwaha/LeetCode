class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       Stack<Integer> stack = new Stack<>();
       int[] ans = new int[temperatures.length];
       for(int i = 0; i<temperatures.length; i++){
        while(!stack.isEmpty() &&  temperatures[stack.peek()] < temperatures[i]){
            int prev = stack.peek();
            ans[prev] = i - stack.pop();;
        }
        stack.push(i);
       } 
       return ans;
    }
}