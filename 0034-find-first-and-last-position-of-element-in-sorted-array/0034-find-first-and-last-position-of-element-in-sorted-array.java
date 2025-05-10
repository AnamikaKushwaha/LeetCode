class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        
        return new int[] {first, last};
    }
    static int findFirst(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int first = -1;
            while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                first = mid;
                high = mid - 1;
            }
            else if(target > nums[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return first;
    }
    // Last occurence:
    static int findLast(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int last = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                last = mid;
                low = mid + 1;
            }else if(target < nums[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return last;
    }
}