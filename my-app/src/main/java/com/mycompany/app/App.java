package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	int a1 = 10;
        int b1 = 10;
        System.out.println(a1==b1);

        Integer a2 = new Integer(10);
        Integer b2 = new Integer(10);
        System.out.println(a2 == b2);
        System.out.println(a2.equals(b2));
        System.out.println( "Hello World!" );
    }
}
