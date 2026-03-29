class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<String> maxHeap = new PriorityQueue<>(
            (a, b) -> {
                if (a.length() != b.length()) {
                    return b.length() - a.length(); 
                }
                return b.compareTo(a);
            }
        );

        for (String num : nums) {
            maxHeap.add(num);
        }

        for (int i = 0; i < k - 1; i++) {
            maxHeap.poll();
        }

        return maxHeap.peek();
    }
}