class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        List<Character> jewelList = jewels.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        char[] stoneCh = stones.toCharArray();
        
        int jewelsCount = 0;
        for(char stone:stoneCh){
            if(jewelList.contains(stone)){
                jewelsCount++;
            }
        }
        return jewelsCount;
    }
}