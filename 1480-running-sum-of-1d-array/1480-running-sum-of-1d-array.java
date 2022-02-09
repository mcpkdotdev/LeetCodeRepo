class Solution {
    public int[] runningSum(int[] nums) {
        int[] newArr = new int[nums.length];
        for(int i=0; i < nums.length; i++){
            int tempSum = 0;
            for(int j = 0; j<i+1; j++){
                tempSum += nums[j];
            }
            newArr[i] = tempSum;
        }
        return newArr;
    }
}