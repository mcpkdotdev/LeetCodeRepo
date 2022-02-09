class Solution {
    public int[] runningSum(int[] nums) {
        int[] newArr = new int[nums.length];
        newArr[0] = nums[0];
        for(int i=0; i+1 < nums.length; i++){
            newArr[i+1] = newArr[i] + nums[i+1];
            
        }
        return newArr;
    }
}