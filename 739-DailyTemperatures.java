class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] res = new int[temp.length];
        Stack<Integer> stack = new Stack<>();
        for (int curr = 0; curr < temp.length; curr++) {
            while (!stack.isEmpty() && temp[curr] > temp[stack.peek()]) {
                int prev = stack.pop();
                res[prev] = curr - prev;
            }
            stack.push(curr);
        }
        return res;
    }
}
