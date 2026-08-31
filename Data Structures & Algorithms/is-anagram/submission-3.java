class Solution {
    public boolean isAnagram(String s, String t) {
        // Hash Tables Arrays | T(n):O(n+m) , S(n):O(1)
        if (s.length() != t.length()) {
            return false;
        }

        int count[] = new int[26];
        for(int i=0; i< s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int val: count){
            if (val != 0) {
                return false;
            }
        }
        return true;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // HashMap | T(n): O(n+m) , S(n): O(1)
        // if (s.length() != t.length()) {
        //     return false;
        // }
        
        // Map<Character, Integer> countS = new HashMap<>();
        // Map<Character, Integer> countT = new HashMap<>();

        // for(int i=0; i<s.length(); i++) {
        //     countS.put( s.charAt(i), countS.getOrDefault( s.charAt(i), 0) + 1);
        //     countT.put( t.charAt(i), countT.getOrDefault( t.charAt(i), 0) + 1);
        // }

        // return countS.equals(countT);


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // Sorting & Equality Check | T(n): O(nlogn) + O(mlogm), S(n):O(n)
        // if(s.length() != t.length()) {
        //  return false;
        // }
        // char sc[] = s.toCharArray();
        // char tc[] = t.toCharArray();
        // Arrays.sort(sc);
        // Arrays.sort(tc);
        // return Arrays.equals(sc, tc);

    }
}
