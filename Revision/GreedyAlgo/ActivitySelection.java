package Revision.GreedyAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class meeting{
    int start;
    int end;
    int pos;

    meeting(int start, int end , int pos){
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}

public class ActivitySelection {

    class meetingComparator implements Comparator<meeting>{

    
    public int compare(meeting o1, meeting o2){
        if(o1.end < o2.end){
            return -1;
        }
        else if (o1.end > o2.end)
            return 1;

        else if(o1.pos < o2.pos)
            return -1;
            
        return 1; 

    }
}


public class Solution {
    public int solve(int[] A, int[] B) {
        ArrayList<meeting> meet  = new ArrayList<>();

        for(int i = 0 ; i<A.length ; i++){
            meet.add(new meeting(A[i], B[i], i+1));
        }

        meetingComparator mc = new meetingComparator();
        Collections.sort(meet,mc);

        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(meet.get(0).pos);

        int limit = meet.get(0).end; 
        
        for(int i = 1; i<A.length; i++) {
            
            if(meet.get(i).start >= limit) {
                limit = meet.get(i).end; 
                answer.add(meet.get(i).pos);
            }
        }
        
        return answer.size();

    }
}
}
    
