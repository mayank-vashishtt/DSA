import java.util.*;


// question is that 
//  you are given an array of size N 
// you have to return all possible permutation of that array 

public class Permutations {

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);

        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        B = permute(A);
        for(int i = 0; i<B.size(); i++){
            for(int j = 0; j<B.get(i).size(); j++){
                System.out.print(B.get(i).get(j)+" ");

            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {

        // the ans arraylist formation 
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // the curr mover , the needle mover 
        ArrayList<Integer>curr = new ArrayList<>();

        solve(A,ans,curr);
        return ans;
    }


    public static void solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> curr){
       

        // solution block 
        if(curr.size() == A.size()){
            ans.add(new ArrayList<>(curr));
            return;
        }

        // choices block 
        for(int i =0 ; i < A.size() ; i++){

            if(curr.contains(A.get(i))){
                continue;
            }

            curr.add(A.get(i));
            solve(A,ans,curr);

            curr.remove(curr.size()-1);

        }

        return;

    
    }





    


}
