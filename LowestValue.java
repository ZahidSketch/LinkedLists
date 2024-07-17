public class LowestValue {

    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int lowestValue(Node head) {
        int min = head.data;
        Node current = head.next;
        while (current != null) {
            if ( current.data < min) {
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }

    public static void main(String[] args) {

        Node node1 = new Node(5);
        Node node2 = new Node(3);
        Node node3 = new Node(1);
        Node node4 = new Node(4);
        Node node5 = new Node(2);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;


        System.out.println(lowestValue(node1));
    }
}
