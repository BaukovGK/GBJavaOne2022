package Lesson1;

public class HomeWorkApp {

    public static void main(String[] args) {
        //вывод метода printThreeWords
        printThreeWords();
        System.out.println();

        //вывод метода checkSumSign
        checkSumSign(5, 6);
        checkSumSign(-9, 3);
        System.out.println();

        //вывод метода printColor
        printColor(-1);
        printColor(0);
        printColor(101);
        System.out.println();

        //вывод метода printColor
        compareNumbers(7, 9);
        compareNumbers(-40, 7);
    }

    private static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    private static void printColor(int a) {
        if (a < 0) {
            System.out.println("Красный");
        } else if ( a < (100 + 1)) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    private static void checkSumSign(int a, int b) {
//        System.out.println(a+b);

        if ((a + b) < 0) {
            System.out.println("Сумма отрицательная");
        } else {
            System.out.println("Сумма положительная");
        }

    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

}
