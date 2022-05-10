package com.williamdaw;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> descending = new ArrayList<>();

        System.out.println("Ascending(a) or Descending (d)");
        String option = (scanner.nextLine()).toUpperCase(Locale.ROOT);
        System.out.println("Enter word");
        String[] string = scanner.nextLine().split(" ");

        int num;
        for (String s : string) {
            num = s.charAt(0);
            numbers.add(num);
        }

        int n = numbers.size();
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (numbers.get((j - 1)) > numbers.get(j)) {
                    temp = numbers.get((j - 1));
                    numbers.set((j - 1), numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }

        if (option.equals("D")) {
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