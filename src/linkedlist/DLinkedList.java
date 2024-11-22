package linkedlist;

public class DLinkedList<T> {
    private DNode<T> head;
    private DNode<T> tail;
    private int size;
    public DLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * check the list is empty or not based on head is null or not
     * @return boolean
     */
    public boolean isEmpty(){
       return head == null;
    }


      /**
        * return the number of nodes in linked list
        * @return size of list
        */

    public int getSize() {
        return size;
    }


    /**
     * update list size on insert of delete
     * @param value is 1 in insertion -1 in deletion
     */
    private void updateSize(int value) {
        size += value;
    }


    /**
        * inset element in end of linked list with time O(1)
        * @param data need to save in linked list
     */

    public void insertFront(T data){
        DNode<T> newNode = new DNode<>(data);
        updateSize(1);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev= newNode;
        head = newNode;
    }

    /**
     * inset element in back of list
     * @param data the new data need to save
     */
    public void insertBack(T data){
        DNode<T> newNode = new DNode<>(data);
        updateSize(1);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }


    /**
     * add element by order
     * @param data the element you need to insert
     * @param order the position you need you insert
     */
    public void insertByOrder(T data, int order){
        if(order >= size || order < 0){
            System.out.println("Out of bound");
            return;
        }
        updateSize(1);
        DNode<T> newNode = new DNode<>(data);
        int cnt = 0;
        DNode<T> current = head;
        while (cnt + 1 < order){
            cnt++;
            current = current.next;
        }
        newNode.next = current.next;
        current.next.prev = newNode;
        current.next = newNode;
        newNode.prev = current;
    }

    /**
     * search for element is existed in list from head to tail
     * @param data the element you need to search for
     * @return boolean
     */
    public boolean searchForward(T data){
        if(isEmpty()){
           return false;
        }
        DNode<T> current = head;
        while (current.next!= null){
            if(current.data ==data){
                return true;
            }
            current = current.next;
        }
        return current.data == data;
    }

    /**
     * search for element is existed in list from tail to head
     * @param data the element you need to search for
     * @return boolean
     */
    public boolean searchBackward(T data){
        if(isEmpty()){
            return false;
        }
        DNode<T> current = tail;
        while (current.prev !=null){
            if(current.data == data) return true;
            current = current.prev;
        }
        return current.data == data;
    }


    /**
     * remove the first element from list and update head
     */
    public void deleteFront(){
        if(isEmpty()){
            System.out.println("List empty");
            return;
        }
        updateSize(-1);
        head = head.next;
        head.prev = null;
    }

    /**
     * delete the last element from the list and update tail
     */
    public void deleteBack(){
        if(isEmpty()){
            System.out.println("List empty");
            return;
        }
        updateSize(-1);
        tail = tail.prev;
        tail.next = null;
    }


    /**
     * delete element from list by order
     * @param order order is zero based
     */
    public void deleteByOrder(int order){
        if(isEmpty() || order >= size || order < 0){
            System.exit(1);
        }
        updateSize(-1);
        int cnt = 0;
        DNode<T> current = head;
        while (cnt + 1 < order) {
            cnt++;
            current = current.next;
        }
        current.next.next.prev = current;
        current.next = current.next.next;

    }

    /**
     * get the first element un list
     * @return the first element if existed
     */
    public T getFront(){
        if(isEmpty()){
            System.exit(1);
        }
        return head.data;
    }

    /**
     * get the last element in the list
     * @return the last element if existed
     */
    public T getBack(){
        if(isEmpty()){
            System.exit(1);
        }
        return tail.data;
    }

    /**
     * print the list elements from head to tail
     */
    public void printForward(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        DNode<T> current = head;
        while (current.next != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(current.data);
    }

    /**
        * print the list elements from tail to head
        */
    public void printBackward(){
        if(isEmpty()){
            System.out.println("List is Empty");
            return;
        }
        DNode<T> current = tail;
        while (current.prev != null){
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println(current.data);
    }

}
