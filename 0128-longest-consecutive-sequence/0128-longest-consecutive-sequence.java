class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        int longestSeq = 0;

        for(int i : set){
            
            if(!set.contains(i - 1)){
                int currNum = i;
                int currSeq = 1;

                while(set.contains(currNum + 1)){
                    currNum++;
                    currSeq++;
                }

                longestSeq = Math.max(longestSeq, currSeq);
            }

        }
        return longestSeq;
    }
}