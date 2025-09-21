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

}