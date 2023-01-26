class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        int length = heights.length;
        int maxArea = 0;
        for (int i = 0; i < length; i++) {
            while ((stack.peek() != -1) && (heights[stack.peek()] >= heights[i])) {
                int currHeight = heights[stack.pop()];
                int currLength = i - stack.peek() - 1;
                maxArea = Math.max(maxArea, currHeight * currLength);
            }
            stack.push(i);
        }
        while (stack.peek() != -1) {
            int currHeight = heights[stack.pop()];
            int currLength = length - stack.peek() - 1;
            maxArea = Math.max(maxArea, currHeight * currLength);
        }
        return maxArea;
    }
}
