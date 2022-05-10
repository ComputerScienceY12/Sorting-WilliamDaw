import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("(A)scending or (D)escending");
        String option = (scanner.nextLine()).toUpperCase().charAt(0) + "";
        System.out.println("Enter word");
        String[] string = scanner.nextLine().split("");

        for (String s : string) {
            int num = s.charAt(0);
            numbers.add(num);
        }

        boolean sorted = false;
        while (!(sorted)) {
            sorted = true;
            for (int i = 0; i < numbers.size() - 1; i++) if (numbers.get(i) > numbers.get(i + 1)) {
                sorted = false;
                int temporary = numbers.get(i);
                numbers.set(i, numbers.get(i + 1));
                numbers.set(i + 1, temporary);
            }
        }

        StringBuilder sb = new StringBuilder();

        if (option.equals("D")) {
            ArrayList<Integer> descending = new ArrayList<>();
            for (int i = 0; i < numbers.size(); i++) {
                descending.add(numbers.get((numbers.size() - 1) - i));
            }
            for (int new_int : descending) sb.append((char) new_int);
        } else if (option.equals("A")) {
            for (int new_int : numbers) sb.append((char) new_int);
        }

        String str = sb.toString();
        System.out.println(str);
    }
}