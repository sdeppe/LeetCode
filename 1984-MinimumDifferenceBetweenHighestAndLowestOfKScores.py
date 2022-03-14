class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:    
        n = len(nums)
        nums.sort()
        mini = nums[-1]-nums[0]
        for i in range(n-k+1):
            mini = min(mini, nums[i+k-1]-nums[i])
        return mini
