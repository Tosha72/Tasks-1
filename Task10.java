import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        int digits = String.valueOf(num).length();

        System.out.println("Количество цифр в числе: " + digits);
    }
}