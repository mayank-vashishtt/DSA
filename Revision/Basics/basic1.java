// import java.util.*;
class basic1{

    // public void rotate(int[] nums, int k) {
    //     int n = nums.length;
    //     k = k % n; // Adjust k in case it's larger than the array length
        
    //     reverse(nums, 0, n - 1); // Reverse the entire array
    //     reverse(nums, 0, k - 1); // Reverse the first k elements
    //     reverse(nums, k, n - 1); // Reverse the remaining elements
        
    //     // Print the rotated array
    //     for (int i = 0; i < n; i++) {
    //         System.out.print(nums[i] + " ");
    //     }
    // }

    //     // Helper function to reverse the elements in the array from index start to index end
    // private void reverse(int[] nums, int start, int end) {
    //     while (start < end) {
    //         int temp = nums[start];
    //         nums[start] = nums[end];
    //         nums[end] = temp;
    //         start++;
    //         end--;
    //     }
    // }

    public static void main(String[] args) {
        // int[] arr = {1,3,2,5,6};
        // Arrays.sort(arr);
        // System.out.println(arr[1]);
        // printing arr will give its address
        // Arrays.sort -- TC(nlogn)
        // to do it in least TC, we have to take a max variable
        // that will have TC of O(N)
        // remember Integer.MAX_VALUE

        // check if array is sorted and rotated
        // here at first we will take the rotated index
        // then check from rotated index to the last is it sorted 
        // then chek if last element is greater than first so return false

        // check how many original elements are there in arr
        // we uesd 2 pointers 

        // shifting an array towards left or right

        // move all zeroes to the end in the array

        
    }
}