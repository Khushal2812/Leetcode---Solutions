class Solution {
    public int maxDepth(String s) {
        int MaxDepth = 0;
        int current = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                current ++;
                MaxDepth = Math.max(current,MaxDepth);
            }
            if(s.charAt(i)==')'){
                current--;
            }
        }
        return MaxDepth;
    }
}