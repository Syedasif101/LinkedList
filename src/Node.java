public class Node
{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

    public static Node addAtBeginning(Node head, int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }


    }

    public static Node addAtEnd(Node head, int val){
        Node newNode = new Node(val);
        if(head == null){
            return newNode;
        } else {
            Node temp = head;

            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;


        }
        return head;
    }


    public static Node insertAtSpecificPosition(Node head, int val, int pos){

        if(pos < 1){
            return head;
        }

        if(pos == 1){
            Node newNode = new Node(val);
            newNode.next = head;
            return newNode;
        }

        Node curr = head;

        for(int i=0; i<pos-1 && curr != null; i++){
            curr = curr.next;
        }

        if(curr == null){
            return head;
        }
        Node newNode = new Node(val);
        newNode.next = curr.next;
        curr.next = newNode;

        return head;

    }


    public static Node deleteAtBeginning(Node head){
        if(head == null){
            return null;
        } else{
//            head = head.next;

            // for simplicity, we can write like this

            Node temp = head;
            head = head.next;

            temp = null; // Garbage collector will come and see that the temp is not pointing anywhere it will free up this memory space

        }

        return head;

    }

    public static Node deleteAtEnd(Node head){
        if (head == null){
            return null;
        }
         else {
             Node temp = head;
             while(temp.next.next != null){
                 temp = temp.next;
             }
             temp.next = null;


        }
         return head;
    }


    public static Node deleteAtSpecficPosition(Node head, int position){
        Node temp = head;
        if(position == 1){
            head = head.next;
            return head;

        }

        Node prev = null;
        for(int i=1; i<position; i++){
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
        return head;
    }


    public static boolean searchKey(Node head, int key){
        Node curr = head;

        while(curr != null){

            if(curr.data == key){
                return true;
            }
            else {
                curr = curr.next;
            }
        }

        return false;
    }



    // Recursive Approach
    public static boolean searchKeyAgain(Node head, int key){
        Node temp = head;

        // base case
        if(temp == null){
            return false;
        }

        if(temp.data == key){
            return true;
        }

        return searchKey(head.next, key);
    }


}

class Main{
    public static void main(String[] args){
        Node head = null;

        head = Node.addAtBeginning(head, 3);
        head = Node.addAtBeginning(head, 5);
        head = Node.addAtBeginning(head, 7);
        head = Node.addAtBeginning(head, 9);


        head = Node.addAtEnd(head, 99);

        head = Node.addAtEnd(head, 46);


         head = Node.insertAtSpecificPosition(head, 77, 3);


         head = Node.deleteAtBeginning(head);


         head = Node.deleteAtEnd(head);

         head = Node.deleteAtSpecficPosition(head,3);
         boolean find = Node.searchKeyAgain(head, 66);
        System.out.println(find);
        Node.printList(head);





    }
}
