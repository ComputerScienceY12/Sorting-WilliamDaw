import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("(A)scending or (D)escending");
        char option = (scanner.nextLine()).toUpperCase().charAt(0);
        System.out.println("Enter word");
        String[] string = scanner.nextLine().split("");

        ArrayList<Integer> numbers = new ArrayList<>();
        for (String s : string) numbers.add((int) s.charAt(0));

        boolean sorted = false;
        while (!(sorted)) {
            sorted = true;
            for (int i = 0; i < numbers.size() - 1; i++)
                if (numbers.get(i) > numbers.get(i + 1)) {
                    sorted = false;
                    int temporary = numbers.get(i);
                    numbers.set(i, numbers.get(i + 1));
                    numbers.set(i + 1, temporary);
                }
        }

        StringBuilder sb = new StringBuilder();
        if (option == 'D') for (int i = numbers.size() - 1; i >= 0; i--) sb.append((char) (int) numbers.get(i));
        else if (option == 'A') for (int new_int : numbers) sb.append((char) new_int);

        System.out.println(sb);
    }
}