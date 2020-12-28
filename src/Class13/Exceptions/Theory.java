package Class13.Exceptions;

import java.io.File;
import java.io.FileInputStream;

public class Theory {

    /**
     * Exceptions: Unhandled situations
     *
     * Types:
     *  1. Run-time Exception: ArrayIndexOutOfBoundException, StringIndexOutOfBoundsException
     *  2. Compile-time Exception: InterruptedException, FileNotFoundException
     *
     *  How to handled an exception:
     *  1. use "throws" keyword
     *  2. use try-catch block
     *
     *  the code which can throw exception, we put in try block.
     *  and the exception will be caught in respective catch block.
     *
     * Exception Class - Parent Class of all exceptions
     *
     *
     * How to handle exception: using try-catch block
     *
     * try {
     *      // code which can throw exception
     * } catch(Exception-1) {     // one catch block should catch only one exception
     *      // code to execute in case of exception
     * } catch (Exception-2) {
     *      // code to execute in case of exception
     * }
     *
     * finally:
     *  It's a block associated with try-catch block.
     *  Code in the block will always execute irrespective of exception.
     *  --> There can be only ONE finally block with every try-catch block.
     *
     *  finally vs final
     *  finally: it block related to try-catch.
     *  Code in the block will always execute irrespective of exception.
     *
     *  final: it's a keyword to create constant variable.
     *
     */
    int b=10;

    public static void main(String[] args) {

        try {
            System.out.println("hello");

            int[] arr = {11,  22, 33, 44, 55};

            Thread.sleep(5000);         // InterruptedException

            System.out.println(arr[4]);     // 55

            System.out.println(arr[2]);     // ArrayIndexOutOfBoundException

            System.out.println(arr[2]);     //

            System.out.println("Again");

            System.out.println(1/0);        // ArithmeticException

        } catch (InterruptedException var) {
            // one catch block should catch only one exception
            System.out.println("OMG interrupted exception occurs");
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("ArrayIndexOutOfBounds exception occurs");
            e2.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
            e.printStackTrace();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e1) {
                System.out.println("Interrupted exception from nested try-catch");
                e1.printStackTrace();
            }
        }


    }

}
