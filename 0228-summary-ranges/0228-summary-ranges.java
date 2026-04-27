class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;

        int left = 0;

        for (int right = 1; right <= nums.length; right++) {
            if (right == nums.length || nums[right] != nums[right - 1] + 1) {

                if (left == right - 1) {
                    result.add(String.valueOf(nums[left]));
                } else {
                    result.add(nums[left] + "->" + nums[right - 1]);
                }

                left = right;
            }
        }

        return result;
    }
}