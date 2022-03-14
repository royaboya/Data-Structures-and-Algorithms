package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = { 7, 5, 1, 7, 8, 2, 9, 19, 10 };
        printArr(nums);
        mergeSort(nums);
        printArr(nums);

    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        // 4 parameters: passed in array, left and right bound, temporary array
        divideMerge(arr, 0, n - 1, temp);

    }

    public static void divideMerge(int[] arr, int left, int right, int[] tempArr) {
        if (left < right) {
            int middle = (left + right) / 2;

            // recursive calls until left == right in which the "lengths" are just 0
            divideMerge(arr, left, middle, tempArr);   //left
            divideMerge(arr, middle + 1, right, tempArr); // right
            merge(arr, left, middle, right, tempArr);
        }
    }

    // can determine R1 and L2 from passing in middle
    // R1 from middle
    // L2 from middle + 1
    // guarantees: left and right subarrays are sorted

    // need pointers to lower, middle, and right
    public static void merge(int[] arr, int L1, int middle, int R2, int[] tempArr) {
        int p1 = L1;
        int p2 = middle + 1;
        int p3 = L1;

        while (p1 <= middle && p2 <= R2) {
            if (arr[p1] < arr[p2]) {
                tempArr[p3] = arr[p1];
                p1++;
            } else {
                tempArr[p3] = arr[p2];
                p2++;
            }
            p3++;

        }

        while(p1 <= middle){
            tempArr[p3] = arr[p1];
            p1++;
            p3++;
        }

        while(p2 <= R2){
            tempArr[p3] = arr[p2];
            p2++;
            p3++;
        }

        for(int i = L1; i <= R2; i++){
            arr[i] = tempArr[i];
        }
        
    }
}
