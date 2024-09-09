import java.util.Arrays;

public class SortArray012CountingSort {
    public static void sort012(int[] arr) {
        int[] count = new int[3]; 
        for (int num : arr) {
            count[num]++;
        }
        int index = 0;

        for (int i = 0; i < count[0]; i++) {
            arr[index++] = 0;
        }

        for (int i = 0; i < count[1]; i++) {
            arr[index++] = 1;
        }

        for (int i = 0; i < count[2]; i++) {
            arr[index++] = 2;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 1, 0, 2, 1, 0};
        sort012(arr1);
        System.out.println("Sorted array: " + Arrays.toString(arr1));
    }
}
