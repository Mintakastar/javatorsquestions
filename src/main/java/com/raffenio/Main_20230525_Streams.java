package com.raffenio;

import java.util.stream.DoubleStream;

/**+
 * https://web.yammer.com/main/org/epam.com/threads/eyJfdHlwZSI6IlRocmVhZCIsImlkIjoiMjI4MjcwMjU3NDQ4NTUwNCJ9
 */
public class Main_20230525_Streams {
    /**
     * Today's question
     * Topic: Streams
     * What is the result of the following snippet code?
     *
     * var s = DoubleStream.of(1.2, 2.4);
     * s.peek(System.out::println).filter(x -> x > 2).count();
     *
     * A. 1
     * B. 2
     * C. 2.4
     * D. 1.2 and 2.4
     * E. There is no output.
     * F. The code does not compile.  ---> Answer?
     * G. An exception is thrown.
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("\nQuestion example, does not compile, but was edited to compile.");
        //var s = DoubleStream.of(1.2, 2.4);  DOES NOT COMPILE
        /*var*/DoubleStream s = DoubleStream.of(1.2, 2.4); //works
        s.peek(System.out::println).filter(x -> x > 2).count();

        /*
        OUTPUT:
        ----------------
        1.2
        2.4
        ----------------
        */

        System.out.println("\nSecond example");
        DoubleStream s2 = DoubleStream.of(1.2, 2.4); //works
        s2.peek(System.out::println).filter(x -> x > 2).peek(System.out::println).count();
        /*-------------
        Second example
        1.2
        2.4
        2.4
        --------------*/



        System.out.println("\nThird example");
        DoubleStream s3 = DoubleStream.of(1.2, 2.4); //works
        s3.filter(x -> x > 2).peek(System.out::println).count();
        /*-------------
        Third example
        2.4
        --------------*/

        //Seems that peek let know loop the values which the filter has in that moment, before and after filtering.
        //seems good way to debug scenarios

    }
}