public class DFSOnBST<T>{



    public static void main(String[] args){

        BinaryNode<Integer> root = new BinaryNode<>(20);

        root.left = new BinaryNode<>(10);
        root.left.left = new BinaryNode<>(6);
        root.left.right = new BinaryNode<>(15);


        root.right = new BinaryNode<>(40);
        root.right.left = new BinaryNode<>(30);
        root.right.right = new BinaryNode<>(50);

        DFSOnBST test = new DFSOnBST();

        System.out.println(test.search(root, 50));


    }


    public boolean search(BinaryNode<T> curr, T target){

        if(curr == null){
            return false;
        }

        if(curr.getData().equals(target)){
            return true;

        }

        if(curr.getData() instanceof Comparable && ((Comparable) curr.getData()).compareTo(target) <= 0){
            return search(curr.right, target);
        }

        
        return search(curr.left, target);

    }


}
