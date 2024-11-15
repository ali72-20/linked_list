import linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertBack(9);
        list.insertBack(10);
        list.insertBack(30);
        list.insertBack(10);
        list.insertBack(90);
        list.insertInOrder(200,4);
        list.printList();
        System.out.println(list.getSize());
        list.deleteByOrder(1);
        list.printList();
        list.updateValueByIndex(40,2);
        list.printList();
        System.out.println(list.getSize());
        System.out.println(list.getFront());
        System.out.println(list.getBack());
    }
}