package org.example;

import jdk.jshell.execution.Util;

import java.sql.Array;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            //random.nextInt(101); //тут возможно я сгернерировал 100 чисел, а дальше не знаю что, но видимо, как только я получу 100 чисел, я смогу в случайной последовательности некоторые записать в массив
            array[i] = random.nextInt(101);
            System.out.println("Массив: " + array[i]);
        }

        int min = 0;
        int max = 100;
        int num = 0;

        int start = 0;
        int finish = 100;

        for (int i = 0; i < array.length; i++) {
            if (min<array[i]) {
                min = array[i];
            }
        }
        System.out.println("Максимальное число: " + min);

        //int max = 100;

        for (int i = 0; i < array.length; i++) {
            if (max>array[i]) {
                max = array[i];
            }
        }
        System.out.println("Минимальное число:" + max);

        for (int i = 0; i < array.length; i++) {

            num += array[i];
        }
        System.out.println("Сумма: " + num);

        for (int i = 0; i < array.length; i++) {
            if (start > array[i]) {
                start = array[i];
            }
            if (finish < array[i]) {
                finish = array[i];
            }
            //и как то так я хотел дойти до середины массива, удаляя числа по краям, но вспомнил, что длинна массива не меняется
        }
        System.out.println( "среднее: " + num/10);


        int minimum = Arrays.stream(array).min().getAsInt();
        int maximum = Arrays.stream(array).max().getAsInt();
        int sumSum = Arrays.stream(array).sum();
        double average = Arrays.stream(array).average().getAsDouble();

        System.out.println("Минимальное" + minimum);
        System.out.println("Максимальное" + maximum);
        System.out.println("Сумма" + sumSum);
        System.out.println("среднее" + average);

    //arab();
        nextIssue();
    }

    public static void arab() {
        int[] arr = new int[15];

        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        List<Integer> noList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
            System.out.println("SECOND ARRAY: " + arr[i]);

            if (arr[i] % 2 == 0) {
                list.add(arr[i]);
                        } else {
                noList.add(arr[i]);
            }
        }

        System.out.println("Четные: " + list);
        System.out.println("Нечетные: " + noList);
    }

    public static void nextIssue() {
        int[] array = new int[20];
        Random random = new Random();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1; //random.nextInt(10) генерирует числа от 0 до 9, Добавляя + 1, мы сдвигаем диапазон на 1 до 10
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            }  else {
                map.put(array[i], 1);
            }
        }
        System.out.println("Массив" + Arrays.toString(array));
        System.out.println("Сколько раз встречается каждое число: " + map);

    }

}







