class Solution {
    public int minPartitions(String n) {
        int ans = 0, a = 0, b = 0;
        char[] c = n.toCharArray();
        for (int i = 0; i < c.length; i++) {
            a = 0; 
            a = Character.getNumericValue(c[i]);
            
            if (a > ans) {
                ans = a;
            }
        }
        return ans;
    }
}
