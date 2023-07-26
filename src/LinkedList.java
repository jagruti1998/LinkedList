public class LinkedList {
    private int size;

    LinkedList(){
        this.size=0;
    }

    class Node{  //A node is represented as a class ,A basic node structure is created
        //properties of a node
        String data;
        Node next;

        //Constructor
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    private Node head;

    //add - node at first
    public void addFirst(String data){

        Node newNode=new Node(data);//create new node
        if(head==null){ //to check if Linkedlist exists or not
            head=newNode;//if not assign as a head node
            return;
        }
        //if linkedlist exists
        newNode.next=head;
        head=newNode;
    }

    //add node to last
    public void addLast(String data){
        Node newNode=new Node(data);//create new node
        if(head==null){
            head=newNode;
            return;
        }
        //if list exists
        Node currNode=head;
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;

    }
    //print
    public void printList(){
        if(head==null){//corner case to check if node doesn't exists
            System.out.println("list is empty");
            return;
        }

        Node currNode=head;
        while (currNode!=null){
            System.out.print(currNode.data + " ->");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }

    //delete first
    public void deleteFirst(){
        if(head==null){//corner case to check if node doesn't exists
            System.out.println("list is empty");
            return;
        }
        size --;
        head=head.next;
    }

    //delete last
    public void deleteLast(){
        if(head==null){//corner case to check if node doesn't exists
            System.out.println("list is empty");
            return;
        }
        size --;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args){
        LinkedList list =new LinkedList();//object of LL
        list.addFirst("jiggy");
        list.addFirst("piggy");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("Hey");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
        list.addFirst("new node");
        list.printList();


    }
}
