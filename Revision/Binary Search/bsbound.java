public class bsbound {

    // here we gonna learn about 2 types of bound in java 
    // lower bound and upper bound 
    public static int lowerbound(int[] arr , int n , int x){
        int low = 0 , high = n-1;
        // lower bound is arr[mid]>=x , SMALLEST INDEX or JUST BIGGER NUMBER IF NO. IS NOT THERE 
        int ans = n ; 

        while(low<=high){
            int mid = (low + high)/2;

            if(arr[mid] >= x){
                ans  = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int upperbound(int[] arr , int n , int x){
        int low = 0 , high = n-1;

        // upperbound is the SMALLEST index where the value at that indx is GREATER than the given KEY
        int ans = n ; 

        while(low<=high){
            int mid = (low + high)/2;

            if(arr[mid] > x){
                ans  = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
       int[] arr = {2,3,4,5,7,8};
       
       int ans = upperbound(arr, 6, 90);
       System.out.println(ans);
    }
    

}
