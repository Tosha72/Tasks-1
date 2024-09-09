import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine().toLowerCase();
        int vowelsCount = 0, consonantsCount = 0;
        String vowels = "аеёиоуыэюяaeiou";

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vowels.indexOf(c) != -1) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        System.out.println("Количество гласных: " + vowelsCount);
        System.out.println("Количество согласных: " + consonantsCount);
    }
}