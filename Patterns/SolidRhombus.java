package Patterns;

import java.util.Scanner;

public class SolidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        String str;
        for (int i = 1; i <= n; i++) {
            if(i == 1 || i == n){
                str = " ".repeat(n-i) + "*".repeat(n) ;
                System.out.println(str);
            }
            else{
                str = " ".repeat(n-i) + "*" + " ".repeat(n-2) + "*" ;
                System.out.println(str);
            }
        }
    }
}
