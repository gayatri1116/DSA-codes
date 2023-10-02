
// Approach 1 of calculating diameter of tree
//import InorderBT.Node;
import java.util.*;

public class DiameterofTreeApproach1 {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        return Math.max(leftheight, rightheight) + 1;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftdiameter = diameter(root.left);
        int leftheight = height(root.left);
        int rightdiameter = diameter(root.right);
        int rightheight = height(root.right);

        int selfdiameter = leftheight + rightheight + 1;
        return Math.max(selfdiameter, Math.max(leftdiameter, rightdiameter));

    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameter(root));

    }

}
