class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) { 
            set.add(num);
        }

        int longest = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int next = num + 1;
                while (set.contains(next)) {
                    next++;
                }
                longest = Math.max(longest, next - num);
            }
        }
        return longest;
    }
}
