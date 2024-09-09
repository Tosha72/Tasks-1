import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        int originalNum = num, sum = 0;
        int digits = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " - число Армстронга");
        } else {
            System.out.println(originalNum + " - не является числом Армстронга");
        }
    }
}