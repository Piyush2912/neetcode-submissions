class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Sorting and Adjacent comparison | T(n):O(nlogn), S(n):O(1)
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                return true;
            }
        }
        return false;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
             













        
        // Brute Force: T(n) = O(n), S(n)=O(1)
        // int n = nums.length;
        // for (int i=0; i<n-1; i++) {
        //     for (int j=i+1; j<n; j++) {
        //         if (nums[i] == nums[j]) {
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}