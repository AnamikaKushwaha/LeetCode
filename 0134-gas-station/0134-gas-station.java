class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int total = 0;
        for(int i = 0; i<n; i++) {
            total = total + gas[i] - cost[i];
        }
        if(total < 0) return -1;
        int avail = 0;
        int start = 0;
        for(int i = 0; i<n; i++){
            avail = avail + gas[i] - cost[i];
            if(avail < 0){
                start = i+1;
                avail = 0;
            }
        }
        return start;
    }
}