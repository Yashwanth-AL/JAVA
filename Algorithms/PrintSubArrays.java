package Algorithms;

public class PrintSubArrays {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        printSubArrays(arr);
    }
    
    public static void printSubArrays(int[] arr){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArrays : " + total);
    }
}
