class Solution {
    public boolean isPalindrome(int x) {
        Boolean isValid = true;
        String str = Integer.toString(x);
        List<Character> chars = str.chars().mapToObj(e->(char)e).collect(Collectors.toList());
        Stack<Character> numStack = new Stack<Character>();
        for(char c: chars){
            numStack.push(c);
        }
        for(char c: chars){
            if(c != numStack.peek()){
                isValid = false;
            }
            numStack.pop();
        }
        return(isValid);
        
    }
}