class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
        for(int i = 0; i<nums.length; i++){
            if(intMap.containsKey(nums[i])){
                return new int[]{intMap.get(nums[i]), i};
            }
            intMap.put(target - nums[i], i);
        }
        return new int[]{0, 0};
    }
}