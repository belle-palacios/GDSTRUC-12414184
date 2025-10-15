public class DoublyPlayerLinkedList {
    private DoublyPlayerNode head;
    private DoublyPlayerNode tail;
    private int size;

    public void addToFront(Player player) {
        DoublyPlayerNode newNode = new DoublyPlayerNode(player);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        size++;
    }

    public void addToEnd(Player player) {
        DoublyPlayerNode newNode = new DoublyPlayerNode(player);

        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        size++;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty, nothing to remove.");
            return;
        }

        System.out.println("Removed: " + head.getPlayer());
        head = head.getNext();

        if (head != null) {
            head.setPrev(null);
        } else {
            tail = null;
        }
        size--;
    }

    public int size() {
        return size;
    }

    public boolean contains(Player player) {
        return indexOf(player) != -1;
    }

    public int indexOf(Player player) {
        DoublyPlayerNode current = head;
        int index = 0;

        while (current != null) {
            if (current.getPlayer().equals(player)) {
                return index;
            }
            current = current.getNext();
            index++;
        }

        return -1;
    }

    public void printList() {
        DoublyPlayerNode current = head;

        System.out.print("HEAD -> ");

        while (current != null) {
            System.out.print(current.getPlayer() + " <-> ");
            current = current.getNext();
        }

        System.out.println("NULL");
        System.out.println("Size: " + size);
    }
}
