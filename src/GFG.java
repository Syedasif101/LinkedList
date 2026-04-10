//class Node1{
//
//    int data;
//    Node1 prev, next;
//
//
//    Node1(int val){
//        data = val;
//        prev = next = null;
//    }
//
//
//
//}
//
//class GFG{
//    public static void main(String[] args){
//
//        Node1 head = new Node1(10);
//
//        head.next = new Node1(20);
//
//        head.next.prev = head;
//
//        head.next.next = new Node1(30);
//
//        head.next.next.prev = head.next;
//
//        head.next.next.next = new Node1(40);
//        head.next.next.next.prev = head.next.next;
//
//        Node1 temp = head;
//
//        while(temp != null){
//            System.out.print(temp.data);
//
//            if(temp.next != null){
//                System.out.print("<->");
//            }
//
//            temp = temp.next;
//        }
//
//    }
//}
class Node1 {
    int data;
    Node1 prev, next;

    Node1(int val){
        data = val;
        prev = next = null;

    }


    public static Node1 insertAtHead(Node1 head, int data){

        Node1 newNode = new Node1(data);
        newNode.next = head;

        if(head != null){
            head.prev = newNode;
        }
        head = newNode;

        return head;

    }


    public static Node1 insertAtEnd(Node1 head, int data){

        Node1 newNode = new Node1(data);

        if(head == null){
            head = newNode;
            return newNode;
        }

        Node1 temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        newNode.prev = temp;
        temp.next = newNode;

        return head;


    }


    public static void displayList(Node1 head){
        Node1 temp = head;
        while(temp != null){
            System.out.print(temp.data);

            if(temp.next != null){
                System.out.print("<->");
            }

            temp = temp.next;
        }
    }
}

class GFG{
    public static void main(String[] args){

        Node1 head = null;
        Node1.insertAtHead(head,10);

        head = Node1.insertAtHead(head, 20);
        head = Node1.insertAtHead(head, 30);
        head = Node1.insertAtHead(head, 40);
        head = Node1.insertAtHead(head, 50);

        head = Node1.insertAtEnd(head, 100);

        Node1.displayList(head);
    }
}



















