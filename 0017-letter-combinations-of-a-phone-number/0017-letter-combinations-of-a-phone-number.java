import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> queue = new LinkedList<>();
        if (digits == null || digits.length() == 0) {
            return queue;
        }

        String[] mapping = {
                "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        queue.add(""); 

        for (int i = 0; i < digits.length(); i++) {
            int digit = Character.getNumericValue(digits.charAt(i));
            while (queue.peek().length() == i) {
                String permutation = queue.remove();
                for (char c : mapping[digit].toCharArray()) {
                    queue.add(permutation + c);
                }
            }
        }

        return queue;
    }
}