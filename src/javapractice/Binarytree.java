package javapractice;
import java.util.Scanner;

public class Binarytree {

    public static void main(String[] args) {
        Node root = createTree();
        Display(root);
    }

    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }

    static Node createTree() {
        System.out.println("Enter data: ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
            Node root = new Node(data);
            System.out.println("Enter left for " + data);
            root.left = createTree();

            System.out.println("Enter right for " + data);
            root.right = createTree();


        return root;
    }

    private static void Display(Node root) {
        if (root == null) {
            return;
        }
        String str = "<--" + root.data + "-->";
        if (root.left != null) {
            str = root.left.data + str;
        } else {
            str = "." + str;
        }
        if (root.right != null) {
            str = str + root.right.data;
        } else {
            str = str + ".";
        }
        System.out.println(str);
        Display(root.left);
        Display(root.right);

    }
}
