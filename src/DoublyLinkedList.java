public class DoublyLinkedList{

    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }
    }

    public DoublyLinkedList(int value){

        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;

    }

    public Node getHead(){
        return head;
    }

    public Node getTail(){
        return tail;
    }

    public int getLength(){
        return length;
    }

    public void printList(){
        Node temp = head;

        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value){

        Node newNode = new Node(value);

        if (length == 0){
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        length++;
    }

    public Node removeLast(){

        if (length == 0) return null;
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);

        if (length == 0){
            head = newNode;
            tail = newNode;
            length++;
            return;
        }

        head.prev = newNode;
        newNode.next = head;
        head = newNode;
        length++;
    }

}