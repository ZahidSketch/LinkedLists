import javax.swing.*;

public class TraverseList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
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
    public static void main(String[] args){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.next = node2;
        node2.next = node3;
        traverseAndPrint(node1);
    }
}
