class Solution {
    public int maximumCount(int[] nums) {
        
        // determine number of negative and positive values
        int negativeValues = 0;
        int positiveValues = 0;

        for (int i: nums){
            if (i<0){
                negativeValues += 1;
            }
            if (i>0) {
                positiveValues += 1;
            }
        }

        // determne max count
        if (negativeValues > positiveValues) {
            return negativeValues;
        } else if (positiveValues > negativeValues) {
            return positiveValues;
        } else {
            // both values are equal, so return either one
            return positiveValues;
        }

    }
}