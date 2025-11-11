import java.util.*;

public class SetTrain {
    public static void main(String[] args) {
        issue7();
    }

    public static void issue1() {
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(2);
        System.out.println(set);
    }

    public static void issue2() {
        System.out.print("Введите несколько слов через пробел, а я проверю их уникальность: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String[] words = s.split(" ");
        Set<String> set = new HashSet<>(Arrays.asList(words));

        if (set.size() == words.length) {
            System.out.println("✅ Все слова уникальны");
        } else {
            System.out.println("⚠️ Есть повторяющиеся слова");
        }
    }


    public static void issue3() {
            // Создаём два множества
            Set<String> a = new HashSet<>(Set.of("a", "s", "c"));
            Set<String> b = new HashSet<>(Set.of("a", "b", "c"));

            // Создаём копию множества 'a', чтобы не изменить оригинал
            Set<String> intersection = new HashSet<>(a);

            // Оставляем в intersection только элементы, которые есть и в b
            intersection.retainAll(b);

            // Выводим для сравнения
            System.out.println("Множество A: " + a);
            System.out.println("Множество B: " + b);
            System.out.println("Пересечение A и B: " + intersection);



        /**
         Найди элементы, которые встречаются в обоих. а retainAll возвращает bool и изменяет множество а
         */
    }

    public static void issue4() {
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(5);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(2);
        System.out.println(set);

    }

    public static void issue5() {
        Set<Integer> a = new HashSet<>(Set.of(1, 2, 3, 4));
        Set<Integer> b = new HashSet<>(Set.of(3, 4, 5, 6));
        Set<Integer> c = new HashSet<>(a);
        c.addAll(b);
        System.out.println(c);

    }

    public static void issue6() {
        String s = "Java is great and Java is powerful";

        List<String> list = new ArrayList<>(List.of(s.split(" ")));
        Set<String> set = new HashSet<>(list);
        System.out.println(set);
    }

    public static void issue7() {
        Set<String> all = Set.of("Иван", "Анна", "Олег", "Сергей");
        Set<String> submitted = Set.of("Анна", "Олег");
        Set<String> s = new HashSet<>(all);
        s.removeAll(submitted);
        System.out.println(s);
    }
}
/**
 💡 Что такое Set

 Set — это коллекция уникальных элементов.
 То есть, если ты добавишь одинаковые значения, они не будут дублироваться.

 🧱 Основные реализации Set
 Класс	Особенности
 HashSet	Хранит элементы в произвольном порядке. Быстрая вставка и поиск O(1)
 LinkedHashSet	Сохраняет порядок добавления элементов
 TreeSet	Сохраняет элементы в отсортированном порядке (требует Comparable или Comparator)

 ⚙️ Основные методы
 Метод	Что делает
 add(E e)	Добавляет элемент
 remove(E e)	Удаляет элемент
 contains(E e)	Проверяет наличие
 size()	Количество элементов
 isEmpty()	Проверяет, пуст ли
 clear()	Удаляет все элементы
 */