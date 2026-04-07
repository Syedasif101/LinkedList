class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

    public static Node insertAtBegining(Node head, int val){
        Node newNode = new Node(val);
       newNode.next = head;
       head = newNode;
       return head;
    }

    public static Node insertAtTheEnd(Node head, int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }

       Node temp = head;
       while(temp.next != null){
           temp = temp.next;
       }
       temp.next = newNode;

       return head;


    }

    public static Node deleteAtBegining(Node head){
        if(head == null){
            return null;
        }

//        head = head.next;
//
//        return head;
        Node temp = head;
        head = head.next;
        temp = null;
        return head;





    }

    public static Node deleteAtEnd(Node head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;

        }
        temp.next = null;
        return head;
    }

    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Node head = null;

        head = Node.insertAtBegining(head,4);
        head = Node.insertAtBegining(head,5);
        head = Node.insertAtBegining(head,3);
        head = Node.insertAtBegining(head,6);
        head = Node.insertAtBegining(head,7);
        head = Node.insertAtBegining(head,8);
        System.out.println("List before deletion at begining");
        Node.print(head);
        System.out.println();
        System.out.println("List after deletion at begining");
        head = Node.deleteAtBegining(head);
        Node.print(head);

        System.out.println();
        System.out.println("List after insert at end");
        head = Node.insertAtTheEnd(head, 10);
        Node.print(head);
        System.out.println();

        System.out.println("Delete at end");
        head = Node.deleteAtEnd(head);
        Node.print(head);


    }
}
