import org.w3c.dom.Node;

public class InsertNode {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void printList(Node head){
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
        System.out.print("NULL");
    }

    static Node insertNode(Node head, Node newNode, int position){

        if(position == 1){
            newNode.next = head;
            return newNode;
        }
        Node currentNode = head;
        for(int i = 1; i < position -1 && currentNode != null ; i++){
            currentNode = currentNode.next;
        }
        if(newNode != null){
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
        return head;
    }
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        printList(node1);
        Node newNode = new Node(3);
        insertNode(node1, newNode, 3);
        System.out.println();
        printList(node1);
    }
}
