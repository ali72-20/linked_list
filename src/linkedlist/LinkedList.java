package linkedlist;

public class LinkedList<T>{

    /**
     * start of list
     */
    private Node<T> head;
    private int size;
    public LinkedList(){
        size = 0;
    }


    /**
     * update list size on insert of delete
     * @param value is 1 in insertion -1 in deletion
     */
    private void updateSize(int value){
        size+=value;
    }

    /**
     * Check the linked list is empty or not based on
     * head is null or not
     * @return boolean
     */
    public boolean isEmpty(){
        return head == null;
    }

    /**
     * return the number of nodes in linked list
     * @return size of list
     */
    public int getSize(){
        return size;
    }

    /**
     * inset element in end of linked list with time O(n)
     * n is the current number of nodes
     * @param data need to save in linked list
     */
    public void insertBack(T data){
        Node<T> newNode = new Node(data);
        updateSize(1);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    /**
     * print the list elements
     */
    public void printList(){
        if(isEmpty()){
            System.out.println("list is empty");
            return;
        }
        Node current = head;
        while(current.next != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(current.data);
    }


    /**
     * insert element in front of linked list with time O(1)
     * @param data need to save in linked list
     */
    public void insertFront(T data){
        Node<T> newNode = new Node(data);
        updateSize(1);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    /**
     * insert element in order
     * @param data need to save in linked list
     * @param order the position to insert in based 0
     */
    public void insertInOrder(T data, int order){
        if(order >= getSize()){
            System.out.println("Out of bound");
            return;
        }
        Node<T> newNode = new Node(data);
        updateSize(1);
        int cnt = 0;
        Node current = head;
        while(cnt + 1 < order){
            cnt++;
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }


    /**
     * find the element is in list or not
     * @param data to search in list
     * @return element exist or not
     */
    public boolean search(T data){
        if(isEmpty()){
            return false;
        }
        Node current = head;
        while(current.next != null){
            if(current.data == data){
                return true;
            }
            current = current.next;
        }
        if(current.data == data) return true;
        return false;
    }


    /**
     * delete the first element of list
     */
    public void deleteFront(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        updateSize(-1);
        head = head.next;
    }


    /**
     * delete the last node in list
     */
    public void deleteBack(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        updateSize(-1);
        Node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }

    /**
     * delete element from list by order in zero based
     * @param order zero based
     */
    public void deleteByOrder(int order){
        if(order >= getSize()){
            System.out.println("Out of bound");
            return;
        }
        updateSize(-1);
        int cnt = 0;
        Node current = head;
        while (cnt + 1 < order){
            cnt++;
            current = current.next;
        }
        Node deletedNode = current.next;
        current.next = deletedNode.next;
    }

    /**
     * update the data of node by its order
     * @param newValue new value to update
     * @param index in zero based
     */
    public void updateValueByIndex(T newValue, int index){
        if(index >= getSize()){
            System.out.println("Out of bound");
            return;
        }
        int cnt = 0;
        Node current = head;
        while (cnt < index){
            cnt++;
            current = current.next;
        }
        current.data = newValue;
    }

    /**
     * get data of head (front of list) and exit if the list is empty
     * @return data of head
     */
    public T getFront(){
        if(isEmpty()){
            System.exit(1);
        }
        return head.data;
    }

    /**
     * return the last element of the list
     * @return data of last element
     */
    public T getBack(){
        if (isEmpty()){
            System.exit(1);
        }
        Node<T> current = head;
        while (current.next != null){
            current = current.next;
        }
        return current.data;
    }
}
