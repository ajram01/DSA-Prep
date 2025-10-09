public class Stack {

    private Node top;
    private int height;


    class Node {

        int value;
        Node next;

        public Node(int value){

            this.value = value;

        }


    }

    public Stack(int value){

        Node newNode = new Node(value);
        top = newNode;
        height = 1;

    }



}
