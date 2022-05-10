package com.williamdaw;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String words;
        String[] string;
        Scanner  scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("enter letter");
            words= scanner.nextLine();
            string = words.split("");
            for (int j = 0; j < string.length; j++) {
                int num = (int) (string[j].charAt(0));
                numbers.add(num);
            }
        }
        int n = numbers.size();
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (numbers.get((j - 1)) > numbers.get(j)) {
                    //swap elements
                    temp = numbers.get((j-1));
                    numbers.set((j - 1),numbers.get(j));
                    numbers.set(j,temp);
                }

            }
        }
        for (Integer number : numbers) {
            System.out.println((char) numbers.get(number));

        }
    }
}
