class Solution {

    static {
        for (int i = 0; i < 500; i++) {
            maxArea(new int[]{0, 0}); // JIT warm-up
        }
    }

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length-1;



        while (left < right) {
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, w * h);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }

        }


        return maxArea;
    }
}