public class Node<T> {
    public T data;
    private Node<T> next;


    public Node (T data) {
        this.data = data;
        this.next = null;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node getNext() {
        return this.next;
    }

    public T getData() {
        return this.data;
    }
}
