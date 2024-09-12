public class Solution {
    public void mergeSortedArrays(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1; // Pointer for arr1
        int j = n - 1; // Pointer for arr2
        int k = m + n - 1; // Pointer for the merged array

        // Merge arrays from the end
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
}
