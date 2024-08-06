class Solution {
    public int singleNumber(int[] nums) {
        
        int uniqueValue = nums[0];

        for (int i = 0; i<nums.length; i++){
            // count if value is repeated
            int count = 0;
            for (int j: nums) {
                if (nums[i] == j){
                    // if value is repeated, count will increase
                    count++;              
                }
            }
            // if count is not more than 1, it means the value occured only once,
            // hence, it will the uniqueValue
            if(count <= 1) {
                uniqueValue = nums[i];
            }
        } 
        return uniqueValue;
    }
}