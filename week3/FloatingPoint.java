package week3;

public class FloatingPoint {
    public static void main(String[] args) {
        double number = 0;

        for (int i = 0; i < 10; i++){
            number += 0.1;
        }

        System.out.print(number);
    }
}

// The output will be 0.9999999999...
