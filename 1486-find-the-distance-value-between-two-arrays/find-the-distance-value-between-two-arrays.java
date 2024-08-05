class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
    
        // count how many itration of arr1[i] fulfils condition
        int count = 0;

        // outer loop arr1[i]
        for (int i: arr1){
            
            // determine whether all the values are false in iteration of arr1[i]
            int row = 0;

            // inner loop arr2[j]
            for (int j: arr2){
                // subtracting i and j and then passing in Math.abs() 
                // to make the ans positive, and check ans <= d 
                int ans = i - j;
                if (Math.abs(ans) <= d){
                    row ++;
                }
            }
            
            // if all the values are false, then count is increased
            if (row < 1){
                count++;
            }
        }
        return count;
    }
}