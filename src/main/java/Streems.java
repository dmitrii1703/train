import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Streems {
    public static void main(String[] args) {
        issue6();
    }

    public static void issue1() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

    public static void issue2() {
        List<String> names = List.of("ivan", "anna", "peter", "olga");

        List<String> capitalizedNames = names.stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .toList();
        System.out.println(capitalizedNames);

        //name.substring(0, 1) берет первую букву строки ("ivan".substring(0, 1) → "i")
        //+ name.substring(1)  берет всю строку кроме первой буквы
    }

    public static void issue3() {
        List<Integer> nums = List.of(10, 20, 30, 40, 50, 60);

       long c = nums.stream().filter(n -> n > 30).count();
        System.out.println(c);

        // Почему нельзя создать переменную типа int
    }

    public static void issue4() {
        List<String> cities = List.of("Paris", "London", "Berlin", "Paris", "Rome", "Berlin");

        Set<String> set = cities.stream()
                .collect(Collectors.toSet());
        System.out.println(set);
    }

    public static void issue5() {
        List<String> words = List.of("apple", "banana", "kiwi", "mango");

        double a =  words.stream()
                .mapToInt(String::length)
                .average()
                        .orElse(0.0);
        System.out.println(a);
    }

    public static void issue6() {
            List<People> p1 = new ArrayList<>();
            p1.add(new People("Ivan Ivanovich", "M", 69));
            p1.add(new People("Vasya", "M", 16));
            p1.add(new People("Elena", "G", 42));
            p1.add(new People("Elena", "G", 80));
            p1.add(new People("Petya", "M", 23));
            p1.add(new People("Roma", "M", 26));

        System.out.println(p1.stream()
                .filter(n -> n.getSex().equals("M") && n.getAge() > 17 && n.getAge() < 27)
                .limit(2)
                .toList());

        System.out.println("Man" + p1.stream()
                .filter(a -> a.getSex().equals("M") && a.getAge() > 17 && a.getAge() < 60)
                .toList());

        System.out.println("Girls" + p1.stream()
                .filter(a -> a.getSex().equals("G") && a.getAge() > 17 && a.getAge() < 55)
                .toList());

        double average = p1.stream()
                .filter(a -> a.getSex().equals("M"))
                .mapToInt(People::getAge).average().getAsDouble();

        System.out.println(average);
    }
}
/**
 // =============================
 //      Stream API — шпаргалка
 // =============================

 // Создание стрима
 list.stream();                  // из списка
 Stream.of(1, 2, 3);             // из набора значений
 IntStream.range(1, 5);          // числа от 1 до 4

 // Основные промежуточные операции (не завершают поток)
 .filter(x -> x > 0)             // фильтрация элементов
 .map(x -> x * 2)                // преобразование (пример: умножить)
 .map(String::toUpperCase)       // преобразование (пример: в верхний регистр)
 .distinct()                     // уникальные элементы
 .sorted()                       // сортировка
 .limit(5)                       // ограничение количества
 .skip(2)                        // пропустить первые 2

 // Терминальные операции (завершают поток)
 .toList();                      // собрать в список (Java 16+)
 .collect(Collectors.toList());  // собрать в список (старый способ)
 .collect(Collectors.toSet());   // собрать в множество
 .forEach(System.out::println);  // пройтись по каждому элементу
 .count();                       // количество элементов
 .findFirst().orElse(null);      // первый элемент
 .anyMatch(x -> x > 10);         // есть ли хоть один подходящий
 .allMatch(x -> x > 0);          // все ли подходят
 .noneMatch(x -> x < 0);         // нет ли неподходящих

 // Работа с числами
 .mapToInt(Integer::intValue).sum();       // сумма
 .mapToInt(Integer::intValue).average();   // среднее
 .max();                                   // максимум
 .min();                                   // минимум

 // Примеры
 list.stream()
 .filter(x -> x.startsWith("A"))
 .map(String::toUpperCase)
 .sorted()
 .forEach(System.out::println);

 int sum = numbers.stream()
 .filter(n -> n % 2 == 0)
 .mapToInt(Integer::intValue)
 .sum();

 // Советы:
 // - Поток можно использовать только один раз
 // - Не изменяй коллекцию внутри стрима
 // - Используй стримы, когда нужно читать "что сделать", а не "как сделать"
 */
