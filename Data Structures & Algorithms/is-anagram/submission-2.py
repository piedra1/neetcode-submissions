class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        map = {}
        for ch in s:
            if ch in map:
                map[ch] += 1
            else:
                map[ch] = 1
        
        for ch in t:
            if ch not in map:
                return False
            map[ch] -= 1

        for key,value in map.items():
            if value != 0:
                return False
        return True