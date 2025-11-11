import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTrain {
    public static void main(String[] args) {
        issue2();
    }

    public static void issue1() {
        System.out.println("Введите имя контакта");

        Map<String, String> map = new HashMap<>();
        map.put("Dima", "89778888888");
        map.put("Donald", "+1123456789");
        map.put("Mark", "54656456456");
        map.put("Arra", "2222222222");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (map.containsKey(s)) {
            System.out.println(map.get(s));
        }
        else {
            System.out.println("Такого контакта нет");
        }
    }

    public static void issue2() {
        String text = "banana";
       char[] a = text.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : a) {
             if (map.containsKey(c)) {
                 map.put(c, map.get(c) + 1);
             } else {
                 map.put(c, 1);
             }

        }

        System.out.println(map);
    }

    public static void issue3() {
        Map<String, Integer> map1 = Map.of("apple", 3, "banana", 2);
        Map<String, Integer> map2 = Map.of("banana", 1, "pear", 4);

        Map<String, Integer> map3 = new HashMap<>(map1);
        map3.putAll(map2);

    }
}

/**
 Добавление/изменение
 put(K key, V value) - добавить пару ключ-значение

 putIfAbsent(K key, V value) - добавить если ключ отсутствует

 putAll(Map<? extends K, ? extends V> m) - добавить все из другой map

 Получение
 get(Object key) - получить значение по ключу

 getOrDefault(Object key, V defaultValue) - получить значение или значение по умолчанию

 Проверки
 containsKey(Object key) - проверить наличие ключа

 containsValue(Object value) - проверить наличие значения

 isEmpty() - проверить пустоту

 size() - получить количество элементов

 Удаление
 remove(Object key) - удалить по ключу

 remove(Object key, Object value) - удалить если ключ-значение совпадают

 clear() - очистить всю map

 Итерация
 keySet() - получить множество ключей

 values() - получить коллекцию значений

 entrySet() - получить множество пар ключ-значение


 */
