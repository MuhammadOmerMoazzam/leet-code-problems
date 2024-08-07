class Solution {
    public int heightChecker(int[] heights) {
        
        // store number of elements that are not same
        int count = 0;

        // creating expected array
        int[] expected = new int[heights.length];
        
        for (int i=0; i<heights.length; i++){
            expected[i] = heights[i];
        }

        // using Arrays.sort() method for sorting in ascending order
        Arrays.sort(expected);

        // counting number of elemects that are not same
        for (int i=0; i<heights.length; i++){
            if (heights[i] != expected[i]){
                count++;
            }
        }
        return count;          
    }
}