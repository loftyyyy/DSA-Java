public class Node<T> {
    private T data;
    private Node<T> next;
    private Node<T> prev;


    public Node (T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setPrev(Node<T> prev){
        this.prev = prev;
    }


    public Node<T> getNext() {
        return this.next;
    }

    public Node<T> getPrev(){
        return this.prev;
    }

    public T getData() {
        return this.data;
    }
}
