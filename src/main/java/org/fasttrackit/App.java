package org.fasttrackit;

public class App {
    public static void main(String[] args) {
        Methods methods = new Methods();

        int number1 = 10;
        int number2 = 5;
        double number1d = 7.5;
        double number2d = 3.4;


        //numere intregi int
        System.out.println(methods.sum(number1, number2));
        System.out.println(methods.sum(7.5, 3.4));


        System.out.println(methods.difencence(number1, number2));
        System.out.println(methods.difencence(7.5, 3.4));

        System.out.println(methods.multiplication(number1, number2));
        System.out.println(methods.multiplication(7.5, 3.4));

        System.out.println(methods.division(number1, number2));
        System.out.println(methods.division(7.5, 3.4));




// numere zecimale double
//        System.out.println(methodsclass.sum2(7.5, 2.3));
//
//        System.out.println(methodsclass.difencence2(7.5, ));
//
//        System.out.println(methodsclass.multiplication2(2.3, 3.3));
//
//        System.out.println(methodsclass.division2(8.4, 2.2));

    }
}


