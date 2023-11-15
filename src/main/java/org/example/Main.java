package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();

        System.out.println("Введите 5 строк для списка A:");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }

        System.out.println("Список A:");
        displayList(listA);
        System.out.println("Введите 5 строк для списка B:");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }

        List<String> listC = mergeLists(listA, listB);

        System.out.println("Список C :");
        
        displayList(listC);
        Collections.sort(listC, Comparator.comparing(String::length));
        System.out.println("Список C (отсортированный по длине слова):");
        displayList(listC);
    }

    private static void displayList(List<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }

    private static List<String> mergeLists(List<String> listA, List<String> listB) {
        List<String> listC = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }

        return listC;
    }
}
