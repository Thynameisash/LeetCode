class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        return sub(nums);
    }
    
    public List<List<Integer>> sub(int [] nums){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : nums) {
            int size=outer.size();
            for (int i=0;i<size;i++){
                List<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    } 
}