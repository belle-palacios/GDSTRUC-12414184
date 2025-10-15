public class PlayerLinkedList {
    private PlayerNode head;
    private int size; // in-place counter

    public void addToFront(Player player) {
        PlayerNode newNode = new PlayerNode(player);

        if (head != null) {
            newNode.setNext(head);
        }

        head = newNode;
        size++;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty, nothing to remove.");
            return;
        }

        System.out.println("Removed: " + head.getPlayer());
        head = head.getNext();
        size--;
    }

    public int size() {
        return size;
    }

    public boolean contains(Player player) {
        return indexOf(player) != -1;
    }

    public int indexOf(Player player) {
        PlayerNode current = head;
        int index = 0;

        while (current != null) {
            if (current.getPlayer().equals(player)) {
                return index;
            }
            current = current.getNext();
            index++;
        }

        return -1; // not found
    }

    public void printList() {
        PlayerNode current = head;

        System.out.print("HEAD -> ");

        while (current != null) {
            System.out.print(current.getPlayer() + " -> ");
            current = current.getNext();
        }

        System.out.println("NULL");
        System.out.println("Size: " + size);
    }
}
