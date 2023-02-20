class Solution {
    public int trap(int[] heights) {
        if (heights.length == 0) {
            return 0;
        }
        int left = 0;
        int right = heights.length - 1;
        int leftMax = heights[left];
        int rightMax = heights[right];
        int result = 0;
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, heights[left]);
                result += leftMax - heights[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, heights[right]);
                result += rightMax - heights[right];
            }
        }
        return result;
    }
}
