import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        operateDataStructures();
    }

    private static void operateDataStructures() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose Data Structure:");
            System.out.println("Enter 1 for Linked List");
            System.out.println("Enter 2 for Stack");
            System.out.println("Enter 3 for Queue");
            System.out.println("Enter 4 for MinHeap");
            System.out.println("Enter 5 for BinarySearchTree");
            System.out.println("Enter 6 to exit");

            int selection = scanner.nextInt();

            if (selection == 1) {
                linkedListMain(scanner);
            } else if (selection == 2) {
                stackMain(scanner);
            } else if (selection == 3) {
                queueMain(scanner);
            } else if (selection == 4) {
                minHeapMain(scanner);
            } else if (selection == 5) {
                binarySearchTreeMain(scanner);
            } else if (selection == 6) {
                System.out.println("Exiting");
                break;
            } else {
                System.out.println("Error, try again");
            }
        }
    }

    private static void linkedListMain(Scanner scanner) {
        LinkedList linkedList = new LinkedList();
        int listSelection;

        while (true) {
            System.out.println("Choose Linked List Action:");
            System.out.println("Enter 1 to Insert");
            System.out.println("Enter 2 to Delete");
            System.out.println("Enter 3 to Traverse");
            System.out.println("Enter 4 to Display");
            System.out.println("Enter 5 to Return to Main Menu");
            System.out.println("Enter 6 to Exit");

            listSelection = scanner.nextInt();

            if (listSelection == 1) {
                // Insert operation
                System.out.println("Enter number to insert:");
                int keyToInsert = scanner.nextInt();
                linkedList.insert(keyToInsert);
                System.out.println("Number inserted.");
            } else if (listSelection == 2) {
                // Delete operation
                System.out.println("Enter number to delete:");
                int keyToDelete = scanner.nextInt();
                linkedList.delete(keyToDelete);
                System.out.println("Number deleted.");
            } else if (listSelection == 3) {
                // Traverse operation
                System.out.println("Traversing Linked List:");
                linkedList.traversal();
            } else if (listSelection == 4) {
                // Display operation
                linkedList.display();
            } else if (listSelection == 5) {
                // Return to Main Menu
                System.out.println("Returning to Main Menu.");
                return;
            } else if (listSelection == 6) {
                // Exit
                System.out.println("Exiting.");
                System.exit(0);
            } else {
                System.out.println("Error, try again");
            }
        }
    }

    private static void stackMain(Scanner scanner) {
        MyStack stack = new MyStack();
        int stackSelection;

        while (true) {
            System.out.println("Choose Stack Action");
            System.out.println("Enter 1 to Push");
            System.out.println("Enter 2 to Pop");
            System.out.println("Enter 3 for Top");
            System.out.println("Enter 4 for Display");
            System.out.println("Enter 5 for Return to Main Menu");
            System.out.println("Enter 6 to Exit");

            stackSelection = scanner.nextInt();

            if (stackSelection == 1) {
                // Push operation
                System.out.println("Enter number to push:");
                int keyToPush = scanner.nextInt();
                stack.push(keyToPush);
                System.out.println("Number pushed.");
            } else if (stackSelection == 2) {
                // Pop operation
                int poppedValue = stack.pop();
                if (poppedValue != -1) {
                    System.out.println("Popped value: " + poppedValue);
                } else {
                    System.out.println("Error, Empty Stack");
                }
            } else if (stackSelection == 3) {
                // Top operation
                int topValue = stack.peek();
                if (topValue != -1) {
                    System.out.println("Top value: " + topValue);
                } else {
                    System.out.println("Error, Empty Stack");
                }
            } else if (stackSelection == 4) {
                // Display operation
                stack.display();
            } else if (stackSelection == 5) {
                // Return to Main Menu
                System.out.println("Returning to Main Menu.");
                return;
            } else if (stackSelection == 6) {
                // Exit
                System.out.println("Exiting.");
                System.exit(0);
            } else {
                System.out.println("Error, try again");
            }
        }
    }

    private static void queueMain(Scanner scanner) {
        MyQueue queue = new MyQueue();
        int queueSelection;

        while (true) {
            System.out.println("Choose Queue Action");
            System.out.println("Enter 1 to Enqueue");
            System.out.println("Enter 2 to Dequeue");
            System.out.println("Enter 3 for Display");
            System.out.println("Enter 4 for Return to Main Menu");
            System.out.println("Enter 5 to Exit");

            queueSelection = scanner.nextInt();

            if (queueSelection == 1) {
                // Enqueue operation
                System.out.println("Enter number to enqueue:");
                int keyToEnqueue = scanner.nextInt();
                queue.enqueue(keyToEnqueue);
                System.out.println("Number enqueued.");
            } else if (queueSelection == 2) {
                // Dequeue operation
                int dequeuedValue = queue.dequeue();
                if (dequeuedValue != -1) {
                    System.out.println("Dequeued number: " + dequeuedValue);
                } else {
                    System.out.println("Error, Empty Queue.");
                }
            } else if (queueSelection == 3) {
                // Display operation
                queue.display();
            } else if (queueSelection == 4) {
                // Return to Main Menu
                System.out.println("Returning to Main Menu.");
                return;
            } else if (queueSelection == 5) {
                // Exit
                System.out.println("Exiting.");
                System.exit(0);
            } else {
                System.out.println("Error, try again");
            }
        }
    }

    private static void minHeapMain(Scanner scanner) {
        MinHeap minHeap = new MinHeap(10);
        int heapSelection;

        while (true) {
            System.out.println("Choose MinHeap Action");
            System.out.println("Enter 1 to Insert");
            System.out.println("Enter 2 to ExtractMin");
            System.out.println("Enter 3 for Display");
            System.out.println("Enter 4 for Return to Main Menu");
            System.out.println("Enter 5 to Exit");

            heapSelection = scanner.nextInt();

            if (heapSelection == 1) {
                // Insert operation
                System.out.println("Enter data to insert:");
                int keyToInsert = scanner.nextInt();
                minHeap.insert(keyToInsert);
                System.out.println("Data inserted.");
            } else if (heapSelection == 2) {
                // ExtractMin operation
                int min = minHeap.extractMin();
                if (min != -1) {
                    System.out.println("Min element extracted: " + min);
                } else {
                    System.out.println("Error, Empty Heap");
                }
            } else if (heapSelection == 3) {
                // Display operation
                minHeap.display();
            } else if (heapSelection == 4) {
                // Return to Main Menu
                System.out.println("Returning to Main Menu.");
                return;
            } else if (heapSelection == 5) {
                // Exit
                System.out.println("Exiting.");
                System.exit(0);
            } else {
                System.out.println("Error, try again.");
            }
        }
    }

    private static void binarySearchTreeMain(Scanner scanner) {
        BinarySearchTree bst = new BinarySearchTree();
        int bstSelection;

        while (true) {
            System.out.println("Choose Binary Search Tree Action");
            System.out.println("Enter 1 to Insert");
            System.out.println("Enter 2 to Delete");
            System.out.println("Enter 3 to Search");
            System.out.println("Enter 4 to Display");
            System.out.println("Enter 5 for Return to Main Menu");
            System.out.println("Enter 6 to Exit");

            bstSelection = scanner.nextInt();

            if (bstSelection == 1) {
                // Insert operation
                System.out.println("Enter data to insert:");
                int keyToInsert = scanner.nextInt();
                bst.insert(keyToInsert);
                System.out.println("Data inserted.");
            } else if (bstSelection == 2) {
                // Delete operation
                System.out.println("Enter data to delete:");
                int keyToDelete = scanner.nextInt();
                bst.delete(keyToDelete);
                System.out.println("Data deleted.");
            } else if (bstSelection == 3) {
                // Search operation
                System.out.println("Enter data to search:");
                int keyToSearch = scanner.nextInt();
                boolean found = bst.search(keyToSearch);
                if (found) {
                    System.out.println("Data found in the tree.");
                } else {
                    System.out.println("Data not found in the tree.");
                }
            } else if (bstSelection == 4) {
                // Display operation
                bst.display();
            } else if (bstSelection == 5) {
                // Return to Main Menu
                System.out.println("Returning to Main Menu.");
                return;
            } else if (bstSelection == 6) {
                // Exit
                System.out.println("Exiting.");
                System.exit(0);
            } else {
                System.out.println("Error, try again.");
            }
        }
    }
}

class LinkedList {
    private Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void delete(int key) {
        Node temp = head;
        Node prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        prev.next = temp.next;
    }

    public void traversal() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class MyStack {
    private MyNode top;

    static class MyNode {
        int data;
        MyNode next;

        MyNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {
        MyNode newNode = new MyNode(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Error, Empty Stack");
            return -1;
        }

        int poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Error, Empty Stack");
            return -1;
        }

        return top.data;
    }

    public void display() {
        MyNode temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private boolean isEmpty() {
        return top == null;
    }
}

class MyQueue {
    private MyNode front;
    private MyNode back;

    static class MyNode {
        int data;
        MyNode next;

        MyNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void enqueue(int data) {
        MyNode newNode = new MyNode(data);
        if (isEmpty()) {
            front = newNode;
            back = newNode;
            return;
        }
        back.next = newNode;
        back = newNode;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Error, Empty Queue");
            return -1;
        }

        int dequeuedValue = front.data;
        front = front.next;
        if (front == null) {
            back = null;
        }
        return dequeuedValue;
    }

    public void display() {
        MyNode temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private boolean isEmpty() {
        return front == null;
    }
}

class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    public void insert(int key) {
        if (size == capacity) {
            System.out.println("Error, Heap is full");
            return;
        }

        size++;
        int i = size - 1;
        heap[i] = key;

        while (i != 0 && heap[parent(i)] > heap[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    public int extractMin() {
        if (size <= 0) {
            System.out.println("Error, Empty Heap");
            return -1;
        }

        if (size == 1) {  return heap[--size];
        }

        int root = heap[0];
        heap[0] = heap[--size];
        minHeapify(0);

        return root;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    private void minHeapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int smallest = i;

        if (left < size && heap[left] < heap[i]) {
            smallest = left;
        }

        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            swap(i, smallest);
            minHeapify(smallest);
        }
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int leftChild(int i) {
        return 2 * i + 1;
    }

    private int rightChild(int i) {
        return 2 * i + 2;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}

class BinarySearchTree {
    private Node root;

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private Node deleteRec(Node root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.data) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.data) {
            root.right = deleteRec(root.right, key);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children
            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    private int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node root, int key) {
        if (root == null || root.data == key) {
            return root != null;
        }

        if (key < root.data) {
            return searchRec(root.left, key);
        }

        return searchRec(root.right, key);
    }

    public void display() {
        inOrderTraversal(root);
        System.out.println();
    }

    private void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
}
