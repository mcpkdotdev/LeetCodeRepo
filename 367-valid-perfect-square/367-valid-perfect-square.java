class Solution {
    public boolean isPerfectSquare(int num) {
        int j;
        for(int i = 0; i < 46341; i++){
            j = i * i;
            if(j > num){
                return false;
            }else if(j == num){
                return true;
            }
        }
        return false;
    }
}