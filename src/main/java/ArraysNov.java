import java.util.*;

public class ArraysNov {
    public static void main(String[] args) {
        issue10();
    }

    public static void issue1() {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            list.add(i);
            sum+=i;
        }
        System.out.println(list);
        System.out.println(sum);
    }

    public static void issue2() {
        List<String> list = new LinkedList<>();
        list.add("Moscow");
        list.add("Paris");
        list.add("London");
        list.add("Amserdam");
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }

    public static void issue3Arr() {
            List<Integer> arrayList = new ArrayList<>();

            long start = System.currentTimeMillis(); // замер начала
            for (int i = 0; i < 1_000_000; i++) {
                arrayList.add(i);
            }
            long end = System.currentTimeMillis(); // замер конца

            System.out.println("ArrayList add time: " + (end - start) + " ms");
        }


    public static void issue3Link() {
        List<Integer> linkedList = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(i);
        }
        long end = System.currentTimeMillis();

        System.out.println("LinkedList add time: " + (end - start) + " ms");
    }

    public static void issue4() {
        List<Integer> l = new  ArrayList<>();
        for (int i = 1; i < 11; i++) {
            l.add(i);
        }
        Collections.reverse(l);
        System.out.println(l);
    }

    public static void issue5() {
        List<String> list = new LinkedList<>(List.of("apple", "banana", "cherry", "pear", "melon"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фрукт");
        String s = scanner.nextLine();
        System.out.println(list.contains(s));
    }

    public static void issue6() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            list1.add(i);
            list2.add(i+5);
        }

        List<Integer> list3 = new ArrayList<>();
        for (int i = 1; i < list1.size() +1; i++) {
            list3.add(list1.get(i-1));
        }
        for (int i = 1; i < list2.size() +1; i++) {
            list3.add(list2.get(i-1));
        }
        System.out.println(list3);

        /**
         или List<Integer> list3 = new ArrayList<>(list1);
         list3.addAll(list2);
         */
    }

    public static void issue7() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 21; i++) {
            list.add(i);
        }
        System.out.println("Начальный список: " + list) ;
        int x = 1;
        for (int i = 1; i <= list.size() + x - 1 ; i++) {
            if (i % 3 == 0) {
                list.remove(i -x);
                x += 1;
            }
        }
        System.out.println("Список без чисел, которые делятся на 3: " + list);
    }

    public static void issue8() {
        List<String> list = new LinkedList<>(List.of("Запустить тесты", "Проверить отчёт" , "Отправить письмо"));
        for (int i = 0; i < list.size() +2; i++) {
            System.out.println("Очередь задач: " + list);
            System.out.println("Выполнена: " + list.getFirst());
            list.removeFirst();
            System.out.println("Осталось : " + list);
        }
    }

    public static void issue9() {
        List<String> list = new ArrayList<>(List.of("red", "green", "blue", "black", "white"));
        /**
         Создай ArrayList<String> с 5 словами (например, "red", "green", "blue", "black", "white").
         Выведи оригинальный список, потом перемешай его с помощью
         Collections.shuffle(list) и выведи новый порядок.

         Суть задачи не понятна. Выглядит как просто рандомное перемещение элементов

         public static void issue9() {
         List<String> list = new ArrayList<>(List.of("red", "green", "blue", "black", "white"));

         System.out.println("До перемешивания: " + list);
         Collections.shuffle(list);
         System.out.println("После перемешивания: " + list);
         }
         */
    }

    public static void issue10() {
//        List<Integer> arryList = new ArrayList<>();
//        List<Integer> linkedList = new LinkedList<>();
//
//        for (int i = 1; i <= 1_000_000; i++) {
//            arryList.add(i);
//        }
//
//        for (int i = 1; i <= 1_000_000; i++) {
//            linkedList.add(i + 2);
//        }
//
//        System.out.println(arryList.equals(linkedList));
//        int arrSum = 0;
//        int linkSum = 0;
//        for (int i = 1; i < arryList.size(); i++) {
//            arrSum += arryList.get(i);
//        }
//        System.out.println(arrSum);
//
//        for (int i = 1; i < linkedList.size(); i++) {
//            linkSum += linkedList.get(i);
//        }
//        System.out.println(arrSum);
//        System.out.println(linkSum);

            List<Integer> arrayList = new ArrayList<>();
            List<Integer> linkedList = new LinkedList<>();

            // --- Добавление ---
            long start = System.currentTimeMillis();
            for (int i = 0; i < 1_000_000; i++) {
                arrayList.add(i);
            }
            long arrayAddTime = System.currentTimeMillis() - start;

            start = System.currentTimeMillis();
            for (int i = 0; i < 1_000_000; i++) {
                linkedList.add(i);
            }
            long linkAddTime = System.currentTimeMillis() - start;

            // --- Суммирование через for-each ---
            long arraySumTime, linkSumTime;

            int arrSum = 0;
            start = System.currentTimeMillis();
            for (int num : arrayList) {
                arrSum += num;
            }
            arraySumTime = System.currentTimeMillis() - start;

            int linkSum = 0;
            start = System.currentTimeMillis();
            for (int num : linkedList) {
                linkSum += num;
            }
            linkSumTime = System.currentTimeMillis() - start;

            // --- Вывод ---
            System.out.println("ArrayList: добавление = " + arrayAddTime + " ms, суммирование = " + arraySumTime + " ms");
            System.out.println("LinkedList: добавление = " + linkAddTime + " ms, суммирование = " + linkSumTime + " ms");
        }

    }

/**
 // Создание
 ArrayList<String> list = new ArrayList<>();
 ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));

 // Основные методы
 list.add("element");          // добавление
 list.get(0);                  // получение по индексу
 list.set(0, "new");           // замена
 list.remove(0);               // удаление по индексу
 list.remove("element");       // удаление по значению
 list.size();                  // размер
 list.contains("element");     // проверка наличия
 list.indexOf("element");      // поиск индекса


 // Создание
 LinkedList<String> linkedList = new LinkedList<>();

 // Все методы ArrayList + дополнительные
 linkedList.addFirst("first");     // добавить в начало
 linkedList.addLast("last");       // добавить в конец
 linkedList.getFirst();            // получить первый
 linkedList.getLast();             // получить последний
 linkedList.removeFirst();         // удалить первый
 linkedList.removeLast();          // удалить последний

 Обычно ArrayList быстрее при массовом добавлении,
 а LinkedList медленнее, потому что каждый новый элемент создаёт отдельный объект-узел со ссылками.
 */