class Solution {
    public int[] minOperations(String boxes) {
        int[] box = new int[boxes.length()];
        int[] result = new int[boxes.length()];
        
        for (int i = 0; i < boxes.length(); i++) {
            box[i] = boxes.charAt(i) - '0';
        }
        
        for (int i = 0; i < boxes.length(); i++) {
            int count = 0;
            for (int j = 0; j < boxes.length(); j++) {
                if (i != j && box[j] == 1) {
                    count += Math.abs(j - i);
                }
            }
            result[i] = count;
        }
        return result;
    }
}
