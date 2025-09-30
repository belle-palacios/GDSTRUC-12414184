public class Main {
    public static void main(String[] args) {
        // Singly Linked List test
        PlayerLinkedList list = new PlayerLinkedList();

        Player p1 = new Player(1, "Optimus", 999);
        Player p2 = new Player(2, "Megatron", 777);
        Player p3 = new Player(3, "Mirage", 500);

        list.addToFront(p1);
        list.addToFront(p2);
        list.addToFront(p3);

        System.out.println("=== Singly Linked List ===");
        list.printList();

        list.removeFirst();
        list.printList();

        System.out.println("Contains Megatron? " + list.contains(p2));
        System.out.println("Index of Megatron: " + list.indexOf(p2));

        // Doubly Linked List test
        DoublyPlayerLinkedList dlist = new DoublyPlayerLinkedList();
        dlist.addToFront(p1);
        dlist.addToFront(p2);
        dlist.addToEnd(p3);

        System.out.println("\n=== Doubly Linked List ===");
        dlist.printList();

        dlist.removeFirst();
        dlist.printList();

        System.out.println("Contains Optimus? " + dlist.contains(p1));
        System.out.println("Index of Mirage: " + dlist.indexOf(p3));
    }
}
