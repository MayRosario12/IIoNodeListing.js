// Class representing a Node in the Linked List
class Node {
    constructor(value) {
        this.value = value;  // The value of the node
        this.next = null;    // The next node (initially set to null)
    }
}

// Class representing the Linked List
class LinkedList {
    constructor() {
        this.head = null;    // The head of the linked list (initially set to null)
        this.size = 0;       // The size of the linked list (initially set to 0)
    }

    // Method to append a new node to the linked list
    append(value) {
        // Create a new node with the given value
        let newNode = new Node(value);

        // If the list is empty, set the new node as the head
        if (this.head === null) {
            this.head = newNode;
        } else {
            // If the list is not empty, find the last node and append the new node
            let current = this.head;
            while (current.next !== null) {
                current = current.next;
            }
            current.next = newNode;
        }

        // Increment the size of the list
        this.size++;
        
        // Print the current state of the list after appending
        this.print();
    }

    // Method to print the linked list
    print() {
        let current = this.head;
        let listValues = [];

        // Traverse the list and collect values
        while (current !== null) {
            listValues.push(current.value);
            current = current.next;
        }

        // Print the linked list as an array
        console.log(listValues.join(" -> "));
    }
}

// Create an instance of the LinkedList
let list = new LinkedList();

// Append the required items to the linked list
list.append("Data Structures - Array");
list.append("Variable Type = Integer");
list.append("Sorting Algorithm - Bubble Sort");