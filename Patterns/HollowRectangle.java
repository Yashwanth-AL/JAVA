package Patterns;
import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

//        String fullRow = "*".repeat(n);
//        String hollowRow = "*" + " ".repeat(n - 2) + "*";
//
//        for (int i = 1; i <= n; i++) {
//            if (i == 1 || i == n) {
//                System.out.println(fullRow);
//            } else {
//                System.out.println(hollowRow);
//            }
//        }

        HR(r,c);
    }

    public static void HR(int r, int c){
        for(int i = 1; i <= r; i++){
            for (int j = 1; j <= c; j++) {
                if(i == 1 || i == r || j == 1 || j == c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



