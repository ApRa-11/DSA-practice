//LeetCode 1760
//Minimum Limit Of Balls In A Bag

class Solution {
    public static boolean find(int n, int m, int[] arr, long mid) {
        long total = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] < mid) continue;
            long curr = arr[i] / mid;
            if(arr[i] % mid == 0) curr--;
            total = total + curr;
        }
        if(total > m) return false;
        else return true;
    }
    
    public int minimumSize(int[] nums, int maxOperations) {
        int n = nums.length;
        long low = 1;
        long high = 0;
        for(int i=0; i<n; i++) {
            if(high < nums[i]) {
                high = nums[i];
            }
        }
        long ans = high;
        while(low <= high) {
            long mid = (low + high) / 2;
            boolean check = find(n, maxOperations, nums, mid);
            if(check == true) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return (int) ans;
    }
}
