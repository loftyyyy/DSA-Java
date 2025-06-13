import java.util.*;
import java.util.Queue;

public class BFSGraphMatrix{

    public static void main(String[] args){


        int[][] graph = {
                {0, 1, 0, 0},
                {1, 0, 1, 1},
                {0, 1, 0, 1},
                {0, 1, 1, 0}
        };

        List<Integer> path = bfs(graph, 0, 2);
        if (path != null) {
            System.out.println("Path: " + path);
        } else {
            System.out.println("No path found.");
        }
    }

    public static List<Integer> bfs(int[][] graph, int startingIndex, int target){
        boolean[] seen = new boolean[graph.length];
        Arrays.fill(seen, false);
        int[] prev = new int[graph.length];
        Arrays.fill(prev, -1);

        seen[startingIndex] = true;

        Queue<Integer> q = new LinkedList<>();
        q.add(startingIndex);


        do{
            int currentIndex = q.poll();

            if(currentIndex == target){
                break;

            }
            seen[currentIndex] = true;

            int[] adj = graph[currentIndex];
            for(int i = 0; i < adj.length; ++i){

                if(adj[i] == 0){
                    continue;
                }

                if(seen[i]){
                    continue;
                }
                seen[i] = true;
                prev[i] = currentIndex;
                q.add(i);



                 

                

            }



        }while(!q.isEmpty());
        if(prev[target] == -1){
            return new ArrayList<>();
        }

        int curr = target;
        List<Integer> out = new ArrayList<>();

        while(curr != -1){
            out.add( curr);
            curr = prev[curr];
                 
        }

        List<Integer> reversedOut = new ArrayList<>(out);

        Collections.reverse(reversedOut);
        return reversedOut;






    }


}
