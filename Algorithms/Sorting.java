package Algorithms;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
       int[] array = {2,4,5,1,6,3,8,7,9};
       bubbleSort(array);
       selectionSort(array);
       insertionSort(array);
       countingSort(array);
    }

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Bubble Sort Array : " + Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Selection Sort Array : " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j, key = arr[i];

            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
        System.out.println("Insertion Sort Array : " + Arrays.toString(arr));
    }


    public static void countingSort(int[] arr){

        int max = Arrays.stream(arr).max().getAsInt();
        int[] count = new int[max+1];

//        int largest = Integer.MIN_VALUE;
//        for(int a : arr){
//            largest = Math.max(a,largest);
//        }

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while(count[i] != 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        System.out.println("Count Sort Array : " + Arrays.toString(arr));
    }
}
