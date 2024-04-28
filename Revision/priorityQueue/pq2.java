package Revision.priorityQueue;
import java.util.*;

public class pq2 {

    // kth smalllest element in a sorted matrix 
    // (Comparator.comparingInt(a -> a.val))

    public int solve(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;

        PriorityQueue<Element> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));

        for (int i = 0; i < n; i++) {
            minHeap.offer(new Element(A[i][0], i, 0));
        }

        for (int i = 0; i < B - 1; i++) {
            Element curr = minHeap.poll();
            int row = curr.row;
            int col = curr.col;

            if (col < m - 1) {
                minHeap.offer(new Element(A[row][col + 1], row, col + 1));
            }
        }
        return minHeap.peek().val;
    }

  
}

class Element {
    int val;
    int row;
    int col;

    Element(int val, int row, int col) {
        this.val = val;
        this.row = row;
        this.col = col;
    }



    
}
