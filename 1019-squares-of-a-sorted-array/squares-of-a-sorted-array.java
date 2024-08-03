class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] arr = new int[nums.length];

        for (int i = 0; i<arr.length; i++){
            // adding square of absolute (positive) value
            arr[i] = (int) (Math.pow(Math.abs(nums[i]), 2)) ;
        }

        // sorting in non-decreasing order by applying bubble-sort algorithm
        for (int i = 0; i<arr.length-1; i++){
            for (int j = 0; j<arr.length-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // return sorted array
        return arr;
    }
}