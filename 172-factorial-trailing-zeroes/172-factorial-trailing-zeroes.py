class Solution:
    def trailingZeroes(self, n: int) -> int:
        count,i=0,5
        while(n//i!=0):
            count+=int(n//i)
            i*=5
        return count