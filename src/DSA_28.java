public class DSA_28 {

    static class Node {
        int data;
        Node left, right;
        public Node(int value) {
            data = value;
            left = right = null;
        }
    }

    static class Tree {
        // root of Tree
        Node root;
        Tree() {
            root = null;
        }

        void inOrder(Node node) { //In-order Traversal: Left subtree, Root node, Right subtree.
            if (node == null)
                return;
            // traverse the left child
            inOrder(node.left);
            // traverse the root node
            System.out.print(node.data + "->");
            // traverse the right child
            inOrder(node.right);
        }

        void preOrder(Node node) { //Pre-order Traversal: Root node, Left subtree, Right subtree.
            if (node == null)
                return;
            // traverse the root node
            System.out.print(node.data + "->");
            // traverse the left child
            preOrder(node.left);
            // traverse the right child
            preOrder(node.right);
        }

        void postOrder(Node node) { //Post-order Traversal: Left subtree, Right subtree, Root node.
            if (node == null)
                return;
            // traverse the left child
            postOrder(node.left);
            // traverse the right child
            postOrder(node.right);
            // traverse the root node
            System.out.print(node.data + "->");
        }
    }

    public static void main(String[] args) {
        // create an object of Tree
        Tree tree = new Tree();
        // create nodes of tree
        tree.root = new Node(1); // 1 root
        tree.root.left = new Node(12); //12 left
        tree.root.right = new Node(9); //9 right
        // create child nodes of left child
        tree.root.left.left = new Node(5); //12 -> 5
        tree.root.left.right = new Node(6);  //12 -> 6

        System.out.println("Inorder Traversal");
        tree.inOrder(tree.root); //5, 12, 6, 1, 9
        System.out.println("\npreOrder Traversal");
        tree.preOrder(tree.root); //1, 12, 5, 6, 9
        System.out.println("\npostOrder Traversal");
        tree.postOrder(tree.root); //5, 6, 12, 9, 1
    }
}