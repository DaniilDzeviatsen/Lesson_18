import by.teachmeskills.dzeviatsen.homework18.IntArrayList;
import by.teachmeskills.dzeviatsen.homework18.IntLinkedList;

import java.util.Scanner;

public class HomeWork18 {
    public static void main(String[] args) {
        IntArrayList arrayList = new IntArrayList();
        IntLinkedList linkedList = new IntLinkedList();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "Choose operation:", "1) Add element", "2) Set element",
                    "3) Get element", "4)remove element", "5)get last index of element",
                    "6) get size of the list", "7) show list");
            int taskNum = Integer.parseInt(sc.nextLine());
            switch (taskNum) {
                case 1 -> {
                    System.out.println("Enter element you want to add");
                    int element = Integer.parseInt(sc.nextLine());
                    System.out.println("Realization through Linked list");
                    linkedList.add(element);
                    System.out.println(linkedList);
                    System.out.println("Realization through ArrayList");
                    arrayList.add(element);
                    System.out.println(arrayList);
                }
                case 2 -> {
                    System.out.println("Enter element you want to input in your list");
                    int element = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter index you want it to get");
                    int index = Integer.parseInt(sc.nextLine());
                    System.out.printf("%s%n%s", "Your returned element from Linked list is " + linkedList.set(index, element) +
                                    " and it was replaced  by " + element,
                            "Your returned element from Array list is " + arrayList.set(index, element) +
                                    " and it was replaced by " + element);
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("Enter index you want to get element of");
                    int index = Integer.parseInt(sc.nextLine());
                    System.out.println("Your element from Linked List is " + linkedList.get(index));
                    System.out.println("Your element from Array List is " + arrayList.get(index));
                }
                case 4 -> {
                    System.out.println("Enter index of element you want to exclude");
                    int index = Integer.parseInt(sc.nextLine());
                    System.out.println("You've excluded " + linkedList.remove(index) + " from Linked list");
                    System.out.println("You've excluded " + arrayList.remove(index) + " from Array list");
                }
                case 5 -> {
                    System.out.println("Enter element you want to get last index of");
                    int element = Integer.parseInt(sc.nextLine());
                    System.out.println("Last index in Linked list is " + linkedList.lastIndexOf(element));
                    System.out.println("Last index in Array list is " + arrayList.lastIndexOf(element));
                }
                case 6 -> {
                    System.out.println(linkedList.size());
                    System.out.println(arrayList.size());
                }
                case 7 -> {
                    System.out.println(linkedList);
                    System.out.println(arrayList);
                }
            }
        } while (true);
    }
}