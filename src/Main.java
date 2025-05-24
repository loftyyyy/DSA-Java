//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.math.*;
public class Main {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,6,34};
        int target = 34;
        boolean[] storey = {false, false, false, false, true, true, true, true };


        // Linear Search
        boolean result = LinearSearch(arr, target);
//        System.out.println("Linear Search: " + result);
        // Binary Search
        // First sort the array
//         boolean result2 = BinarySearch(arr,0, arr.length, 14);
//        System.out.println(result2);
        // Jump Search
//        boolean result3 = TwoCrystalBalls(storey);


        // Jump Search
//        int[] arr2 = {2,3,1};
//        BubbleSort(arr2);

//        newQueue(3);

//        newStack();
        System.out.println(idk(5));
    }


    public static boolean LinearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
            }

        }

        return false;

    }

    public static boolean BinarySearch(int[] arr, int low, int high, int target){
//        [low, high)
        
        while(low < high){

            int mid = low + (high - low)/2;

            if(arr[mid] == target){

                return true;

            }else if(target > arr[mid]){

                low = mid + 1;

            }else {

                high = mid;

            }


            
        }
        return false;

    }
    public static boolean TwoCrystalBalls(boolean[] storey ){

        int jump = (int) Math.floor(Math.sqrt(storey.length));

        int i = jump;


        for(; i < storey.length; i += jump){
            if(storey[i]){
                System.out.println(i);
                i -= jump;
                break;
            }
        }

        for(int j = 0; j <= jump && i < storey.length; ++j, ++i){
            System.out.println(i);
            if(storey[i]){
                System.out.println("Broken at " + i );
                return true;

            }
        }

        return false;


    }

    public static void BubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }



    }

    public static void newQueue(int head){
        Node temp = new Node(head);
        Queue queue = new Queue();
        queue.enqueue(temp);
        queue.enqueue(new Node(2));
        queue.enqueue(new Node(3));
        queue.enqueue(new Node(4));
        queue.enqueue(new Node(5));

        System.out.println(queue.peek());
        queue.dequeue();
    }
    public static void newStack(){

        Node temp = new Node(1);
        Stack stack = new Stack();
        stack.push(temp);
        stack.push(new Node(2));
        stack.push(new Node(3));
        stack.push(new Node(4));
        stack.push(new Node(5));

        stack.peek();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.peek();
    }

    public static int idk(int n){
//        Recursion:
//        Pre n +
//        Recurse
//        Post
        if(n == 1){
            return 1;
        }


        int out =  n + idk(n - 1);
        return out;



    }

    public static boolean Walk(String[] maze, String wall, int[] curr, int[] end ){


    }
    public staic String[] MazeRecursion(String[] maze){







    }

}

