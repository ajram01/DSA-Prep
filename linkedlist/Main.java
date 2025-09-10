import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        //Test append method
        myLinkedList.append(2);
        myLinkedList.printList();

        //Test remove last method
        myLinkedList.removeLast();
        myLinkedList.getTail();
        myLinkedList.removeLast();

        //Test prepend method
        myLinkedList.prepend(2);
        myLinkedList.prepend(5);
        myLinkedList.printList();

        //Test remove first node method
        myLinkedList.removeFirst();
        myLinkedList.printList();

        //Test get method
        myLinkedList.append(35);
        myLinkedList.append(321);
        myLinkedList.append(24);
        System.out.println(myLinkedList.get(2).value);

        //Test set method
        myLinkedList.set(2, 34);
        System.out.println(myLinkedList.get(2).value);

    }
}