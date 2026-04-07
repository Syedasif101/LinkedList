public class ListNode {

    int data;
    ListNode next;

    ListNode(int data){
        this.data = data;
        this.next = null;
    }

    public static ListNode insertAtEnd(ListNode head, int val){
        ListNode newNode = new ListNode(val);
        if(head == null)
        {
            newNode.next = head;
            head = newNode;
        }
        else {
            ListNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }


    public static ListNode reverse (ListNode head){
        ListNode prev = null, curr = head, next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    public static void printList(ListNode head){

        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }


}
class MainClass{
    public static void main(String[] args) {

        ListNode head = null;

        head = ListNode.insertAtEnd(head, 2);
        head = ListNode.insertAtEnd(head, 4);
        head = ListNode.insertAtEnd(head, 6);
        head = ListNode.insertAtEnd(head, 8);
        head = ListNode.insertAtEnd(head, 10);
        head = ListNode.insertAtEnd(head, 12);

        System.out.println("List before reversal");
        ListNode.printList(head);

        System.out.println();
        System.out.println("List after reversal");

         head = ListNode.reverse(head);


         ListNode.printList(head);



    }
}
