class Solution:
    def countSmaller(self, nums: List[int]) -> List[int]:
        res, sorted_nums = [0] * len(nums), []
        
        for i in range(len(nums) -1, -1, -1):
            left = bisect_left(sorted_nums, nums[i])
            sorted_nums.insert(left, nums[i])
            res[i] = left
        
        return res
