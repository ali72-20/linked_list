import linkedlist.CircularLinkedList;
import linkedlist.DLinkedList;
import linkedlist.LinkedList;

import java.util.ArrayList;

public class Main {
    static void printLine(){
        System.out.println("-------------------------------------------");
    }
    public static void main(String[] args) {
        CircularLinkedList<Integer> list = new CircularLinkedList<>();
        System.out.println(list.isEmpty());
        System.out.println(list.getSize());
        list.printList();
        printLine();
        list.insertFront(10);
        System.out.println(list.isEmpty());
        System.out.println(list.getSize());
        list.printList();
        printLine();
        list.insertFront(9);
        System.out.println(list.getSize());
        list.printList();
        printLine();
        list.insertFront(8);
        System.out.println(list.getSize());
        list.printList();
        printLine();
        list.insertFront(4);
        System.out.println(list.getSize());
        list.printList();
        printLine();
        list.insertFront(0);
        System.out.println(list.getSize());
        list.printList();
        printLine();
        list.insertBack(13);
        System.out.println(list.getSize());
        list.printList();
        printLine();
        System.out.println(list.getFront());
        System.out.println(list.getBack());
        printLine();
        list.deleteFront();
        System.out.println(list.getSize());
        list.printList();
        printLine();
        list.deleteBack();
        System.out.println(list.getSize());
        list.printList();;
        printLine();
    }
}