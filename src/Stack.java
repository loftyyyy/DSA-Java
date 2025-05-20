public class Stack {
    public int length;
    private Node head;
    private Node tail;



    
    public Stack(){
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    public void push(Node data){
        length++;
        data.setNext(this.head);

        if(this.tail == null){
            this.tail = data;
     
        }

        this.head = data;




    }

    public void pop(){
        if(this.head == null){
            System.out.println("No  Data");

            return;



        }

        Node temp = this.head;

        this.head = this.head.getNext();
        temp.setNext(null);


        this.length--;

        if(this.head == null){
            this.tail = null;

        }

        

    }

    public void peek(){
        if(this.head == null){
            System.out.println("Stack empty");
            return;
        }

        System.out.println(this.head.getData());

    }

}
