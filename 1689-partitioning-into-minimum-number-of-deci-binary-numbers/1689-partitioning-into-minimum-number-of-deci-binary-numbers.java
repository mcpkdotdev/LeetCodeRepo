class Solution {
    public int minPartitions(String n) {
        char[] chars = n.toCharArray();
        char max = '0';
        for(char ch:chars){
            if(ch > max){
                max = ch;
            }
        }
        return (int)(max - '0');
        
    }
}