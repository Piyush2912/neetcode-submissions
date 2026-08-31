class Solution {
    public boolean hasDuplicate(int[] nums) {
        // 1 Pass hash table
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], i);
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