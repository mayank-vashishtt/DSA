package Revision.GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;


// this is a knapsack problem solved by knacksack algorithm 


class items{
    int values;
    int weight;
    public items(int values,int weight){
        this.values=values;
        this.weight=weight;
    }
}

public class ga {

    public int solve(int[] A, int[] B, int C) {

        items[] arr=new items[A.length];

        for(int i=0;i<A.length;i++){
            arr[i]=new items(A[i],B[i]);
        }

        Arrays.sort(arr,new Comparator<items>(){

            public int compare(items a,items b){

                double first=(double)a.values/a.weight;

                double second=(double)b.values/b.weight;
            
            if(first>second){
                return -1;
            }
            else if(first<second){
                return 1;
            }
            else{
                return 0;
            }

        }});

        double ans = 0;
        
        for(int i=0;i<arr.length;i++){

            double f=(double)arr[i].values/arr[i].weight;

            if(C>=arr[i].weight){
            ans=ans+(double)arr[i].values;
            C=C-arr[i].weight;
            
        }
        else{
            ans=ans+f*C;
            break;

        }

            
        }
         return (int)(ans*1000)/10; 

    }
    
}
