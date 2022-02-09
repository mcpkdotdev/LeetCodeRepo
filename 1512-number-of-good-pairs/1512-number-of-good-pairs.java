class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> revMap = new HashMap<>();
        for(int num:nums){
            if(revMap.containsKey(num)){
                revMap.put(num, revMap.get(num) + 1);
            } else{
                revMap.put(num, 1);
            }
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : revMap.entrySet()) {
            sum += entry.getValue() * (entry.getValue()-1) / 2;
        }
        return sum;
    }
}