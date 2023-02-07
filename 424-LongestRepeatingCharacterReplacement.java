class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int left = 0;
        int res = 0;
        int max = 0;
        for (int right = 0; right < s.length(); right++) {
            arr[s.charAt(right) - 'A']++;
            max = Math.max(max, arr[s.charAt(right) - 'A']);
            if (right - left - max + 1 > k) {
                arr[s.charAt(left) - 'A']--;
                left++;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}
