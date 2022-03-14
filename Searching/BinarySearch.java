package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println(binarySearch(array, 4));
        System.out.println(binarySearchRecursive(array, 4, 0, 4));

    }

    /**
     * Iterative method for binary search
     * 
     * @param arr
     * @param target
     * @return
     */
    public static int binarySearch(int[] arr, int target) {
        int lower = 0;
        int upper = arr.length - 1;

        while (lower <= upper) {
            int mid = (lower + upper) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            else if (target > arr[mid]) {
                lower = mid + 1;
            } else {
                upper = mid - 1;
            }
        }

        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int target, int lower, int upper) {
        if (lower <= upper) {
            int mid = (lower + upper) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                int newU= mid + 1;
                return binarySearchRecursive(arr, target, lower, newU);
            }

            else {
                int newL = mid + 1;
                return binarySearchRecursive(arr, target, newL, upper);
            }
        }

        return -1;

    }

}
