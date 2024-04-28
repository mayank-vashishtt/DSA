//import java.util.ArrayList;
//
//public class Solution {
//
//
//    // so basically from 1 we have to walk to 2 , and  on 0 we can walk and  -1 are the obstacles
//// we have to go through every 0
//
//
//
//    static int ans = 0;
//
//    public static int solve(ArrayList<ArrayList<Integer>> A) {
//
//        int countZeroes = 0;
//
//        int i_index = 0;
//
//        int j_index = 0;
//
//        for (int i = 0; i < A.size(); i++){
//
//            for(int j = 0; j < A.get(i).size(); j++){
//
//                if(A.get(i).get(j) == 0){
//                    countZeroes++;
//                }
//                if(A.get(i).get(j) == 1){
//                    i_index = i;
//                    j_index = j;
//                }
//            }
//        }
//        // from the above loop we see the number of zeroes and the starting point
//
//        findPath(A, countZeroes+1, i_index, j_index, 0);
//
//        return ans;
//    }
//
//
//
//    public static void findPath(ArrayList<ArrayList<Integer>> A, int countZeroes, int i, int j, int cnt){
//
//        if(A.get(i).get(j) == 2 && countZeroes == cnt){
//            ans++;
//            return;
//        }
//
//        if(A.get(i).get(j) == 2 && countZeroes != cnt){
//            return;
//        }
//
//
//        int originalValue = A.get(i).get(j);
//
//        A.get(i).set(j, -1);
//
//
//
//        if(isValid(A, i+1, j)){
//            findPath(A, countZeroes, i+1, j, cnt+1);
//        }
//
//        if(isValid(A, i-1, j)){
//            findPath(A, countZeroes, i-1, j, cnt+1);
//        }
//        if(isValid(A, i, j+1)){
//            findPath(A, countZeroes, i, j+1, cnt+1);
//        }
//        if(isValid(A, i, j-1)){
//            findPath(A, countZeroes, i, j-1, cnt+1);
//        }
//
//        A.get(i).set(j, originalValue);
//    }
//    public static boolean isValid(ArrayList<ArrayList<Integer>> A, int i, int j){
//
//        if(i < 0 || i >= A.size()) return false;
//
//        if(j < 0 || j >= A.get(i).size()) return false;
//
//        if(A.get(i).get(j) == -1) return false;
//
//        return true;
//    }
//
//    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
//        ArrayList<Integer> a =  new ArrayList<>();
//        a.add(1);
//        a.add(0);
//        a.add(0);
//        a.add(0);
//        A.add(a);
//        ArrayList<Integer> b =  new ArrayList<>();
//        b.add(0);
//        b.add(0);
//        b.add(0);
//        b.add(0);
//        A.add(b);
//        ArrayList<Integer> c =  new ArrayList<>();
//        c.add(0);
//        c.add(0);
//        c.add(2);
//        c.add(-1);
//        A.add(c);
//
//        System.out.println(solve(A));
//
//
//
//
//    }
//}
//
////import java.util.*;
////
////public class Solution {
////
////    ArrayList<ArrayList<Integer>> ans;
////
////    public void solve(int idx, ArrayList<Integer> cur, ArrayList<Integer> A) {
////        if (idx == A.size()) {
////            ans.add(new ArrayList<>(cur));
////            return;
////        }
////        solve(idx + 1, cur, A); // not take
////        int element = A.get(idx);
////        cur.add(element); // DO
////        solve(idx + 1, cur, A); // take
////        cur.remove(cur.size() - 1); // UNDO
////    }
////
////
////    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
////        Collections.sort(A);
////        ans = new ArrayList<>();
////        ArrayList<Integer> cur = new ArrayList<>();
////        solve(0, cur, A);
////        // sort the list of list
////        ans.sort((ArrayList<Integer> first, ArrayList<Integer> second) -> {
////            for (int i = 0; i < first.size() && i < second.size(); i++) {
////                if (first.get(i) < second.get(i))
////                    return -1;
////                if (first.get(i) > second.get(i))
////                    return 1;
////            }
////            return Integer.compare(first.size(), second.size());
////        });
////        return ans;
////    }
////
////    public static void main(String[] args) {
////
////        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 3, 2));
////
////        Solution solution = new Solution();
////        ArrayList<ArrayList<Integer>> ans = solution.subsets(A);
////
////        for (ArrayList<Integer> subset : ans) {
////            for (int num : subset) {
////                System.out.print(num + " ");
////            }
////            System.out.println();
////        }
////    }
////}
