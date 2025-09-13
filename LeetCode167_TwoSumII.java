//167. Two Sum II - Input Array Is Sorted
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int n1 = 0;
        int n2 = n-1;
        int sum = 0;
        int[] res = new int[2];
        while(n1<n2) {
            sum = numbers[n1] + numbers[n2];
            if(sum==target) {
                res[0]=n1+1;
                res[1]=n2+1;
                return res;
            } else if(sum<target) {
                n1+=1;
            } else {
                n2-=1;
            }
        }
        return res;
    }
}
