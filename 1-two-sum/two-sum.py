class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}

        for i,num in enumerate(nums):
            done = target - num

            if done in seen:
                return [seen[done], i]
            
            seen[num] = i

