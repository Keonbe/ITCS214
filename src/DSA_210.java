import java.util.Scanner;

public class DSA_210 {

    // Node class representing each element in the binary tree
    static class Node {
        int data;
        Node left, right;

        public Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Tree class encapsulating the root node of the binary tree
    static class Tree {
        Node root;

        Tree() {
            root = null;
        }

        // Method to create a binary tree with at least 3 levels
        public void createTree() {
            root = new Node(8);
            root.left = new Node(5);
            root.right = new Node(10);

            root.left.left = new Node(2);
            root.left.right = new Node(4);
            root.left.left.left = new Node(1);
            root.left.left.right = new Node(3);

            root.right.right = new Node(13);
            root.right.right.left = new Node(11);
            root.right.right.right = new Node(14);
        }

        // Recursive method to search for an element in the tree
        public boolean searchElement(Node node, int value) {
            if (node == null) {
                return false; // Base case: reached a leaf node
            }

            if (node.data == value) {
                return true; // Element is found
            }

            // Recursively search in the left and right subtrees
            return searchElement(node.left, value) || searchElement(node.right, value);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tree tree = new Tree();

        // Create the binary tree
        tree.createTree();

        // Input: element to search
        System.out.print("Enter element to search: ");
        int elemToSearch = scanner.nextInt();

        // Call the search method and display the result
        if (tree.searchElement(tree.root, elemToSearch)) {
            System.out.println("Element is FOUND in the tree");
        } else {
            System.out.println("Element is NOT FOUND in the tree");
        }

        System.out.println("End of the program...");
    }
}

