import java.util.EmptyStackException;

public class ArrayStack {
    private Player[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new Player[capacity];
        top = 0;
    }

    public void push (Player player) {
        // resize if array full (to check)
        if (top == stack.length) {
            Player[] newStack = new Player [stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        stack[top++] = player;

    }

    public Player pop() {
        if (isEmpty()) {
            return null;
            //throw new EmptyStackException();
        }

        return stack[--top];
    }

    public Player peek() {
        if (isEmpty()) {
            return null;
            //throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
