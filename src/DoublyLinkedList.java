public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    // Add a node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Remove a node from the list
    public boolean remove(int data) {
        Node currentNode = head;

        while (currentNode != null) {
            if (currentNode.data == data) {
                if (currentNode == head) {
                    head = currentNode.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else if (currentNode == tail) {
                    tail = currentNode.prev;
                    if (tail != null) {
                        tail.next = null;
                    }
                } else {
                    currentNode.prev.next = currentNode.next;
                    currentNode.next.prev = currentNode.prev;
                }
                size--;
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    // Display the list in forward direction
    public void displayForward() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // Display the list in reverse direction
    public void displayBackward() {
        Node currentNode = tail;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.prev;
        }
        System.out.println();
    }
}
