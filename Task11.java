import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        long factorial = 1;

        for (int i = 2; i <= N; i++) {
            factorial *= i;
        }

        System.out.println("Факториал " + N + " = " + factorial);
    }
}