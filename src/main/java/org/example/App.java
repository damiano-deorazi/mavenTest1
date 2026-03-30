package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Example myExample = new Example();
        myExample.print();
        int num = myExample.makeItDouble(3);
        System.out.print("My double result: " + num);
        num = myExample.makeItTriple(3);
        System.out.print("My triple result:" + num);
    }
}
