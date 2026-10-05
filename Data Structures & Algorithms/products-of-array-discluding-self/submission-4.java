class Solution {
    public int[] productExceptSelf(int[] nums) {
        // 3rd Approach: Prefix/Sufix : T(n)=O(n),S(n)=O(n)
        int prefix[] = new int[nums.length];
        int suffix[] = new int[nums.length];
        int res[] = new int[nums.length];

        int n = nums.length;
        prefix[0] = 1;
        suffix[n-1] = 1;
        for(int i=1; i<n; i++) {
            prefix[i] = nums[i-1] * prefix[i-1];
        }
        for(int i=n-2; i>=0; i--) {
            suffix[i] = nums[i+1] * suffix[i+1];
        }
        for(int i=0; i<n; i++) {
            res[i] = prefix[i] * suffix[i];
        }
        return res;
    }
        
        
        
        
        
        
        
        
        
        
        // 2nd Approach: Division, T(n)=O(n), S(n)=O(n)
    //   int prod = 1, zeroCount = 0;
    //     for (int num : nums) {
    //         if (num != 0) {
    //             prod *= num;
    //         } else {
    //             zeroCount++;
    //         }
    //     }

    //     if (zeroCount > 1) {
    //         return new int[nums.length];
    //     }

    //     int[] res = new int[nums.length];
    //     for (int i = 0; i < nums.length; i++) {
    //         if (zeroCount > 0) {
    //             res[i] = (nums[i] == 0) ? prod : 0;
    //         } else {
    //             res[i] = prod / nums[i];
    //         }
    //     }
    //     return res;
    // }
        
        // naive approach: T(n)=O(n2), S(n)=O(n)
    //     if (nums.length == 1) return nums;
    //     int[] ans = new int[nums.length];
    //     for(int i=0; i<nums.length; i++) {
    //         int prod = 1;
    //         for(int j=0; j<nums.length; j++) {
    //             if (i != j) {
    //                 prod = prod * nums[j];
    //             }
    //         }
    //         ans[i] = prod;
    //     }
    //     return ans;
    // }
}  
