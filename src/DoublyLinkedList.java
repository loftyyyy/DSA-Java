public class DoublyLinkedList{
    public int length;
    private Node<T> head; 
    private Node<T> tail;

    class DoubyLinkedList(){
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    public void prepend(T value){


        Node<T> node = new Node<>(value);

        if(this.head == null){


            System.out.println("No head, creating head");
            this.head = node;
            this.tail = node;

            return;
        }

        node.setNext(this.head);
        this.head.setPrev(node);
        this.head = node;

        this.length++;


    }

    public void append(T value){
        Node<T> node = new Node<>(value);

        if(this.head == null){
            System.out.println("No head, creating head");
            this.head = node;
            this.tail = node;
            return;
        }

        node.setPrev(this.tail);
        this.tail.setNext(node);
        this.tail = node;

        this.length++; 


    }

    public void insertAt(T value, int index){
        Node<T> node = new Node<>(value);
        

        if(index > this.length){
            throw new IllegalStateException("Cannot happend bro, index too big for the length");
        }else if(index == this.length){
            this.append(value);
        }else if(index == 0){
            this.prepend(value);
        }else{
            Node<T> temp = this.head;

            for(int i = 0; temp != null && i < index; ++i){
                temp = temp.getNext();

            }
            
            node.setNext(temp);
            node.setPrev(temp.getPrev());
            temp.getPrev().setNext(node);
            temp.setPrev(node);



            //LOGIC BEFORE BOOKEEPING !!!!!!
            this.length++;
        }


    }

    public void remove(int value){
        if(this.length == 0){
            throw new IllegalStateException("Damn bro really trying to remove an empty list?!?");

        }else{
            Node<T> curr = this.head;
            for(int i = 0; curr != null && i < this.length; ++i){
                if(curr.getData().equals(value)){
                    if(curr == this.head){
                        this.head.getNext().setPrev(null);
                        this.head = this.head.getNext();


                    }else if(curr == this.tail){
                        this.tail.getPrev().setNext(null);
                        this.tail = this.tail.getPrev();

                    }else{
                        curr.getNext().setPrev(curr.getPrev());
                        curr.getPrev().setNext(curr.getNext());
                        curr = null;


                    }
                    this.length--;
                    return;

                }
                curr = curr.getNext();

            }
        }
        System.out.println("No value found");




        


    }

    public T get(int index){
        
        if(this.length == 0){
            throw new IllegalStateException("Bro really trying to get something that doesn't exist");
        }else if(index >= this.length || index < 0){
            throw new IllegalStateException("Bro really trying to get something that's beyond the current items");

        }else{
            Node<T> curr = this.head;

            for(int i = 0; curr != null && i < index; ++i){
                curr = curr.getNext();

            }
            return curr.getData();
        }


    }

    public void removeAt(int index){
        if(this.length == 0){
            throw new IllegalStateException("Bro really trying to remove something that doesn't exist");

        }
        if(index >= this.length || index < 0){
            throw new IllegalStateException("Bro really trying to get something that's beyond the current items");

        }
        if(index == 0 && this.length == 1){
            this.head = null;
            this.tail = null;

        }
        else{
            Node<T> curr = this.head;
            if(index == 0){
                this.head.getNext().setPrev(null);
                this.head = this.head.getNext();


            }else if(index == this.length - 1){
                this.tail.getPrev().setNext(null);
                this.tail = this.tail.getPrev();

            }else{

                for(int i = 0; curr != null && i < index; ++i ){
                    curr = curr.next;


                        
                    }

                        curr.getNext().setPrev(curr.getPrev());
                        curr.getPrev().setNext(curr.getNext());




                }



            }
            this.length--;



        }



    }





}
