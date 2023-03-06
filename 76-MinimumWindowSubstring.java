class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }

        Map<Character, Integer> target = new HashMap<>();
        for (char c : t.toCharArray()) {
            target.put(c, target.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;
        int minRight = 0;
        int count = 0;
        Map<Character, Integer> window = new HashMap<>();

        while (right < s.length()) {
            char r = s.charAt(right);
            if (target.containsKey(r)) {
                window.put(r, window.getOrDefault(r, 0) + 1);
                if (window.get(r).equals(target.get(r))) {
                    count++;
                }
            }
            right++;

            while (count == target.size()) {
                if (right - left < minLen) {
                    minLen = right - left;
                    minLeft = left;
                    minRight = right;
                }
                char l = s.charAt(left);
                if (target.containsKey(l)) {
                    window.put(l, window.get(l) - 1);
                    if (window.get(l) < target.get(l)) {
                        count--;
                    }
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minRight);
    }
}
