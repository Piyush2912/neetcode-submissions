class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int n : freq[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // Min Heap | T(n)=O(nlogk) , S(n)=O(n+k)
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int num: nums) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }

        // PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        // for(Map.Entry<Integer,Integer> mp : map.entrySet()){
        //     heap.offer(new int[] {mp.getValue() , mp.getKey()});
        //     if(heap.size() > k) {
        //         heap.poll();
        //     }
        // }

        // int res[] = new int[k];
        // for(int i=0;i<k;i++){
        //     res[i]=heap.poll()[1];
        // }
        // return res;


       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        // HashMap with Sorting | T(n)=O(nlogn), S(n)=O(n)
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int num: nums) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }
        // List<int[]> res = new ArrayList<>();
        // for(Map.Entry<Integer, Integer> mp: map.entrySet()) {
        //     res.add(new int[] {mp.getValue(), mp.getKey()});
        // }
        // res.sort((a,b) -> b[0] - a[0]);

        // int ans[] = new int[k];
        // for(int i=0;i<k;i++) {
        //     ans[i] = res.get(i)[1];
        // }
        // return ans;
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
