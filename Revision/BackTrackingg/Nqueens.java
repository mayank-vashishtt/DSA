import java.util.*;

// you are given N*N matrix, print all valid placement of N queens such that 
// no queen can kill other queen : 

// let take this question and move hard ahead 
// first of all, if 2  queen belong to same row, col , diag they will kill 


// paramter  : int mat[N][N], i - row number , j - col number , N -- outside geek 

// choices  : N choices ofc

// return type: void, as we will print right?









public class Nqueens {




    public static ArrayList<ArrayList<String>> solveNQueens(int n){
       
        ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();
        char[][] board = new char[n][n];

        for(int i =0 ; i <n ; i++){
            for(int j =0 ; j <n ; j++ ){
                board[i][j] = '.';
            } 
        }

        // so leftrow is something that will tell us if that row have a queen or not 
        // upperdiagonal is diagonal who have a diagonally one magial number that is board.length -1 + col -row
        // same, lowediagonal is diag who have a magic number that is row + col 

        int leftRow[] = new int[n];
        int upperDiagonal[] = new int[2*n -1];
        int lowerDiagonal[] = new int[2*n -1];

        // we have taken col in solve function 

        solve(0,board, ans, leftRow, lowerDiagonal, upperDiagonal);
        return ans;

    }

        static void solve(int col, char[][] board, ArrayList<ArrayList<String>> res, int leftRow[], int lowerDiagonal[], int upperDiagonal[]){

            // solution condition 
            if(col >= board.length){
                res.add(construct(board));
                return;
            }


            int n = board.length;
            for(int row = 0 ; row<n ; row++){
                if(leftRow[row] == 0 && upperDiagonal[n-1+ col - row] == 0 && lowerDiagonal[row+col] == 0){
                    board[row][col] = 'Q';
                    leftRow[row] = 1;
                    lowerDiagonal[row + col] = 1;
                    upperDiagonal[board.length - 1 + col - row] = 1;

                    solve(col + 1, board, res, leftRow, lowerDiagonal, upperDiagonal);
                    board[row][col] = '.';
                    leftRow[row] = 0;
                    lowerDiagonal[row + col] = 0;
                    upperDiagonal[board.length - 1 + col - row] = 0;
                }

            }
            
        }


            static ArrayList < String > construct(char[][] board) {
                ArrayList < String > res = new ArrayList < String > ();
                for (int i = 0; i < board.length; i++) {
                    String s = new String(board[i]);
                    res.add(s);
                }
                return res;
            }


    public static void main(String[] args) {

        int n = 4;
        ArrayList<ArrayList<String>> ans = solveNQueens(n);
        

        for(int i =0 ; i<n ; i++){
            for(int j =0 ; j<n ; j++){
                System.out.println(ans.get(i).get(j));
            }
            System.out.println();
        }
    }


    
}
