class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxLen = 0;
        for(String sent:sentences){
            int tempSpace = 0;
            List<Character> chars = sent.chars().mapToObj(e->(char)e).collect(Collectors.toList());
            for(char ch:chars){
                if(ch==' '){
                    tempSpace++;
                }
            }
            if(tempSpace > maxLen){
                maxLen = tempSpace;
            }
        }
        return maxLen + 1;
    }
}