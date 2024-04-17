class bs1{

    // BINARY SEARCH
    // untill now we have learnt linear search algo
    // here for binary search arr should be sorted 
    //overflow cases -- intmax  + intmax -- cant be store in integer
    // either assign long long to low and high
    // or low + (high-low)/2


    public static int binarysearch(int[] arr,int target){

        int n = arr.length;
        // TC here is O(log(n))
        // find the index of the target 
        int high = n -1 ;
        int low = 0 ;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid] == target){return mid;}

            else if(arr[mid]> target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        int[] arr = {3,4,6,7,9,10,23,42};
        int ans = binarysearch(arr,11);
        System.out.println(ans);


        
    }

}