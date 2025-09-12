public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){

        this.head = new Node(value);
        this.tail = this.head;
        this.length = 1;

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
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;

    }

    public Node removeLast(){

        if (length == 0){
            return null;
        }
        Node temp = head;
        Node prev = head;

        if(length == 1){
            head = null;
            tail = null;
        } else{

            while(temp.next != null){
                prev = temp;
                temp = temp.next;
            }
            tail = prev;
            tail.next = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);

        if (length == 0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;

    }

    public Node removeFirst(){

        if (length == 0){
            return null;
        }
        Node temp = head;
        if (length == 1){
            head = null;
            tail = null;
        } else {

            head = temp.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index){

        if (length < index || index < 0) return null;

        Node temp = head;

        for (int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value){

        Node temp = get(index);

        if (temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){

        if (index < 0 || index > length) return false;

        if (index == 0){
            prepend(value);
            return true;
        } else if (index == length){
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = get(index - 1);

        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public void getHead(){
        System.out.println("Head: " + head.value);
    }

    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }

    public void getLength(){
        System.out.println("Length: " + length);
    }
}
