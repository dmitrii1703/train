package org.example;

public class TrainException {
       static int a = 10;
       static int b = 0;
       static int c;


    public  static void arithmetic() {
        try {
            c = a/b;
            System.out.println("result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Халеварная тема, но может быть infinity or - infinity");
        }

    }

    public static void nullPoint() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("noll, нет инициализации объекта");
        }
    }

    public static void manyException() {
        try {
            int x = Integer.parseInt("");
            System.out.println(x);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Ошибка преобразования числа или null");
        }
    }

    public static void ageValidation(int age) throws IllegalAccessException {
        if (age < 18) {
            throw new IllegalAccessException("Малой");
        }
            System.out.println("jr");
    }

    public static void main(String[] args) {
        try {
            ageValidation(10);
        } catch (IllegalAccessException e) {
            System.out.println("Mistake " + e.getMessage());
        }

        arithmetic();
        nullPoint();
        manyException();
    }


}
