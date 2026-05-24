class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        existing = {}

        for i in range(len(nums)):
            if nums[i] in existing:
                return True
            else:
                existing[nums[i]] = i

        return False
        