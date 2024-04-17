import java.util.*;
class lec1{



    // concept of lvl ,choice, check and move
    // lvl -- way to iterate over all solution space efficiently
    // choice -- for reach lvl, what move we can make or not to go to nxt lvl
    // check -- for each choice, check if the curr partial solution is valid or not
    // move -- if its valid choice, evalute that branch


    // no of ways to reach Nth stair
    // jump and steps 
    // use lvl, choice ,check and move
    // lvl -- current stairs
    // choice -- 1/2/3 steps
    // check -- is it a valid move ; here is he will be in [1 - N]
    // move -- shifting a person from here to new problem


    // no of ways to place N queens and no queen attacking each other
    // lvl -- each cell 
    // choice -- place or not 
    // check -- can place or not acc to conditions 
    // move -- place the queen ; move to next lvl

 
    // dp workshop ;  n problems -- one take t time and s times skill up 
    // you have X time and you can solve k problems
    // find the max skill gain you can get 
    // lvl -- item ; take it in subset or dont take 
    // choice -- take it ot not 
    // check -- time or count check 
    // move -- take or not take the item 

    // public static int rec(int lvl){
    //     for(all choices){
    //         if(check(valid choice)){
    //             move(choice)
    //         }
    //     }
    // }


    static int n =10;
    public static int noOfWays(int level){
        // lvl -- stair where i am 
        // QUESTION -- number of ways to reach by taking these many stairs(1,2,3) to n

        // pruning 
        if(level > n){
            return 0;
        }
 
        // base case
        if(level == n){
            return 1;
        }

        int ans =0;
        for(int step = 1 ; step <=3 ; step++){
            if(level+step <= n){
                // check is it valid move
                int ways = noOfWays(level+step);
                ans += ways;

            }
        }
        return ans;
    }


        
    static int[] queen = new int[20]; // queen of i will tell me where is my queen in row i 
    public static boolean check(int row , int col){
        for(int i=0 ; i<row ; i++){
            int prow = i; 
            int pcol = queen[i];

            if(pcol == col || Math.abs(col-pcol) == Math.abs(row-prow)){
                return false;
            }
        }
        return true;
    }


    public static int noOfQueens(int lvl){
        // lvl is row in which we are facing a queen 
       
        // pruning 


        // base case
        if(lvl == n) return 1;


        // compute 
        int ans =0;

        for(int col =0 ; col< n ; col++){
            if(check(lvl,col)){
                // placed the queen 
                queen[lvl] = col;
                ans += noOfQueens( lvl + 1);
                // revert placing the queen
                queen[lvl] = -1;


            }
        }
        // return
        return ans; 
    }

    
    public static 

    







      

    public static void main(String[] args) {
        int ans = noOfWays(9);
        System.out.println(ans);

        // code stairs problem

        
    }






}