class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        //Cyclic Sort
        while(i<nums.length)
        {
            int corrind=nums[i]-1;
            if(nums[i]<nums.length && nums[i]>0 && nums[i]!=nums[corrind])
            {
                int temp=nums[corrind];
                nums[corrind]=nums[i];
                nums[i]=temp;
            }
            else
            {
                i++;
            }
        }
        //Return the first element missing, in a sorted array the element = index+1.
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
                return i+1;
            }
        }
        return nums.length+1;
    }
}