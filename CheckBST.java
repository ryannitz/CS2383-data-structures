class CheckBST{

    Node root;

    public static void main(String[] args){

        CheckBST tree1 = new CheckBST();
        tree1.root = new Node(13);

        tree1.root.left = new Node(10);
        tree1.root.left.right = new Node(12);

        tree1.root.right = new Node(19);
        tree1.root.right.left = new Node(15);
        tree1.root.right.left.right = new Node(18);
        tree1.root.right.left.left = new Node(14);

        CheckBST tree2 = new CheckBST();
        tree2.root = new Node(12);

        tree2.root.left = new Node(10);
        tree2.root.left.right = new Node(13);

        tree2.root.right = new Node(19);
        tree2.root.right.left = new Node(15);
        tree2.root.right.left.right = new Node(18);
        tree2.root.right.left.left = new Node(14);

        System.out.println("Tree1" + (isBST(tree1.root, Integer.MAX_VALUE, Integer.MIN_VALUE)? " is ":" is not ") + "a BST");
        System.out.println("Tree2" + (isBST(tree2.root, Integer.MAX_VALUE, Integer.MIN_VALUE)? " is ":" is not ") + "a BST");
    }

    public static boolean isBST(Node root, int max, int min){
        if(root == null){
            return true;
        }
        if(root.data < min || root.data > max){
            return false;
        }
        else{
            return (isBST(root.left, root.data-1, min) && isBST(root.right, max, root.data+1));
        }
    }

    private static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
}