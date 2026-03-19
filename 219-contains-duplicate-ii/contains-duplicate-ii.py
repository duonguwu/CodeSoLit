class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        a = set()
        for i in range (len(nums)):
            if nums[i] in a:
                return True
            a.add(nums[i])

            if len(a) > k:
                a.remove(nums[i-k])
        return False 