package Revision.priorityQueue;
import java.util.*;

// we are starting with priority queues 
// basically priority queue is a self sorting database 


// PriorityQueue<Integer> pq = new PriorityQueue<>(); syntax for ascending order

/* 
 * Function	Description
add(E e) or offer(E e) ---	Inserts the specified element into the priority queue.
peek()	--- Retrieves, but does not remove, the head of the queue, or returns null if the queue is empty.
poll() --- 	Retrieves and removes the head of the queue, or returns null if the queue is empty.
remove(Object o) ---	Removes a single instance of the specified element from this queue, if it is present.
contains(Object o) ---	Returns true if this queue contains the specified element.
size() ---	Returns the number of elements in the queue.
isEmpty() --- Returns true if the queue contains no elements.
clear() ---	Removes all of the elements from this priority queue.
toArray() ---	Returns an array containing all of the elements in this queue.
iterator()	--- Returns an iterator over the elements in this queue.
 */

//  the concept of the minheap and maxheap 
//  k places apart -- the bubble line

public class pq1 {

    public int solve (int [] A ){

        // sample question : 
// you are given an  arr A , which have cost and you have to find the min cost 
// 1 2 3 4 5 
// 1+2  = 3   3 3 4 5
// 3+3  = 6   4 5 6 
// 4 + 5=9    6 9 
// 6+9 = 15   
//  now , 3 +6 +9 +15

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int cost =0 ;

        for(int x: A){
            pq.offer(x);
        }

        while(pq.size() != 1){

            int l1 = pq.poll();
            int l2 = pq.poll();

            cost += l1 + l2;

            pq.offer(l1+l2);

        }

        return cost;

    }


    // question 1:
//  N people having different priorities are standing in a queue 
// queue have a property
// that each person is standing at most B places away from its position in the sorted queue
// task is to sort the queue in the increasing order of priority 
//  TC: O(NlogB)

    public int[] solve(int[] A, int B){

        int n = A.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i =0  ; i <= B; i++){
            minHeap.offer(A[i]);
        }
        // here first we added the B elements in the minheap and made them sychronise 
    


        int index =  0;
        for(int i = B+1 ; i<n; i++){
            A[index++] = minHeap.poll();
            // here we poll out the smallest Bth element in the arr for the result 

            minHeap.offer(A[i]);
            //  and added another one 


        }

        while (!minHeap.isEmpty()) {
            // now after this process the minheap have some size, then we transferred it 
            
            A[index++] = minHeap.poll();
        }

        return A;


        




    }









    public static void main(String[] args) {
        
    }

    
}
