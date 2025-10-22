public class Queue {

    private Node first;
    private Node last;
    private int height;

    class Node{

        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }

    }

    public Queue(int value){

        Node newNode = new Node(value);

        first = newNode;
        last = newNode;

        height = 1;

    }

    public void getFirst(){
        System.out.println("First value: " + first.value);
    }

    public void getLast(){
        System.out.println("Last value: " + last.value);
    }

    public void getLength(){
        System.out.println("Length: " + height);
    }

    public void enqueue(int value){

        Node newNode = new Node(value);

        if (height == 0){
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }

        height++;

    }

    public Node dequeue(){

        if (height == 0) return null;

        Node temp = first;

        if (height == 1){
            first = null;
            last = null;
        } else{
          first = first.next;
          temp.next = null;
        }

        height--;
        return temp;


    }


}
