class Solution {
    public String longestCommonPrefix(String[] strs) {
        char[] arr = strs[0].toCharArray();
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || arr[i]!= strs[j].charAt(i)){
                    return new String(arr,0,i);
                }
            }
        }
        return new String(arr);
    }
}