import java.util.*;

class Solution {

    static {
        var s = new Solution();
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        for (int i = 0; i < 1000; i++) {
            s.groupAnagrams(strs);
        }
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}
