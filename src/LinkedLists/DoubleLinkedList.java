package LinkedLists;

public class DoubleLinkedList {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

        public static void main(String[] args) {

            Node firstNode = new Node(0);
            Node secondNode = new Node(1);
            Node thirdNode = new Node(2);
            Node fourthNode = new Node(3);
            Node fifthNode = new Node(4);
            Node sixthNode = new Node(5);
            Node seventhNode = new Node(6);
            Node eightNode = new Node(7);
            Node ninthNode = new Node(8);
            Node tenthNode = new Node(9);

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

            sixthNode.next = seventhNode;
            seventhNode.prev = sixthNode;

            seventhNode.next = eightNode;
            eightNode.prev = seventhNode;

            eightNode.next = ninthNode;
            ninthNode.prev = eightNode;

            ninthNode.next = tenthNode;
            tenthNode.prev = ninthNode;

            Node currentNode = firstNode;
            System.out.println("Forward Traversal");
            while( currentNode != null){
                System.out.print(currentNode.data + " -> ");
                currentNode = currentNode.next;

            }
            System.out.println("null");

            Node currentNodeTwo = ninthNode;
            System.out.println("Backward Traversal");
            while(currentNodeTwo != null){
                System.out.print(currentNodeTwo.data + " -> ");
                currentNodeTwo = currentNodeTwo.prev;
            }
            System.out.println("null");

        }
    }

