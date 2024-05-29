package Algorithms;

public class TrapRainWater {
    public static void main(String[] args) {
        int[] arr = {4,2,0,6,3,2,5};
        int[] arr2 = {1,2};
        trapRainWater(arr);
        trapRainWater(arr2);
    }

    public static void trapRainWater(int[] arr){

        int[] level = new int[arr.length];
        level[0] = 0;
        level[level.length-1] = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            int leftMax = Integer.MIN_VALUE;
            int rightMax = Integer.MIN_VALUE;
            for(int j = 0; j < i; j++){
                if(arr[j] > leftMax){
                    leftMax = arr[j];
                }
            }
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] > rightMax){
                    rightMax = arr[j];
                }
            }
            int temp = Math.min(leftMax, rightMax) - arr[i];
            level[i] = Math.max(temp, 0);
        }

        int total = 0;
        for (int l : level) {
            total += l;
        }
        System.out.println("Total water that can be stored is : " + total);
    }
}
