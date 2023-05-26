package com.raffenio;

import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/**+
 * https://web.yammer.com/main/org/epam.com/threads/eyJfdHlwZSI6IlRocmVhZCIsImlkIjoiMjI4MTAzNTUwNTY0NzYxNiJ9
 */
public class Main_20230524_Lamdas_FunctionalInterfaces {
    /**
     Topic: Lambdas & Functional Interfaces

     Which is true of the following code?

     int length = 3;
     for (int i = 0; i < 3; i++) {
         if (i%2 == 0) {
            Supplier<Integer> supplier = () -> length;  // A
         S  ystem.out.println(supplier.get());                // B
         } else {
            int j = i;
            Supplier<Integer> supplier = () -> j;            // C
            System.out.println(supplier.get());                 // D
         }
     }

     A. The first compiler error is on line A.
     B. The first compiler error is on line B.
     C. The first compiler error is on line C.
     D. The first compiler error is on line D.
     E. The code compiles successfully.




     * @param args
     */
    public static void main(String[] args) {

        int length = 3;

        for (int i = 0; i < 3; i++) {
            if (i%2 == 0) {
                Supplier<Integer> supplier = () -> length;  // A
                System.out.println(supplier.get());         // B
            } else {
                int j = i;
                Supplier<Integer> supplier = () -> j;       // C
                System.out.println(supplier.get());         // D
            }

        }

    }
}


/*
     Salvador Perez   Yesterday at 4:34 PM
     Correct answer: E

     Lambdas are only allowed to reference final or effectively final variables.
     You can tell the variable j is effectively final because adding a final keyword before it wouldn't introduce
     a compiles error.
     Each time the else statement is executed, the variable is redeclared and goes out of scope.
     Therefore, it is not reassigned. Similarly, length is effectively final.
     That means that there are no compiler errors.

 */