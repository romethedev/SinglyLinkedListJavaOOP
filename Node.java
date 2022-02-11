package singlyLinkedList;

//Tasks:
//Create a Node class
//Fill in the constructor method that sets the value to a given number and next to null of your Node objects.

public class Node {
    public int value;
    public Node next;
    public Node(int value) {
        // your code here
        this.value = value;
        this.next = null;
    }
}
