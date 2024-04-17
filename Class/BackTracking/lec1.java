public class lec1 {
    // believe in a PROCESS


    // google [modulus question]
    // given an arr representing a number A and another number N. Return A%N
    // given an arr of 1 2 3 8 9 
    // where N = 100 and constraints are A size <= 10^5 , 0 <= A[i] <=, 1<=N<=10^9
    // 123 = 123 % 10 
    // ((1%100 * 100%100)%100 +(2*100*10%100)%100 + ()%100 )%100
    // even break those 100s into parts that is in muiltplication 

    // GCD(a,b)
    // gcd(12,16) == 4
    // gcd(50,10) == 10
    // gcd(27,49) == 1 ... they share no common factor and are co primes number 
    // gcd(12,1) == 1 ... any number with 1 is 1 , any number is co primes with one
    // gcd(12,0) == 12
    // gcd(-12,0) == 12

    // gcd(a,b,c) == gcd(gcd(a,b),c)  ... order doesnt matter 

    // gcd of arr??
    // ans  = 0 ; then ans = gcd(ans, A[i]);

    // gcd ka jadu 
    // gcd(12,18) => gcd(12,6) => gcd(6,6) => gcd(6,0) == 6

    // check which is greatest
    // if b ==0 ret a  
    // ret gcd(b, a-b)


    // now the best way 
    // gcd(a,b) = gcd(b,a%b) =      TC : O(log(n)
    // check which is greatest
    // if b ==0 ret a  
    // ret gcd(b, a%b)

    // check an  arr, return true id there is subarr with gcd  = 1 
    

    
 




    public static void main(String[] args) {
        
    }
}
