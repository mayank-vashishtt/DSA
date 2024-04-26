import java.util.*;


public class MaxArraySize {
    // Function to calculate GCD of two numbers
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

class lec2{

// given an arr of the number , you can pick any two numbers.
// add the absolute diff to the array if not already present 
// determine the maximum size of the array we can achieve 


// WRONG APPROACH
// public static int maxArrsize(int[] arr){
//     Set<Integer> absdiff = new HashSet<>();

//     for(int i =0 ; i<arr.length ; i++){
//         absdiff.add(arr[i]);
//     }
    
//     for(int i=0; i<arr.length; i++){
//         for(int j= i+1;j<arr.length;j++){
//             int absdif = Math.abs(arr[i]-arr[j]);
//             absdiff.add(absdif);

//         }
//     }
//     return absdiff.size();
// }



    // Function to find maximum array size
    public static int maxArraySize(int[] arr) {
        HashSet<Integer> gcdSet = new HashSet<>();

        // Iterate through all pairs of numbers in the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int currentGCD = gcd(arr[i], arr[j]);
                gcdSet.add(currentGCD);
            }
        }

        // Return the size of the HashSet, which represents the maximum size of the array we can achieve
        return gcdSet.size();
    }





    public static void main(String[] args) {

     
    }
}}