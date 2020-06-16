package org.fasttrackit;

public class App 
{
    public static void main( String[] args ) {
        Methods methodsclass = new Methods();
        //numere intregi int
        System.out.println(methodsclass.sum(10 ,5));

        System.out.println(methodsclass.difencence(10,5));

        System.out.println(methodsclass.multiplication(10, 5));

        System.out.println(methodsclass.division(10,5));

// numere zecimale double
        System.out.println(methodsclass.sum2(7.5, 2.3));

        System.out.println(methodsclass.difencence2(7.5, 4.1));

        System.out.println(methodsclass.multiplication2(2.3, 3.3));

        System.out.println(methodsclass.division2(8.4, 2.2));
    }
}
