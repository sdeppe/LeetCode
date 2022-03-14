class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 1 ){
                int count = 0;
                for (int j=i; j<nums.length; j++) {
                    if (nums[j] == 1) {
                        count++;
                    }
                    if (nums[j] == 0) {
                        i=j;
                        break;
                    }
                }
                if (count > max) {
                    max = count;
                }
            }
        }
        return max;
    }
}
