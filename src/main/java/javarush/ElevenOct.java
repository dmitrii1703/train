package javarush;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ElevenOct {
    public static void main(String[] args) {
        MagicalContainer myTreasureChest = new MagicalContainer();
        myTreasureChest.magicValue = 15;
        attemptToEnchantContainer(myTreasureChest);
        System.out.println(myTreasureChest.magicValue);
    }

    public static void attemptToEnchantContainer(MagicalContainer magicalContainer) {
        magicalContainer.magicValue = 99;
        magicalContainer = new  MagicalContainer();
        magicalContainer.magicValue = 42;
    }
    static class MagicalContainer {
        public int magicValue;
    }
}

/*
Вообразите, что вы хранитель волшебных шкатулок, каждая из которых содержит в себе некое магическое число,
представляющее её силу. Ваша задача — обновить силу одной из шкатулок, но при этом понять, как работают магические заклинания.

Создайте класс MagicalContainer с одним публичным полем magicValue типа int.

В вашем главном хранилище, в методе main, создайте одну такую волшебную шкатулку: myTreasureChest = new MagicalContainer(),
 и присвойте её начальную силу: myTreasureChest.magicValue = 15.

Теперь создайте специальный метод attemptToEnchantContainer, который будет принимать одну MagicalContainer в качестве параметра.
Внутри этого метода вы сначала пытаетесь увеличить силу шкатулки, устанавливая её magicValue на 99. Затем, в порыве волшебства,
вы пытаетесь "заменить" саму шкатулку, присваивая параметру метода новый объект MagicalContainer с magicValue равным 42.

После вызова attemptToEnchantContainer с вашей myTreasureChest, немедленно проверьте, какова теперь сила
myTreasureChest.magicValue и выведите её на экран. Вы с удивлением обнаружите, что сила шкатулки стала 99,
 а не 42, что наглядно покажет вам, как работают ссылки на объекты в мире магии Java: метод может изменить содержимое объекта,
  на который ссылается, но не может изменить саму ссылку, переданную ему извне.
 */




    /*

    public static void main(String[] args) {
        int[]  playerSquad = {7, 9};
        swapPlayerNumbers(playerSquad);
        System.out.println(playerSquad[0] + " " + playerSquad[1]);
    }

    public static void swapPlayerNumbers(int[] teamLineup) {
        int temp = teamLineup[0];
        teamLineup[0] = teamLineup[1];
        teamLineup[1] = temp;
    }


Представьте, что вы менеджер футбольной команды, и вам нужно быстро поменять местами двух игроков на поле, представленных их номерами в массиве.
Вам нужен мгновенный способ для такой перестановки, чтобы оперативно реагировать на ход игры.

Сконструируйте метод swapPlayerNumbers, который будет принимать teamLineup — массив целых чисел, содержащий номера игроков.

Этот метод должен быть способен поменять местами значения первого и второго элементов в этом массиве.

В вашем тренировочном лагере, в методе main, задайте начальное расположение двух игроков: playerSquad = {7, 9}.
 Вызовите swapPlayerNumbers, передав ему playerSquad. Затем, чтобы убедиться, что игроки действительно поменялись местами,
 выведите на экран оба номера из playerSquad через пробел. Вы должны увидеть 9 и 7, что подтвердит успешную перестановку.
     */


    /*

    public static void main(String[] args) {
        int[] initialPath = {3, 4, 5};
        resetRobotStart(initialPath);
        System.out.println(initialPath[0]);
    }

    public static void resetRobotStart(int trajectoryPath[]) {
        trajectoryPath[0] = 0;
    }


Представьте, что вы разрабатываете систему управления для робота, который перемещается по заранее заданной траектории,
представленной числовым массивом. Иногда вам требуется сбросить его начальную точку до нулевой отметки, не меняя при этом всю последующую часть траектории.
Создайте метод resetRobotStart, который будет принимать trajectoryPath — массив целых чисел.
Задача этого метода — аккуратно изменить значение первого элемента в этом массиве, установив его равным 0.
В вашем главном пульте управления, в методе main, сначала определите тестовую траекторию для робота:
initialPath = {3, 4, 5}. Затем вызовите resetRobotStart, передав ему initialPath. После этого немедленно проверьте,
какое значение теперь находится в самом начале initialPath, и выведите его на экран. Вы должны увидеть 0, что означает, что робот успешно вернулся на стартовую позицию.


     */

class Ad {
    public void dragon() {
        Scanner scanner = new Scanner(System.in);
        int dragonHP = 50;
        int shots = 10;

        System.out.println("Вы напали на спящего дракона - дракон расстроился");

        while (dragonHP > 0 && shots > 0) {
            System.out.println(" Выберите силу удара от 1 до 10");
            int strong = scanner.nextInt();
            dragonHP -= strong;
            shots -= 1;
            System.out.println("У дракона осталось " + dragonHP + "ХП, " + "А у тебя " + shots + " Выстрлов");
        }

        if (dragonHP <= 0 && shots > 0) {
            System.out.println("Дракон повержен!");
        } else {
            System.out.println("Рыцарь проиграл!");
        }
    }


        /*
        В подземелье прячется дракон с 50 жизнями. У храброго рыцаря есть лишь 10 ударов, чтобы его победить.

Правила боя:

Каждый ход программа спрашивает у рыцаря, какой урон (число от 1 до 10) нанести.
Из здоровья дракона вычитается это число.
Если жизни дракона стали 0 или меньше — программа выводит: Дракон повержен!
Если удары закончились, а дракон всё ещё жив — программа сообщает: Рыцарь проиграл!
         */

        public void randomNumber() {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int randomInt = random.nextInt(100) +1;


            for (int i = 0; i < 101; i++) {
                int number = scanner.nextInt();
                if (number > randomInt) {
                    System.out.println("Меньше!");
                }
                if (number < randomInt) {
                    System.out.println("Больше!");
                }
                if (number == randomInt) {
                    System.out.println("Верно!");
                    break;
                }
            }
        }

        /*
        Вы — молодой маг, которому поручено найти скрытый кристалл мудрости.
Хитрый дух загадал число от 1 до 100, и оно спрятано в его башне. Чтобы приблизиться к разгадке, вы называете числа, а дух подсказывает:

Если ваше число меньше загаданного, он говорит: Больше!
Если число больше — отвечает: Меньше!
Если угадали точно — дух признаёт поражение и говорит: Верно!, после чего испытание завершается.
Ваша задача — написать программу, которая реализует эту игру, где игрок вводит числа в цикле, пока не угадает.
         */


        public void revers() {
            Scanner scanner = new Scanner(System.in);
            String magicMessage = scanner.nextLine();

            String revers = "";

            for (int i = magicMessage.length() - 1; i >= 0; i--) {

                /*
                magicMessage.length() возврещает длину строки, т.к. идем от конца, условие прерывания, пока не дойдем до начала
                Пример : "hello"
                Итерация 1: i = 4, magicMessage.charAt(i) = "o"
                 */
                revers += magicMessage.charAt(i);
            }
            System.out.println(revers);
        }
/*
В старинном свитке вы обнаружили загадочное послание от забытого волшебника.
Его слова имеют необычную природу: чтобы раскрыть их истинный смысл, их нужно прочитать в обратном порядке.
Это как смотреть в волшебное зеркало, которое переворачивает все буквы.

Ваша задача — написать программу, которая поможет вам увидеть его "обратную сторону".
Попросите пользователя ввести любую строку текста (назовите её magicMessage). Затем ваша программа должна мгновенно отразить это послание,
выведя все символы в строго обратном порядке. Так, если введено слово "cat", должно появиться "tac".
 */



    /*
    Вы — хранитель древнего шифра, который позволяет разблокировать вход в тайную библиотеку. Но ключ к библиотеке — не просто число,
    это должно быть «истинное» число, нерушимое и неделимое, кроме как на себя и единицу. (Простое)

Ваша миссия: получить от пользователя загадочное целое число (назовите его, например, secretKeyCandidate).
Затем вы должны определить, является ли это число истинным ключом, то есть простым числом, которое делится без остатка только на 1 и на себя.
 Если число окажется простым, вы должны подтвердить его подлинность, выведя на экран "YES". В противном случае, если оно делится на что-то ещё,
 это просто отвлекающий маневр, и вам следует вывести "NO".

Например, если пользователь введет 7, ваша программа должна будет сказать: YES.
     */



    public static void secretCode() {
        Scanner scanner = new Scanner(System.in);
        int secretKeyCandidate = scanner.nextInt();

        if (secretKeyCandidate <= 1) {
            System.out.println("NO");
            return;
        }
        boolean isSimple = false;

        for (int i = 2; i < secretKeyCandidate; i++) {
            if (secretKeyCandidate % i == 0) {
                isSimple = true;
                System.out.println("NO");
                break;
            }
        }
        if (!isSimple) {
            System.out.println("YES");
        }
    }

    public static void ladder() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}


/*
Представьте, что вы архитектор цифровых строений, и ваша задача — возвести крепкую, красивую лестницу для входа в ваш виртуальный замок.
 Каждая ступенька этой лестницы будет символом #, и чем выше ступенька, тем больше символов она должна содержать.

Вам нужно попросить пользователя указать высоту этой лестницы, то есть количество ступенек, которые она должна иметь (например, ladderHeight).
Затем ваша программа должна тщательно "построить" эту лестницу: на первой строке появится одна решетка, на второй — две, на третьей — три, и так далее,
 пока не будет достигнута заданная высота N.

Пример, как будет выглядеть ваша цифровая лестница, если пользователь введет число 4:

#
##
###
####
 */