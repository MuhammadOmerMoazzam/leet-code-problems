class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int count = 0;
        
        String[] s = stones.split("");
        
        for (String ch: s){
            if (jewels.contains(ch)){
                count++;
            }
        }
        
        return count;
    }
}