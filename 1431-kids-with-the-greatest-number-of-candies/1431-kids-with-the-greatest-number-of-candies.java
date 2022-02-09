class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxMinusExtra = -50;
        for(int num:candies){
            if(maxMinusExtra < num - extraCandies){
                maxMinusExtra = num - extraCandies;
            }
        }
        Boolean[] returnArray = new Boolean[candies.length];
        for(int i = 0; i < candies.length; i++){
            if(maxMinusExtra <= candies[i]){
                returnArray[i] = true;
            } else{
                returnArray[i] = false;
            }
        }
        return Arrays.asList(returnArray);
    }
}