class Solution {
    public int totalNumbers(int[] digits) {
        int[] frq = new int[10];
        int count = 0;
        for(int i:digits){
            frq[i]++;
        }
        for(int u=0;u<=8;u+=2){
            if(frq[u]>0){
                frq[u]--;
                for(int h=1;h<=9;h++){
                    if(frq[h]>0){
                        frq[h]--;
                        for(int t=0;t<=9;t++){
                            if(frq[t]>0){
                                frq[t]--;
                                count++;
                                frq[t]++;
                            }
                        }           
                        frq[h]++;
                    }
                }
                frq[u]++;
            }
        }
        return count;
    }
}