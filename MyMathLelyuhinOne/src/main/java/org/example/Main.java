package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println(MyMath.min(14, 12));

        System.out.println(MyMath.arcSin(1));
        System.out.println(MyMath.arcCos(1));
        System.out.println(MyMath.arcTan(1));
        System.out.println(MyMath.pow(5, 2));
        System.out.println(MyMath.sCircle(10));
        System.out.println(MyMath.pCircle(10));
        int test = 1;
        String VIvod = MyMath.identifyNumberType("12");
        System.out.println(VIvod);
    }
}