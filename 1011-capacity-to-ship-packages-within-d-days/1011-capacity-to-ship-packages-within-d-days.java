class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum =  0, max = 0;
        int N = weights.length;
        for(int  i = 0; i<weights.length; i++){
            if(weights[i] > max)
            {
                max = weights[i];
            }
            sum +=weights[i]; 
        }
        int low = max, high = sum;
        int ans = 0;
        while(low <= high){
            int mid = (low+high)/2;
            if(helper(mid, weights, N, days)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    boolean helper(int mid, int[] arr, int N, int D){
        int sum = 0, days = 1;
        for(int i = 0; i <N; i++){
            if(sum + arr[i] <= mid){
                sum = sum + arr[i];
            }
            else{
                days++;
                sum = arr[i];
            }
        }
        if(days <= D) return true;
        return false;
    }
}