package LinkedLists;

public class SingleCircularLinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node firstNode = new Node(33);
        Node secondNode = new Node(44);
        Node thirdNode = new Node(55);
        Node fourthNode = new Node(66);
        Node fifthNode = new Node(77);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        fifthNode.next = firstNode;

        Node currentNode = firstNode;
        Node startNode = firstNode;
        System.out.println("Forward Traversals");
        System.out.print( currentNode.data + " -> ");
        currentNode = currentNode.next;

        while( currentNode != startNode){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }

        System.out.println( ".....");

    }

}
