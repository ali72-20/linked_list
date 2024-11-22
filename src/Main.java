import linkedlist.DLinkedList;
import linkedlist.LinkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DLinkedList<Integer> list = new DLinkedList<>();
        list.insertFront(1);
        list.insertFront(2);
        list.insertFront(3);
        list.insertFront(4);
        list.insertFront(5);
        list.insertBack(10);
        list.insertFront(100);
        list.insertBack(30);
        System.out.println(list.getSize());
        list.printForward();
        System.out.println("--------------------------------------------");
        list.deleteFront();
        System.out.println(list.getSize());
        list.printForward();
        System.out.println("--------------------------------------------");
        list.insertByOrder(8,3);
        System.out.println(list.getSize());
        list.printForward();
        System.out.println("--------------------------------------------");
        list.deleteByOrder(3);
        System.out.println(list.getSize());
        list.printForward();
        System.out.println("--------------------------------------------");
        System.out.println(list.getFront());
        System.out.println("--------------------------------------------");
        System.out.println(list.getBack());
        System.out.println("--------------------------------------------");
        list.deleteBack();
        System.out.println(list.getSize());
        list.printForward();
        System.out.println("--------------------------------------------");
        System.out.println(list.searchForward(10));
        System.out.println(list.searchForward(50));
        System.out.println("--------------------------------------------");
        System.out.println(list.searchBackward(1));
        System.out.println(list.searchBackward(100));
        System.out.println("--------------------------------------------");
        list.printBackward();

    }
}