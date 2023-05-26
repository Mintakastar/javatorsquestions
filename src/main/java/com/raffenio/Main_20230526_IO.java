package com.raffenio;

import java.io.*;
import java.util.stream.DoubleStream;

/**+
 * https://web.yammer.com/main/org/epam.com/threads/eyJfdHlwZSI6IlRocmVhZCIsImlkIjoiMjI4NDAwNTE2NDQ0OTc5MiJ9
 */
public class Main_20230526_IO {
    /**
     Today's quesiton
     Topic: I/O

     Which classes will allow the following to compile? (Choose all that apply)

     var is = new BufferedInputStream(new FileInputStream("z.txt"));
     InputStream wrapper = new ______________ (is);
     try (wrapper) {}

     A. BufferedInputStream
     B. BufferedReader
     C. BufferedWriter
     D. FileInputStream
     E. ObjectInputStream
     F. ObjectPutputStream
     G. None of the above, as the first line does not compile.

     */
    public static void main(String[] args) {
        try {
            var is = new BufferedInputStream(new FileInputStream("z.txt"));  // Unhandled exception: java.io.FileNotFoundException

            //InputStream wrapper = new ______________ (is);  ???

            InputStream wrapper = new BufferedInputStream (is);  //A   -Compiles   (BUT ADDINT THE TRY CATCH TO RESOLVE LINE 1 ISSUE)
            //InputStream wrapper = new BufferedReader(is);  //B  COMPILATION ERROR: 'BufferedReader(java.io.Reader)' in 'java.io.BufferedReader' cannot be applied to '(java.io.BufferedInputStream)'
            //InputStream wrapper = new BufferedWriter(is);  //C COMPILATION ERROR: 'BufferedWriter(java.io.Writer)' in 'java.io.BufferedWriter' cannot be applied to '(java.io.BufferedInputStream)'
            //InputStream wrapper = new FileInputStream(is);  //D COMPILATION ERROR: Cannot resolve constructor 'FileInputStream(BufferedInputStream)'
            //InputStream wrapper = new ObjectInputStream(is);  //E COMPILATION ERROR: Unhandled exception: java.io.IOException  (ADDING CATCH SOLVES THE ISSUE)
            //InputStream wrapper = new ObjectOutputStream(is);  //F COMPILATION ERROR:  'ObjectOutputStream(java.io.OutputStream)' in 'java.io.ObjectOutputStream' cannot be applied to '(java.io.BufferedInputStream)'

            try (wrapper) {}catch (Exception e){}

        } catch (FileNotFoundException e){
            //log.error(e.getMessage(),e);
        } catch (IOException e){
            //log.error(e.getMessage(),e);
        }

    }


    /**
    MY ANSWER
     First line throws  "Unhandled exception: java.io.FileNotFoundException"
     so answer should be G

        G. None of the above, as the first line does not compile.

    ANSWER:
        TBA



    */
}