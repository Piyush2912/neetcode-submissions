class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<int[]> res = new ArrayList<>();
        for(Map.Entry<Integer, Integer> mp: map.entrySet()) {
            res.add(new int[] {mp.getValue(), mp.getKey()});
        }
        res.sort((a,b) -> b[0] - a[0]);

        int ans[] = new int[k];
        for(int i=0;i<k;i++) {
            ans[i] = res.get(i)[1];
        }
        return ans;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
       // naive approach: double loop| T(O(n^2)) , S(O(1))
    //    int count= 0;
    //    int n = nums.length;
    //    ArrayList<Integer> res = new ArrayList<>(n);
    //    for (int i=0; i<n; i++) {
    //     for (int j=i+1; j<n; j++) {
    //         if (nums[i] == nums[j]) {
    //             count++;
    //         }
    //     }

    //     if (count >= k && !res.contains(nums[i])) {
    //         res.add(nums[i]);
    //     } else {
    //         count = 0;
    //     }
    //    }

    //    return res.stream().mapToInt(Integer::intValue).toArray();
    // }
}
