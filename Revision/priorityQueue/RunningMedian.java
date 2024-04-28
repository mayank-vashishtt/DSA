package Revision.priorityQueue;
import java.util.*;

//         PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());



public class RunningMedian {


    public int[] solve(int[] A) {


            //  1 2 5 4 3 
 
    //  maxheap  -- >    3 2  1 

    //  minheap  -- >      4 5 

    // result  -- >  1  1  2  2  3 

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int[] result = new int[A.length];


        for (int i = 0; i < A.length; i++) {
            
            maxHeap.offer(A[i]);

            minHeap.offer(maxHeap.poll());

            if (maxHeap.size() < minHeap.size()) {
                maxHeap.offer(minHeap.poll());
            }

            result[i] = maxHeap.peek();

            
        }
        return result;
    }

    public static void main(String[] args) {
        
    }




    
}
