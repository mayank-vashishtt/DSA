import java.util.*;

class TreeNode{
    int val;
    TreeNode left, right ;

    TreeNode(int val){
        this.val = val;
        this.left = this.right = null;
    }
}
class bt5{

    // constructing binary search tree from sorted array, mid == root
    // 3 4 7 8 9 10 11
    // even adding some value to bst, it destroys
    // we wanna have some self balancing binary search tree
    // SELF BALANCING BST
    // AVL Tree -- height will never go beyond log(N)
    // Red Black Tree -- both are SBST, TC of both : O(log(N))

    // Decoding HashMap & HashSet -- TC: O(1)
    // in terms of memory , idx of arr means n ties distance from arr[0]
    // thats why getting a element in arr -- TC -- O(1) and searching in arr -- TC -- O(N)
    // HashMap & HashSet; getting an element TC -- O(1) -- that's why
    // mod % ka jaadu  -- (0-100) ko (0-7) me fit krne ke liye {num%8}
    // HM and HS, you look at one bucket for searching, thats make it better than BS
    // HM and HS --- arrays of Linked List
    // as array have fixed no. of elements and (array and arraylist) need memory allocation in a line
    // no fermentated address will be allowed by arr, that;s why linked list 
    // best case ; TC -- O(M/N), when all bucket have same numbers ;  worst case ; TC -- O(N), when all goes in same bucket
    // height balanced search tree, in picture baby 
    // to overcome TC in HashMap , array(bucket) of height balanced tree(AVL Tree or Red Black Tree)
    // best case ; TC -- O(log(M/N)) ; worst case -- TC-- O(log(N))
    // Hashfxn -- is the fxn that gives the output in specific range (likewise signum fxn, sine fxn, trigo fxn)
    // mod fxn drawbacks -- also a Hashfxn, but not the best 
    // wanna reduce a no. of elements in a particular bucket 
    // 302 -- (2*P^0 + 0*P^1 + 3*10^2) % N -- P denotes prime no.
    // first convert it to random than take random
    // 1024(2**10) aprrox is 10**3
    // TC -- O(1)

    // building a HashMap(HW)

    //diff between HM in java 7 and after(java8) -- INTERVIEW QnA
    //that time HM were not optimal, they were using linked list then they started red black tree
    
    // TreeSet and TreeMap
    // they are simply self balancing tree, no arr involved 
    //  TC -- O(logN)

    // QUESTIONS 

    // given an arr which was sorted intially but two values got swapped
    // return the two values in TC -- O(N)

    // given a BST where two nodes have been swapped, you have to fix that tree  

    public static ArrayList<Integer> inorder(TreeNode root){
        ArrayList<Integer> in = new ArrayList<>();

        if (root == null) return in;
        
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);

        return in;
    }

        static TreeNode prev = null;
        static TreeNode ans1 = null;
        static TreeNode ans2 = null;

    public static void swapNode(TreeNode A){
        

        if(A == null){
            return;
        }

        swapNode(A.left);

        if(prev != null && prev.val> A.val){
            if(ans1 == null){
                ans1 = prev;
                ans2 = A;
            }
            else{
                ans2 = A;
            }
        }

        prev = A;

        swapNode(A.right);


    }

    public static void swap(TreeNode node1, TreeNode node2) {
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
    }

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];

        // for(int i =0 ; i<n ; i++){
        //     arr[i] = sc.nextInt();
        // }

        // ArrayList<Integer> ans = new ArrayList<>();

        // for(int i =0 ; i<n ; i++){
        //     if(arr[0] > arr[1]){
        //         ans.add(arr[0]);
        //     }
            
            
        //     if(arr[i]>arr[i+1] && arr[i]<arr[i-1]){
        //         ans.add(arr[i]);
        //     }

        //     if(arr[n-2] > arr[n-1]){
        //         ans.add(arr[n-1]);
        //     }


        // }

        // System.out.println(ans);


        // the correct code ; 
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int[] arr = new int[n];
        // int i = 0;

        // while(i<n){
        //     arr[i] = sc.nextInt();

        //     ++i;
        // }

        // int prev = Integer.MIN_VALUE;
        // int ans1 = Integer.MIN_VALUE;
        // int ans2 = Integer.MIN_VALUE;

         
        // for(i=0; i<n ; i++){
        //     if(prev != Integer.MIN_VALUE){
        //         if(arr[i] < prev){
        //             if(ans1 == Integer.MIN_VALUE){
        //                 ans1 = prev;
        //                 ans2 = arr[i];
        //             }
        //             else{
        //                 ans2 = arr[i];
        //             }
        //         }
        //     }
        //     prev = arr[i];
        // }

        // System.out.print(ans1 + " " + ans2);

        TreeNode root = new TreeNode(11);
        root.left = new TreeNode(6);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(21);
        root.right.right = new TreeNode(9);
        root.right.right.left = new TreeNode(18);

        inorder(root);
        
        swapNode(root);
        swap(ans1, ans2);
        System.out.println();
        inorder(root);

        
    }
}