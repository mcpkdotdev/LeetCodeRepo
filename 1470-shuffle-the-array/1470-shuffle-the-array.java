class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] newArr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            newArr[i < (nums.length / 2)? i*2 : (i-(nums.length / 2))*2+1] = nums[i];
        }
        return newArr;
    }
}