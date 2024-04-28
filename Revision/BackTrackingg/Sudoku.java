import java.util.*;

public class Sudoku {


    public void solveSudoku(ArrayList<ArrayList<Character>> a){

        solve(a,0,0);
        return;
    }

    public boolean solve(ArrayList<ArrayList<Character>> S,int row, int col){

        // solution case 
        if(row>=9)return true;// when row fill out we are done 

        if(col>=9)return solve(S,row+1,0);// when col fill out move to next row 
        
        if(!S.get(row).get(col).equals('.')){
            return solve(S,row,col+1);// when there is not empty space then move to next space
        }


// if you are entering this loop that mean that is a empty space

// choices section 

        for(char val = '1'; val <= '9' ; val++){

            if(isValid(S, row, col ,val)){
                S.get(row).set(col,val);

                if(solve(S,row,col+1)){
                    return true;
                }

                S.get(row).set(col,'.');// if wanna go back the natural state


            }
        }

        return false;

    }
    

    public boolean isValid(ArrayList<ArrayList<Character>>S,int row,int col,char val){

         
        // check in the all the col that value exists or not 
        for(int i = 0;i<9;i++){
            if(S.get(row).get(i).equals( val)){
                return false;
            }
        }


        // check in the all row that value exists or not 

        for(int i = 0;i<9;i++){
            if(S.get(i).get(col) .equals( val)){
                return false;
            }
        }

        // now we have to check the block 

        row = (row/3)*3;
        col = (col/3)*3;

        for(int i = row; i < row+3;i++){

            for(int j = col; j<col+3;j++){

                if(S.get(i).get(j) .equals( val)){
                    return false;
                }
            }
        }
        return true;



    }
}
