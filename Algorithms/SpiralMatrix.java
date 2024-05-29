package Algorithms;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = { {1,4,5,6},
                        {1,6,2,9},
                        {2,7,5,8},
                        {4,0,9,7} };
        spiralMatrix(arr);
    }
    public static void spiralMatrix(int[][] arr){
        int s_row = 0, s_col = 0;
        int e_row = arr.length-1;
        int e_col = arr[0].length-1;

        while(s_row <= e_row && s_col <= e_col) {
            //Top
            for (int i = s_col; i <= e_col; i++) {
                System.out.print(arr[s_row][i] + " ");
            }
            //Right
            for (int i = s_row + 1; i <= e_row; i++) {
                System.out.print(arr[i][e_col] + " ");
            }
            //Left
            for (int i = e_col - 1; i >= s_col; i--) {
                System.out.print(arr[e_row][i] + " ");
            }
            //Bottom
            for (int i = e_row - 1; i >= s_row + 1; i--) {
                System.out.print(arr[i][s_col] + " ");
            }
            s_row++;
            e_row--;
            s_col++;
            e_col--;
        }

    }
}
