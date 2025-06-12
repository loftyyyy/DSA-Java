public class MinHeap{
    private int[10] list;
    private int length;

    public MinHeap(){
        this.list = new int[10];
        this.length = 0;

    }

    public void insert(int value){

        this.list[this.length] = value;
        this.heapifyUp(this.length);
        this.length++;

    }

    public int delete(){
        if(this.length == 0){
            return -1;
        }

        int out = list[0];
        this.length--;

        if(this.length == 0){

            this.list = new int[10];

            return out;
        }

        this.list[0] = this.list[this.length];
        heapifyDown(0);
        return out;

    }

    public void heapifyUp(int index){

        int parentIdx = this.getParent(index);
        int parentValue = this.list[parentIdx];
        int currentValue = this.list[index]

        if(index == 0){
            return;
        }

        if(currentValue > parenValue){
            this.list[index] = parrentValue ;
            this.list[parentIdx] = currentValue;
            heapifyUp(parentIdx);

        }

        



    }

    public void heapifyDown(int index){

        int leftChildIndex = this.getLeftChild(index);
        int rightChildIndex = this.getRightChild(index);

        if(index >= this.length || leftIndex >= this.length){
            return;
        }

        int leftChildValue = this.list[leftChildIndex];
        int rightChildValue = this.list[rightChildIndex];
        int parentValue = this.list[index];


        if(leftChildValue > rightChildValue && parentValue > rightChildValue){
            this.list[index] = rightChildValue;
            this.list[rightChildIndex] = parentValue;
            heapifyDown(rightChildIndex);


        }else if(rightChildValue > leftChildValue && parentValue > leftChildValue){
            this.list[index] = leftChildValue;
            this.list[leftChildIndex] = parentValue;
            heapifyDown(leftChildIndex);
        }



    }


    private int getParent(int key){
        return (key - 2) / 2;
        
    }

    private int getLeftChild(int key){
        return (key * 2) + 1

    }

    private int getLeftChild(int key){
        return (key * 2) + 2

    }
}
