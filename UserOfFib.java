/**
  test Fib methods, in response to command line input

  java UserOfFib @method @index
  where @method is one of
      recurrence
      grade8
      Binet
   and @index is the index of the desired Fibonacci number

   For example
          java UserOfFib recurrence 7
    should produce 13
 */

public class UserOfFib {
    public static void main(String[] commandLine) {

        String method = commandLine[0];
        int seek = Integer.valueOf( commandLine[1]);

        System.out.println( "using method " + method
                          + " seeking F_" + seek);

        if(  method.equals( "recurrence"))
            System.out.println( "Fib " + Fib.fib_recurrence( seek));
            /*
              Kyras-Air:6E_Fib kyra.gunluk$ java UserOfFib recurrence 0
              using method recurrence seeking F_0
              Fib 0
              Kyras-Air:6E_Fib kyra.gunluk$ java UserOfFib recurrence 1
              using method recurrence seeking F_1
              Fib 1
              Kyras-Air:6E_Fib kyra.gunluk$ java UserOfFib recurrence 2
              using method recurrence seeking F_2
              Fib 1
              Kyras-Air:6E_Fib kyra.gunluk$ java UserOfFib recurrence 7
              using method recurrence seeking F_7
              Fib 13
            */
            //fib 45 took 8.43 seconds. Between 40 and 50, run time
            //increases greatly.
        else if( method.equals( "grade8" ))
            System.out.println( "Fib " + Fib.fib_grade8( seek));
            /*
              Kyras-Air:6E_Fib kyra.gunluk$ java UserOfFib grade8 0
              using method grade8 seeking F_0
              Fib 0
              Kyras-Air:6E_Fib kyra.gunluk$ java UserOfFib grade8 1
              using method grade8 seeking F_1
              Fib 1
              Kyras-Air:6E_Fib kyra.gunluk$ java UserOfFib grade8 2
              using method grade8 seeking F_2
              Fib 1
              Kyras-Air:6E_Fib kyra.gunluk$ java UserOfFib grade8 7
              using method grade8 seeking F_7
              Fib 13
            */
        else if( method.equals( "Binet"))
            System.out.println( "Fib " + Fib.fib_Binet( seek));
            /*
              Kyras-Air:6E_Fib kyra.gunluk$ java UserOfFib Binet 0
              using method Binet seeking F_0
              Fib 0.0
              Kyras-Air:6E_Fib kyra.gunluk$ java UserOfFib Binet 1
              using method Binet seeking F_1
              Fib 1.0
              Kyras-Air:6E_Fib kyra.gunluk$ java UserOfFib Binet 2
              using method Binet seeking F_2
              Fib 1.0
              Kyras-Air:6E_Fib kyra.gunluk$ java UserOfFib Binet 7
              using method Binet seeking F_7
              Fib 13.000000000000002
            */
        else System.out.println(  "invalid method on the command line");
    }
}
