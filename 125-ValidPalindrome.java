class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            int start = s.charAt(i);
            int end = s.charAt(j);
            if (!Character.isLetterOrDigit(start)) {
                i++;
                continue;
            } else if (!Character.isLetterOrDigit(end)) {
                j--;
                continue;
            } else if (start != end) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
