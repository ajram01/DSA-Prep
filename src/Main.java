import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//
//        LinkedList myLinkedList = new LinkedList(4);
//
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//
//        //Test append method
//        myLinkedList.append(2);
//        myLinkedList.printList();
//
//        //Test remove last method
//        myLinkedList.removeLast();
//        myLinkedList.getTail();
//        myLinkedList.removeLast();
//
//        //Test prepend method
//        myLinkedList.prepend(2);
//        myLinkedList.prepend(5);
//        myLinkedList.printList();
//
//        //Test remove first node method
//        myLinkedList.removeFirst();
//        myLinkedList.printList();
//
//        //Test get method
//        myLinkedList.append(35);
//        myLinkedList.append(321);
//        myLinkedList.append(24);
//        System.out.println(myLinkedList.get(2).value);
//
//        //Test set method
//        myLinkedList.set(2, 34);
//        System.out.println(myLinkedList.get(2).value);
//
//        // Test insert method
//        System.out.println("Current Linked List: ");
//        myLinkedList.printList();
//
//        myLinkedList.insert(2, 204);
//        System.out.println("My linked list after inserting 204 at index 2: ");
//        myLinkedList.printList();
//
//        //Test remove method
//        System.out.println("List before removal");
//        myLinkedList.printList();
//
//        System.out.println("Removing node at index 2");
//        myLinkedList.remove(2);
//        myLinkedList.printList();
//
//        // Test reverse method
//        System.out.println("List before reversing");
//        myLinkedList.printList();
//
//        System.out.println("List after reversing");
//        myLinkedList.reverse();
//        myLinkedList.printList();

        // ############### Doubly Linked List Test ###############

        DoublyLinkedList myDll = new DoublyLinkedList(8);
        myDll.append(8);
        myDll.append(234);
        myDll.append(593);
        myDll.append(1);
        myDll.append(78);
        myDll.printList();

        System.out.println(myDll.get(4).value);

        myDll.insert(38, 4);
        System.out.println(myDll.get(4).value);


    }
}
