class back1{


    // Recursion 
    // when a function call itself, untill a specififed condn is met
    // stack overflow --- numerous calls due to recursion 
    // Base condn --- where the call will be end 

    // what is the backTracking 
    // backtracking is basically a sense of recursion that helps us to backtrack our code 
    
    // example 1:
    // assume there is a maze and give me how many solution of that maze is avaiable 

    // what we basically did here, can anyone out there till me guys ?
    // while generating we explored the all path possible right?  yes

    // if there was a blockage -- we returned back 
    // if we came outside we returned back 

    // example 2: 
    // given N, print all N digit number formed only by 1,2 in increasing order
    // sample: N =2  ;   1,2
    // 1 1 
    // 1 2 
    // 2 1
    // 2 2 

    // sample; N =3 ; 1,2
    //  1 1 1        0   1   2   3 
    //  1 1 2 
    //  1 2 1 
    //  1 2 2 
    //  2 1 1
    //  2 1 2 
    //  2 2 1 
    //  2 2 2 

    // okay, now tell us how to do backtraking? right ? 
    // see in backtracking there is few requirement 
    // if there is a function --- you should know  (PCR)
    // parameter --- int arr[N]
    // choices ---  2 {1,2}
    // returnType ---  void {print statement}

    // public static void PrintAll(int arr[], int i, int n){
    //     // step 1: solution 
    //     if(i == n){
    //         for(int m : arr){
    //             System.out.print(m);
    //         }
    //         System.out.println();
                
    //         // we have to return back 
    //         return; 
    //     }

    //     // IMP for analogy
    //     // return function send you to the next step of the last function call

    //     // step 2: choices
    //     arr[i] = 1; 
    //     PrintAll(arr, i+1, n);
    //     arr[i] =2;
    //     PrintAll(arr, i+1, n);
    //     return;
    // }
     
    public static void main(String[] args) {
        int n  = 2; 
        int[] arr = new int[n];
//        PrintAll(arr, 0, n);

        
    }

}