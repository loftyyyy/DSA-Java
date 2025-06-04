public class BinaryNode<T>{

    private T data;
    BinaryNode<T> left;
    BinaryNode<T> right;


    public BinaryNode(T data){
        this.data = data;
        this.left = null;
        this.right = null;
 
    }

    public T getData(){
        return this.data;

    }
}
