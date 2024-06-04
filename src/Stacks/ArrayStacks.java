package Stacks;
public class ArrayStacks {
    public static void main(String[] args) {
        ArrayStack myArrayStack = new ArrayStack(5);

        myArrayStack.push('M');
        myArrayStack.push('A');
        myArrayStack.push('Y');
        myArrayStack.push('O');
        myArrayStack.push('R');

        System.out.print("Stack: ");
        System.out.println();
        myArrayStack.printStack();

        System.out.println("Pop :" + myArrayStack.pop());
        System.out.println("Peek: " + myArrayStack.peek());
        System.out.println("isEmpty: " + myArrayStack.isEmpty());
        System.out.println("Size: " + myArrayStack.size());
    }
}

    class ArrayStack {
        char[] stack;
        int capacity;
        int top;

        public ArrayStack(int capacity) {
            this.capacity = capacity;
            this.top = -1;
            this.stack = new char[capacity];
        }

        public void push(char element) {
            if (top == capacity - 1) {
                System.out.println("Stack is full!!");
                return;
            }
            stack[++top] = element;
        }

        public char pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return ' ';
            }
            return stack[top--];
        }

        public char peek() {
            if (isEmpty()) {
                System.out.println();
                return ' ';
            }
            return stack[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public int size() {
            if (isEmpty()) {
                return 0;
            }
            return top + 1;
        }

        public void printStack() {
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i] + " ");
            }
            System.out.println();
        }
    }

