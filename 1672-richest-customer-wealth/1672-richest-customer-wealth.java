class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] customer:accounts){
            int tempSum = 0;
            for(int bank:customer){
                tempSum += bank;
            }
            if(tempSum > max){
                max = tempSum;
            }
        }
        return max;
    }
}