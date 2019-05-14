/**
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1

  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /**
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
        if (n == 0){ //decision between base case 0 and recursive case
            return 0; //solution to base case
        }
        else if (n == 0 || n == 1){ //decision between base case 1 and recursive case
            return 1;
        }
        else{ //recursive solution
            return (fib_recurrence(n-1)//one recursive abstraction
            + // combining
            fib_recurrence(n-2)//another recursive abstraction rather than leftovers
            );
        }

    }
     /* These are class methods because...
     they do not need to access any instance variables, they are not
     "getter" or "setter" methods, they merely calculate based on a param
    */


    /**
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
        int oneNum = 0;
        int anotherNum = 1;
        int temp = oneNum;
        for (counter = 0; counter < n ; counter++){
            oneNum = anotherNum;
            anotherNum += temp;
            temp = oneNum;
        }
        return oneNum;
    }
    /* Time complexity:
       Consider the size of the problem to be ...
       n
       As the proxy for the time required, count...
       the number of iterations of the loop
       Then cost of the the recurrence algorithm
       grows linearly
       as the size of the problem increases,
       because the for loop is repeated n times.
     */


    /**
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
        double phi = (1.0 + (Math.sqrt(5.0)))/2.0;
        double psi = (1.0 - (Math.sqrt(5.0)))/2.0;
        return ((Math.pow(phi,n))-(Math.pow(psi,n)))/(Math.sqrt(5.0));
    }
    /* Time complexity:
       Consider the size of the problem to be ...
       num
       As the proxy for the time required, count...
       the number of calculations in the method
       Then cost of the the recurrence algorithm
       does not grow
       as the size of the problem increases,
       because
       there is a constant procedere that does not
       require calls to any other method or function.
     */
}
