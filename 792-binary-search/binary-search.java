class Solution {
    public int search(int[] arr, int value) {
        int low = 0, high = arr.length-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (value == arr[mid])
                return mid;
            if (value > arr[mid])
                low = mid + 1;
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}