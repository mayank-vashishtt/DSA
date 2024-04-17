import java.util.*;
public class arrswap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int i = 0;

        while(i<n){
            arr[i] = sc.nextInt();

            ++i;
        }

        int prev = Integer.MIN_VALUE;
        int ans1 = Integer.MIN_VALUE;
        int ans2 = Integer.MIN_VALUE;

         
        if(arr[0]>arr[1]){
            ans1 = arr[0];
        }
        prev = arr[0];
        for(i=1; i<n ; i++){
            
            if(prev != Integer.MIN_VALUE){
                if(arr[i] < prev){
                    if(ans1 == Integer.MIN_VALUE){
                        ans1 = prev;
                        ans2 = arr[i];
                    }
                    else{
                        ans2 = arr[i];
                    }
                }
            }
            prev = arr[i];
        }

        System.out.print(ans1 + " " + ans2);
        
    }
    
}
