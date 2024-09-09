import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа A и B: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int sum = 0;

        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Сумма четных чисел: " + sum);
    }
}