package Lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {

        //Задание 1. Проверка суммы чисел
        ChekSumm(5, 11);

        System.out.println();

        //Задание 2. Проверка знака чисел
        ChekSign(-10);
        ChekSign(10);

        System.out.println();

        //Задание 3. Проверка знака чисел с выводом логического значения
        ChekSignBool(-100);
        ChekSignBool(0);
        ChekSignBool(100);

        System.out.println();

        //Задание 4. Метод выводит строку N колличество раз
        PrintStringNTimes("текст", 1);

        System.out.println();

        //Задание 5. Проверка является ли год високосным. выводит логическое значение.
        System.out.println(-100);
        LeapYearChek(-100);
        System.out.println();

        System.out.println(100);
        LeapYearChek(100);
        System.out.println();

        System.out.println(400);
        LeapYearChek(400);
        System.out.println();


    }

    private static void LeapYearChek(int a) {
        if (a > 0) {
//            System.out.print("Год " + a);
            if ((a % 400) == 0) {
//                System.out.println(" високосный");
                System.out.print(true);
            } else if ((a % 100) == 0) {
//                System.out.println(" невисокосный");
                System.out.print(false);
            } else if ((a % 4) == 0) {
//                System.out.println(" високосный");
                System.out.print(true);
            }
        } else {
            System.out.println("неверное значение. Год не может быть отрицательным");
        }
    }

    private static void PrintStringNTimes(String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
        System.out.println();
    }

    private static void ChekSignBool(int a) {
        if (a < 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
//      System.out.println((a < 0));          // аналог в в одну строчку
    }

    private static void ChekSign(int a) {
        System.out.print("Число " + a);
        if (a < 0) {
            System.out.println(" отрицательное");
        } else {
            System.out.println(" положительное");
        }

    }

    private static void ChekSumm(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
//      System.out.println( ((a + b) >= 10 && (a + b) <= 20) );       // аналог в в одну строчку
    }
}
