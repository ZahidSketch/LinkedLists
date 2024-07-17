public class RemoveNode {


    static class Node {

        int data;
        Node next;

        public Node(int data) {

            this.data = data;
            this.next = null;
        }
    }

    public static void traverseAndPrint(Node head){

        Node currentNode = head;

        while(currentNode != null){

            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }

        System.out.print("NULL");
    }



    static Node removeNode(Node head, Node nodeToRemove) {

        if (head == null) {
            return head.next;
        }

        Node currentNode = head;

        while (currentNode.next != null && currentNode.next != nodeToRemove){

            currentNode = currentNode.next;
        }

        if (currentNode.next == null){
            return head;
        }

        currentNode.next = currentNode.next.next;
        return head;
    }

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        traverseAndPrint(node1);
        removeNode(node1, node2);

        System.out.println();
        traverseAndPrint(node1);
    }
}
