class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
         if(s == null){
            return result;
         }

         Queue<String> que = new LinkedList<>();
         HashSet<String> set = new HashSet<>();

         que.offer(s);
         set.add(s);

         boolean found = false;

         while(!que.isEmpty()){
            String curr = que.poll();
            if(isValid(curr)){
                result.add(curr);
                found = true;
            }
            if(found){
                continue;
            }
            for(int i = 0;i<curr.length();i++){
                char ch = curr.charAt(i);
                if(ch != '(' && ch != ')'){
                    continue;
                }
                String next = curr.substring(0,i) + curr.substring(i+1);
                if(set.add(next)){
                    que.offer(next);
                }
            }
         }
         return result;
    }
    static boolean isValid(String s){
        int balance = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                balance++;
            }
            else if(ch == ')'){
                if(balance==0)
                return false;
                balance--;
            }
        }
        return balance == 0;
    }
}
