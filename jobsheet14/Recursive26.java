package jobsheet14;

public class Recursive26 {
    static int factorialRecursive (int n){
if(n==1)
return 1;
else
return n*factorialRecursive(n-1);
    }
    static int factorialIterative (int n) {
        int factorial = 1;
        for(int i=n;1>=i; i--){
        factorial =factorial*i;
        }
        return factorial;
    }
}
