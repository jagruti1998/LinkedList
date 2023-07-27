public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.add(10);
        doublyLinkedList.add(20);
        doublyLinkedList.add(30);

        System.out.println("Forward: ");
        doublyLinkedList.displayForward(); // Output: 10 20 30

        System.out.println("Backward: ");
        doublyLinkedList.displayBackward(); // Output: 30 20 10

        doublyLinkedList.remove(20);

        System.out.println("Forward after removing 20: ");
        doublyLinkedList.displayForward(); // Output: 10 30
    }
}
