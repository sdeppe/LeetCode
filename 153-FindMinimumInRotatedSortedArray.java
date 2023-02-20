class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        int start = 0;
        int end = len - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int prev = (mid - 1 + len) % len;
            int next = (mid + 1) % len;
            if (nums[mid] <= nums[prev] && nums[mid] <= nums[next]) {
                return nums[mid];
            } else if (nums[mid] < nums[end]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
