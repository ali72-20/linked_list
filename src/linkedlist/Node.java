package linkedlist;

class Node<T> {
    public Node(){};
    T data;
    Node next;
    public Node(T data){
        this.data = data;
        next = null;
    }
}
