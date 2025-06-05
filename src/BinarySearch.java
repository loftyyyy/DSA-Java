import java.util.ArrayList;

public class BinarySearch<T>{

    public static void main(String[] args){
        BinaryNode<Integer> root = new BinaryNode<>(3);
        root.left = new BinaryNode<>(2);
        root.right = new BinaryNode<>(1);
        ArrayList<Integer> path = new ArrayList<>();

        BinarySearch<Integer> search = new BinarySearch<>();
        search.traverse(root, path);
        System.out.println(path);


    }

    public ArrayList<T> traverse(BinaryNode<T> curr, ArrayList<T> path){
        if(curr == null){
            return path;
        }

        // Pre
        path.add(curr.getData());

        // Recurse
        traverse(curr.left, path);
        traverse(curr.right, path);

        // Post
        return path;


    }
    public ArrayList<T> preOrder(BinaryNode<T> curr, ArrayList<T> path){
        if(curr == null){
            return path;


        }


        //Pre
        path.add(curr.getData());
    
        //Recurse
        preOrder(curr.left, path);
        preOrder(curr.right, path);


        //Post


        return path;



    }

    public ArrayList<T> inOrder(BinaryNode<T> curr, ArrayList<T> path){
        if(curr == null){
            return path;
        }

        // Pre
        
        // Recurse
        inOrder(curr.left, path);
        path.add(curr.getData());
        inOrder(curr.right, path);

        // Post
        return path;


    }

    public ArrayList<T> postOrder(BinaryNode<T> curr, ArrayList<T> path){
        if(curr == null){
            return path;
        }

        postOrder(curr.left, path);
        postOrder(curr.right, path);
        path.add(curr.getData());

        return path;


    }


}
