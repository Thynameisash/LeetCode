class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        res=""
        for i in list(zip(*strs)):
            if len(set(i))==1: res+=i[0]
            else: break
        return res
