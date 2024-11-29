package linkedlist;

import org.xml.sax.ErrorHandler;

public class CircularLinkedList<T> {
    private Node<T> last;
    private int size;
    public CircularLinkedList() {
        last = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }
    public boolean isEmpty() {
        return last == null;
    }
    private void updateSize(int value){
        size+= value;
    }

    public void insertFront(T data){
        Node<T> newNode = new Node<>(data);
        updateSize(1);
        if(isEmpty()){
            last = newNode;
            last.next = last;
            return;
        }
        newNode.next = last.next;
        last.next = newNode;
    }
    public void insertBack(T data){
        Node<T> newNode = new Node<T>(data);
        updateSize(1);
        if(isEmpty()){
            last = newNode;
            last.next = last;
            return;
        }
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
    }
    public void insertInOrder(T data, int order){
        if(order > getSize()){
            System.out.println("Out of bound");
            return;
        }
        if(order == 0){
            insertFront(data);
            return;
        }
        if(order == getSize()){
            insertBack(data);
            return;
        }
        updateSize(1);
        Node<T> newNode = new Node<>(data);

        int currentOrder = 0;
        Node<T> currentNode = last.next;
        while (currentOrder + 1 < order){
            currentOrder++;
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }
    public void deleteFront(){
        if(isEmpty()){
            System.exit(1);
            return;
        }
        updateSize(-1);
        Node<T> deletedNode = last.next;
        last.next = last.next.next;
        deletedNode.next = null;
    }
    public void deleteBack(){
        if(isEmpty()){
            System.exit(1);
            return;
        }
        updateSize(-1);
        Node<T> current = last.next;
        while (current.next!= last){
            current = current.next;
        }
        Node<T> deletedNode = last;
        current.next = last.next;
        last = current;
        deletedNode.next = null;
    }
    public T getFront(){
        if(isEmpty()){
            System.exit(1);
        }
        return last.next.data;
    }
    public T getBack(){
        if(isEmpty()){
            System.exit(1);
        }
        return last.data;
    }
    public void printList(){
        if(isEmpty()){
            return;
        }
        Node current = last.next;
        while (current != last){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(current.data);
    }

}
