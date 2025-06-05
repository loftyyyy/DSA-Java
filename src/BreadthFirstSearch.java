import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch<T>{

    public static void main(String[] args){
        BinaryNode<Integer> root = new BinaryNode<>(5);
        root.left = new BinaryNode<>(2);
        root.right = new BinaryNode<>(1);

        root.left.left = new BinaryNode<>(7);
        root.left.right = new BinaryNode<>(8);

        root.right.left = new BinaryNode<>(4);
        root.right.right = new BinaryNode<>(11);

        BreadthFirstSearch BVSF = new BreadthFirstSearch();
        BVSF.BFS(root, 11);
    }

    public void BFS(BinaryNode<T> head, T target ){

        Queue<BinaryNode<T>> value = new LinkedList<>();
        Queue<BinaryNode<T>> q = new LinkedList<>();
        q.add(head);
        value.add(head);

    
        while(!q.isEmpty()){
            BinaryNode<T> curr = q.poll();

            if(curr.getData().equals(target)){
                System.out.println("Yes, the value exist in the tree");
                    
            }

            if(curr.left != null){
                q.add(curr.left);
                value.add(curr.left);

            }

            if(curr.right != null){
                q.add(curr.right);
                value.add(curr.right);

            }

        }
        for(BinaryNode<T> val : value ){
            System.out.print(val.getData() + ", ");
        }

    }

}
