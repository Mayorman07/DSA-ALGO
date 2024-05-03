package LinkedLists;

public class DoubleCircularLinkedList {

    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node firstNode = new Node (10);
        Node secondNode = new Node (20);
        Node thirdNode = new Node (30);
        Node fourthNode = new Node (40);
        Node fifthNode = new Node (50);
        Node sixthNode = new Node (60);

        firstNode.next = secondNode;
        secondNode.prev = firstNode;

        secondNode.next = thirdNode;
        thirdNode.prev = secondNode;

        thirdNode.next = fourthNode;
        fourthNode.prev = thirdNode;

        fourthNode.next = fifthNode;
        fifthNode.prev = fourthNode;

        fifthNode.next = sixthNode;
        sixthNode.prev = fifthNode;

        sixthNode.next = firstNode;
        firstNode.prev = sixthNode;

        Node currentNode = firstNode;
        Node startNode = firstNode;
        System.out.println("Forward Traversals");
        System.out.print(currentNode.data + " -> ");
        currentNode = currentNode.next;

        while(currentNode != startNode){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;

        }
        System.out.println(".....");

        Node currentNodeTwo = sixthNode;
        Node startNodeTwo = sixthNode;
        System.out.println("Backward Traversals");
        System.out.print(currentNodeTwo.data + " -> ");
        currentNodeTwo = currentNodeTwo.prev;

        while(currentNodeTwo != startNodeTwo){
            System.out.print(currentNodeTwo.data + " -> ");
            currentNodeTwo = currentNodeTwo.prev;

        }
        System.out.println(".....");
    }
}
