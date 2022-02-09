class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int inc = 0;
        for(String op:operations){
            if(op.equals("++X") || op.equals("X++")){
                inc++;
            }
        }
        return (inc * 2 - operations.length);
    }
}