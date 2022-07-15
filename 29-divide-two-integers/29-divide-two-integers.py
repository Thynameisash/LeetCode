class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        is_negative = (dividend < 0) != (divisor < 0)
        dividend, divisor = abs(dividend), abs(divisor)
        sum = divisor
        quo=0
        while sum<=dividend:
            q2=1
            while (sum<<1) <=dividend:
                sum<<=1
                q2<<=1
            dividend -= sum
            sum = divisor
            quo += q2
        return min(2147483647, max(-quo if is_negative else quo, -2147483648))   
            