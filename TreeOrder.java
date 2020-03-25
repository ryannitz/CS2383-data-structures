import java.util.*;

public class TreeOrder{

    public static void main(String[] args) {

        //null node to be used to offset the indexing to match the Ids
        Node nullNode = new Node(0, 0, 0, 0, 0);
        //when node = 0, then that is 'null'
        Node root = new Node(1, 12, 0, 2, 3);
        Node n2 = new Node(2, 10, 1, 0, 4);
        Node n3 = new Node(3, 19, 1, 5, 0);
        Node n4 = new Node(4, 13, 2, 0, 0);
        Node n5 = new Node(5, 15, 3, 6, 7);
        Node n6 = new Node(6, 14, 5, 0, 0);
        Node n7 = new Node(7, 18, 5, 0, 0);

        Node[] treeNodes = {nullNode, root, n2, n3, n4, n5, n6, n7};

        preOrder(treeNodes, root);
        System.out.println();
        inOrder(treeNodes, root);
        System.out.println();
        postOrder(treeNodes, root);
        System.out.println();
    }

    //added static for the main method access
    private static class Node{
        int ID;
        int Data;
        int Parent;
        int Left;
        int Right;

        Node(int ID, int Data, int Parent, int Left, int Right){
            this.ID = ID;
            this.Data = Data;
            this.Parent = Parent;
            this.Left = Left;
            this.Right = Right;
        }

    }

    public static void preOrder(Node[] treeNodes, Node root){
        //root-left-right
        if(root.ID != 0){
            System.out.print(root.Data + " ");
            preOrder(treeNodes, treeNodes[root.Left]);
            preOrder(treeNodes, treeNodes[root.Right]);
        }
    }

    public static void inOrder(Node[] treeNodes, Node root){
        //left-root-right
        if(root.ID != 0){
            inOrder(treeNodes, treeNodes[root.Left]);
            System.out.print(root.Data + " ");
            inOrder(treeNodes, treeNodes[root.Right]);
        }
    }

    public static void postOrder(Node[] treeNodes, Node root){
        // left-right-root
        if(root.ID != 0){
            postOrder(treeNodes, treeNodes[root.Left]);
            postOrder(treeNodes, treeNodes[root.Right]);
            System.out.print(root.Data + " ");
        }
    }
}


