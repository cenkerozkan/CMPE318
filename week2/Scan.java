package week2;

import java.util.Scanner;

public class Scan{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println(name);
        
        scanner.close();
    }
}