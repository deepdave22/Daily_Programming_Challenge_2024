public class day_3_FindDuplicateBinarySearch {
    public static int find_Duplicate(int[] arr) {
        int low = 1, high = arr.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            
            for (int num : arr) {
                if (num <= mid) {
                    count++;
                }
            }
            if (count > mid) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        
        return low; 
    }
