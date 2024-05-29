package Algorithms;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        maxSubArrays(arr);
        kadanesAlgorithm(arr);
    }

    public static void maxSubArrays(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum += arr[k];
                }
                System.out.print(currentSum + " ");
                if(currentSum > max){
                    max = currentSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max sum of SubArrays using normal algorithm: " + max);
    }


    public static void kadanesAlgorithm(int[] arr){
        int currentSum = 0;
        int maximumSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maximumSum = Math.max(maximumSum,currentSum);
        }

        System.out.println("Max sum of SubArrays using kadane's Algorithm : " + maximumSum);
    }
}