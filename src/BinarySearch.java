public class BinarySearch{

    public static void main(){

    }

    public ArrayList<Integer> traverse(BinaryNode<T> curr, ArrayList<Integer> path){
        if(!curr){
            return path;
        }
        // Pre
        path.add(curr.getData());

        // Recurse
        walk(curr.left, path);
        walk(curr.right, path);

        // Post
        return path;


    }
    public void preOrder(){



    }

    public void inOrder(){

    }

    public void postOrder(){

    }


}
