public class Tree {
    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        }
        else {
            root.insert(value);
        }
    }

    public void inOrderTraverse() {
        if (root != null) {
            root.inOrderTraverse();
        }
    }

    public Node get(int value) {
        if (root == null) {
            return  null;
        }

        return  root.get(value);
    }

    //minimum node
    public Node getMin() {
        if (root == null) {
            return null;
        }
        return root.getMin();
    }

    //maximum node
    public Node getMax() {
        if (root == null) {
            return null;
        }
        return root.getMax();
    }

    //descending order
    public void traverseInOrderDescending() {
        if (root != null) {
            root.traverseInOrderDescending();
        }
    }
}
