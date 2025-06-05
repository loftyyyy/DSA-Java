import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class CompareTwoTrees<T>{

    public static void main(String[] args){
        BinaryNode<Integer> a = new BinaryNode<>(3);

        a.left = new BinaryNode<>(2);
        a.right = new BinaryNode<>(4);

        a.left.left = new BinaryNode<>(5);
        a.left.right = new BinaryNode<>(7);

        a.right.left = new BinaryNode<>(8);
        a.right.right = new BinaryNode<>(9);

        BinaryNode<Integer> b = new BinaryNode<>(3);

        b.left = new BinaryNode<>(2);
        b.right = new BinaryNode<>(4);

        b.left.left = new BinaryNode<>(5);
        b.left.right = new BinaryNode<>(7);

        b.right.left = new BinaryNode<>(8);
        b.right.right = new BinaryNode<>(9);


        ArrayList<Integer> path = new ArrayList<>();
        
        CompareTwoTrees<Integer> cp = new CompareTwoTrees<>();

        System.out.println(cp.compare(a, b));
        System.out.println(cp.traverse(a, path));
        cp.DepthFirstSearch(a,3);
                



    }

    public boolean compare(BinaryNode<T> a, BinaryNode<T> b){


        if(a == null && b == null){
            return true;

        }
        
        if(a == null || b == null){
            return false;

        }

        if(a.getData() != b.getData()){
            return false;

        }

        return compare(a.left, b.left) && compare(a.right, b.right);

    }

    public ArrayList<Integer> traverse(BinaryNode<T> root, ArrayList<Integer> path){

        if(root == null){
            return path;

        }

        //Pre
        path.add((Integer)root.getData());

        //Recurse
        traverse(root.left, path);
        traverse(root.right, path);


        //Post

        return path;






    }

    public void DepthFirstSearch(BinaryNode<T> head, T target){
        ArrayList<BinaryNode<T>> path = new ArrayList<>();
        Queue<BinaryNode<T>> q = new LinkedList<>();
        q.add(head);
        path.add(head);

        while(!q.isEmpty()){

            BinaryNode<T> curr = q.poll();

            if(curr.getData().equals(target)){
                System.out.println("Found");
            }

            if(curr.left != null){
                q.add(curr.left);
                path.add(curr.left);

            }

            if(curr.right != null){
                q.add(curr.right);
                path.add(curr.right);

            }

             
        }
        System.out.println("not found");
        for(BinaryNode<T> node : path){
            System.out.print(node.getData() + ",");

        }






    }

}
