public class Queue {
    public int length;
    private Node head;
    private Node tail;



    public Queue(){

        this.length = 0;
        this.head = null;
        this.tail = null;

    }

    public void enqueue(Node node){
        this.length++;
        if(this.tail == null){
            this.head = node;
            this.tail = node;

            return;

        }

        this.tail.setNext(node);
        this.tail = node;





    }

    public  void dequeue(){
        if(this.head == null){
            System.out.println("No Head");
            return;
        }

        this.length--;

        Node temp = this.head;
        this.head = this.head.getNext();
        temp.setNext(null);
        
        System.out.println(this.head.getData());




    }

    public int peek(){

        return this.head.getData();

    }
}
