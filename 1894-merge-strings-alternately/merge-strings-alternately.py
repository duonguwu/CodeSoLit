class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        len1 = len(word1)
        len2 = len(word2)
        len_ = min(len1, len2)
        merge = []

        for i in range(len_):
            merge.append(word1[i])
            merge.append(word2[i])

        if len1 > len2:
            merge.append(word1[len_:])
        elif len2 > len1:
            merge.append(word2[len_:])

        return "".join(merge)



            
