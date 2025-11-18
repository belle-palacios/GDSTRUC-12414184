public class Main {
    public static void main(String[] args) {
        Tree bst = new Tree();
        bst.insert(25);
        bst.insert(20);
        bst.insert(15);
        bst.insert(27);
        bst.insert(30);
        bst.insert(29);
        bst.insert(26);
        bst.insert(22);
        bst.insert(32);

        System.out.println("In Order Traversal (Ascending): ");
        bst.inOrderTraverse();

        System.out.println("\nGet Method (to show if null): ");
        int value = 100;
        System.out.println("Node with value " + value + " - " + bst.get(value));
        value = 29;
        System.out.println("Node with value " + value + " - " + bst.get(value));
        //in og code sent in channel, not important as others

        System.out.println("\nMin and Max Nodes: ");
        System.out.println("Minimum node: " + bst.getMin());
        System.out.println("Maximum node: " + bst.getMax());

        System.out.println("\nIn Order Traversal (Descending): ");
        bst.traverseInOrderDescending();
    }
}