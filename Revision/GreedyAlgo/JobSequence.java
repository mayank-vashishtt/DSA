package Revision.GreedyAlgo;

import java.util.Arrays;

class Job {
    int deadline, profit;
    
    Job(int y, int z) {
        this.deadline = y;
        this.profit = z;
    }
}



public class JobSequence {

     public int solve(int[] A, int[] B) {
        int[] deadlines = A;
        int[] profits = B;
        int n = deadlines.length;
        Job[] arr = new Job[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Job(deadlines[i], profits[i]);
        }


        Arrays.sort(arr, (a, b) -> (b.profit - a.profit));

        int maxi = 0; // maxi will have the last deadline 
        
        for (int i = 0; i < n; i++) {
            if (arr[i].deadline > maxi) {
                maxi = arr[i].deadline;
            }
        }

        // checkedd

        int result[] = new int[maxi + 1];
        // we are not using 0 indx of the result 

        for (int i = 1; i <= maxi; i++) {
            result[i] = -1;
        }

        int countJobs = 0, jobProfit = 0; 

        for (int i = 0; i < n; i++) {
            for (int j = arr[i].deadline; j > 0; j--) {
                // Free slot found 
                if (result[j] == -1) {
                    result[j] = i;
                    countJobs++;
                    jobProfit += arr[i].profit;
                    break;
                }
            }
        }

        return jobProfit;
    }
    
}
