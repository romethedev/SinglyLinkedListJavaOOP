package singlyLinkedList;

//A singly linked list is a type of linked list that is unidirectional, that is, it can be traversed in only one direction from head to the last node (tail).

public class SinglyLinkedList {
    public Node head;
    
    public SinglyLinkedList() {
        // your code here
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }   
    
    //Create a remove() method that will remove a node from the end of your list
    public void remove() {
        if(this.head != null){          //if the head isnt null (if our SLL isnt empty)
            Node pointer = this.head;   //create a variable with the class of Node and call it pointer and set the value to this.head
            while(pointer.next.next != null){   //iterate through the SLL until the node AFTER the next node (so 2 nodes away) is null, this is how we grab the one before the last node
                pointer = pointer.next; //if the next next node isnt null, move the pointer to the next node
            }
            pointer.next = null;    //if the next next node IS NULL, make the node before that null, meaning remove the last node from our SLL
        }
    }

    //Create printValues() method that will print all the values of each node in the list in order
    public void printValues() {
        if(this.head != null){
            Node pointer = this.head;
            while(pointer.next != null){
                System.out.println(pointer.value);
                pointer = pointer.next;
            }
        }
    }

    //Optional Challenges:
    //Implement a find(int) method that will return the first node with the value in the parameter
    public Node find(int value) {
        if(this.head != null){         //if the head isnt null (if our SLL isnt empty)
            Node pointer = this.head;  //create a variable with the class of Node and call it pointer and set the value to this.head
            while(pointer.next != null){    //iterate until the next node is null (to the end of our SLL)
                if(pointer.value == value){     //check if pointer (this.head/node) value is equal to value passed into our method
                    return pointer;         //if true return pointer (this.head/node)
                }
                pointer = pointer.next;     //if not go to next node
            }
        }
        return this.head;
    }

    //Implement a removeAt(int) method that will remove the node after n nodes, where n is the parameter. For example, if n is 0, remove the first node. If n is 1, remove the second node. Similar to Arrays.
    public void removeAt(int index) {       //removeAt method where the parameters is int variable called index
        if(this.head != null){              //if the head isnt null
            Node pointer = this.head;       //assign this.head to pointer variable
            int count = 0;                  //assign 0 to count variable, this is how we will check our index
            Node temp = null;               //assign null to our temp variable, this is how we store our current node
            while(pointer.next != null){    //iterate through our SLL
                if(count == index){         //check if count is equal to the index passed through
                    temp.next = temp.next.next;    
                    break;                  //break out the loop early
                }
                temp = pointer;             //store our current node into our temp variable
                pointer = pointer.next;     //move to the next node
                count++;                    //increase count/index of our SLL
            }

        } 
    }
}
