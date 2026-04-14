class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if (len(s) != len(t)):
            return False
        else:
            for c in set(s): #  {a, n. g, r, m}
                if s.count(c) == t.count(c):
                    continue
                else: 
                    return False
            return True 
        # count = {}
        # for c in s:
        #     if c in count:
        #         count[c] += 1
        #     else:
        #         count[c] = 1
        # for c in t:
        #     if c not in count:
        #         return False
        #     count[c]-=1

        #     if count[c] < 0:
        #         return False

        # return True 

        