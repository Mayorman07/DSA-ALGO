package Stacks;

public class LinkedListStacks {
    public static void main(String[] args) {
        Stack myLinkedStack = new Stack();

        myLinkedStack.push('N');
        myLinkedStack.push('E');
        myLinkedStack.push('N');
        myLinkedStack.push('N');
        myLinkedStack.push('I');
        myLinkedStack.push('E');


        System.out.println("Pop :" + myLinkedStack.pop());
        System.out.println("Peek: " + myLinkedStack.peek());
        System.out.println("isEmpty: " + myLinkedStack.isEmpty());
        System.out.println("Size: " + myLinkedStack.size());

    }
}

    class Node{
        char value;
        Node next;

        Node(char value){
            this.value = value;
            this.next = null;
        }
    }

    class Stack{
        private int size;
        private Node headNode;

      public Stack(){
            this.headNode = null;
            this.size = 0;
        }

        public void push(char value){
          Node newNode = new Node(value);
          if(headNode != null){
              newNode.next = headNode;
          }
            headNode = newNode;
            size ++;
        }

        public char pop(){
          if (isEmpty ()){
              return ' ';
          }
          char popped = headNode.value;
          headNode = headNode.next;
          size --;
          return popped;
        }

        public char peek(){
          if (isEmpty ()){
              return ' ';
          }
          return headNode.value;
        }

        public boolean isEmpty(){
          return size == 0;
        }

        public int size(){
          return size;
        }
     }


//        Browser History Management:
//        Web browsers use stacks to manage the history of visited pages.
//        When a user navigates back, the current page is popped from the stack of visited pages.


//        Undo Mechanism in Text Editors:
//        Many text editors implement an undo feature using stacks. Every change in the text is pushed onto a stack.
//        When the user performs an undo operation, the last change is popped from the stack and reverted.