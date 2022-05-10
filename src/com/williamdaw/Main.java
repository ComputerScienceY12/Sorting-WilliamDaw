package com.williamdaw;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String words;
        String[] string;
        String option = "";
        int num;
        StringBuffer sb = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> descending = new ArrayList<>();
        System.out.println("ascending(a) or descending (d)");
        option = (scanner.nextLine()).toUpperCase(Locale.ROOT);
        System.out.println("enter word");
        words = scanner.nextLine();
        string = words.split("");
        for (int j = 0; j < string.length; j++) {
             num = string[j].charAt(0);
             numbers.add(num);
        }
        int n = numbers.size();
        int temp = 0;
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
                descending.add(numbers.get((numbers.size()-1) - i));
            }
            for (int i = 0; i < descending.size() ; i++){
                int new_int = descending.get(i);
                sb.append((char) new_int);
            }
        } else if (option.equals("A")) {
            for (int i = 0; i < numbers.size(); i++) {
                int new_int = numbers.get(i);
                sb.append((char) new_int);
            }


        }
        String str = sb.toString();
        System.out.println(str);
    }
}