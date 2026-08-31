class Solution {
    public boolean isAnagram(String s, String t) {
        // HashMap | T(n): O(n) , S(n): O(n)
        if (s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            countS.put( s.charAt(i), countS.getOrDefault( s.charAt(i), 0) + 1);
            countT.put( t.charAt(i), countT.getOrDefault( t.charAt(i), 0) + 1);
        }

        return countS.equals(countT);


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
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
