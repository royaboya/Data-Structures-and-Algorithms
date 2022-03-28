package Sorting;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = { 1, 5, 1, 19, 6, 1, 5 };
        display(arr);
        quickSort(arr);
        display(arr);

    }

    public static void quickSort(int[] arr)

    {

        quickSortHelper(arr, 0, arr.length - 1);

    }

    public static void quickSortHelper(int[] arr, int left, int right)

    {
        if (left < right)
        {
            int pivot = partition(arr, left, right);
            quickSortHelper(arr, left, pivot - 1);
            quickSortHelper(arr, pivot + 1, right);
        }

    }

    public static int partition(int[] arr, int left, int right)

    {
        int pivot = left;
        int leftBound = left + 1;
        int rightBound = right;
        while (leftBound < rightBound) {
            while (arr[leftBound] < arr[pivot]) {
                leftBound++;
            }

            while (arr[rightBound] > arr[pivot]) {
                rightBound--;
            }

            if (leftBound > rightBound) {
                int temp = arr[pivot];
                arr[pivot] = arr[rightBound];
                arr[rightBound] = temp;

            } else {
                int temp = arr[leftBound];
                arr[leftBound] = arr[rightBound];
                arr[rightBound] = temp;

            }

        }

        return rightBound;

    }

    public static void display(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println();
    }

    // public static void quickSort(int[] arr) {
    // int len = arr.length;
    // quickSortHelp(arr, 0, len -1);
    // }

    // public static void quickSortHelp(int[], left, int right) {
    // if(left < right){
    // int pivot = part(arr, left, right);
    // quickSortHelp(arr, left, pivot - 1);
    // quickSortHelp(arr, pivot + 1, right);
    // }

    // }

    public static String heheheha() {
        return "My name is Roy \"SciBorgs\" Chen and I like dn";
    }

    // public static int part(int[] arr, int left, int right){
    // int pivot = left;
    // int pointerLeft = left + 1;
    // int pointerRight = right;

    // // arr[left] is < arr[right]
    // while(pointerLeft <= pointerRight){
    // while(pointerLeft <= pointerRight && arr[pointerLeft] <= arr[pivot]){
    // pointerLeft++;
    // }

    // while(pointerLeft <= pointerRight && arr[pointerRight] > arr[pointerLeft]){
    // pointerRight--;
    // }

    // if(pointerRight > pointerLeft){
    // int temp = arr[pivot];
    // arr[pivot] = arr[pointerRight];
    // arr[pointerRight] = temp;
    // }

    // }
}
