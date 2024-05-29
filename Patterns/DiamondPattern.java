package Patterns;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        String str;
        for (int i = 1; i <= n; i++) {
            str = " ".repeat(n-i) + "*".repeat(2*i-1);
            System.out.println(str);
        }
        for (int i = n; i >= 1; i--) {
            str = " ".repeat(n-i) + "*".repeat(2*i-1);
            System.out.println(str);
        }
    }
}
