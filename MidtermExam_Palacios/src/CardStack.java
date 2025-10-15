public class CardStack {
    private Node top;


    private class Node {
        Card data;
        Node next;

        Node(Card data) {
            this.data = data;
        }
    }

    public void push(Card card) {
        Node newNode = new Node(card);
        newNode.next = top;
        top = newNode;
    }

    public Card pop() {
        if (isEmpty()) {
            return null;
        }
        Card popped = top.data;
        top = top.next;
        return popped;
    }

    public Card peek() {
        if (isEmpty()) {
            return null;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("[Empty]");
            return;
        }
        Node current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int size() {
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
