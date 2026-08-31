class Solution {
    public boolean isAnagram(String s, String t) {
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // Sorting & Equality Check | T(n): O(nlogn) + O(mlogm), S(n):O(n)
        if(s.length() != t.length()) {
         return false;
        }
        char sc[] = s.toCharArray();
        char tc[] = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        return Arrays.equals(sc, tc);

    }
}
