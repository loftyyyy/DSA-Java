//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

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
//        System.out.println(idk(5));

//
//        MazeRecursion();

        // Walk the maze
        //


        int[] unsortedArray = {32,2,6,9,12,21,69,37,8};
        QuickSort(unsortedArray, 0, unsortedArray.length - 1);
        System.out.println(Arrays.toString(unsortedArray));
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

    public static boolean Walk(char[][] maze, char wall, Point curr, Point end, boolean[][] seen, ArrayList<Point> path) {
        int[][] dir = {
                {-1, 0}, {1, 0}, {0, -1}, {0, 1}
        };

        if (curr.column < 0 || curr.column >= maze[0].length || curr.row < 0 || curr.row >= maze.length) {
            return false;
        }

        if (maze[curr.row][curr.column] == wall) {
            return false;
        }

        if (curr.column == end.column && curr.row == end.row) {
            path.add(new Point(curr.row, curr.column));
            return true;
        }

        if (seen[curr.row][curr.column]) {
            return false;
        }

        seen[curr.row][curr.column] = true;
        path.add(new Point(curr.row, curr.column));

        for (int i = 0; i < dir.length; ++i) {
            int dRow = dir[i][0];
            int dCol = dir[i][1];
            Point next = new Point(curr.row + dRow, curr.column + dCol);
            if (Walk(maze, wall, next, end, seen, path)) {
                return true;
            }
        }

        path.remove(path.size() - 1);
        return false;
    }
    public static void MazeRecursion() {
        char[][] maze = {
                {'#', 'S', '#', '#'},
                {'#', ' ', '#', ' '},
                {' ', ' ', ' ', ' '},
                {'E', '#', '#', '#'},
        };

        boolean[][] seen = new boolean[maze.length][maze[0].length];
        ArrayList<Point> path = new ArrayList<>();

        Point start = new Point(0, 1);
        Point end = new Point(3, 0);

        if (Walk(maze, '#', start, end, seen, path)) {
            System.out.println("Path found:");
            for (Point p : path) {
                System.out.println("(" + p.row + ", " + p.column + ")");
            }
        } else {
            System.out.println("No path found.");
        }
    }

    public static int Partition(int[] array, int low, int high){
        int pivot = array[high];
        int index = low - 1;

        for(int i = low; i < high; ++i){
            
            if(array[i] <= pivot){
                index++;

                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;


            }


        }
        index++;
        int temp = array[index];
        array[index] = array[high];
        array[high] = temp;

        return index;


    }

    public static void QuickSort(int[] unsortedArray, int low, int high){

        // QuickSort implementation
        // This is a placeholder for the QuickSort method.
        //
        // You can implement the QuickSort algorithm here.


        if(low >= high){
            return;

        }

        int pivotIndex = Partition(unsortedArray, low, high);
        QuickSort(unsortedArray, low, pivotIndex - 1);
        QuickSort(unsortedArray, pivotIndex + 1, high);





        



    }


}

