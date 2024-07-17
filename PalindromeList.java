public class PalindromeList {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static void printList(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    static boolean palindromeCheck(Node head){
        if(head == null){
            return true;
        }
        Node mid = middle(head);
        Node last = reverse(mid);
        Node curr = head;
        while(last != null){
            if(last.data != curr.data){
                return false;
            }
            last = last.next;
            curr = curr.next;
        }
        return true;
    }

    static Node  middle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static Node reverse(Node head){

        Node curr = head;
        Node prev = null;
        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr =temp;
        }
        return prev;
    }

    public static void main(String[] args) {
            Node node1 = new Node(1);
            Node node2 = new Node(2);
            Node node3 = new Node(3);
            Node node4 = new Node(4);
            Node node5 = new Node(5);
            Node node6 = new Node(6);

            node1.next = node2;
            node2.next = node3;
            node3.next = node4;
            node4.next = node5;
            node5.next = node6;
            node6.next = null;

            printList(node1);
            System.out.println();
            boolean b = palindromeCheck(node1);
            System.out.println(b);
    }
}
