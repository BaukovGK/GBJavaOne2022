package Lesson3;

public class HomeWorkApp3 {

    public static void main(String[] args) {
        //Задание 1

        int[] dz1 = MakeRandomArray(0, 1, 10);                                // Инициализируем целочисленный массив
        PrintArray(dz1);                                                      // вывод массива
        PrintArray(InvertArray(dz1));                                               // инвертирование значение массива


        //Задание 2

        int[] dz2 = MakeRangeArray(100);
        PrintArray(dz2);

        //Задание 3

        int[] dz3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        PrintArray(dz3);

        RiseUpTo(dz3);

        // Задание 4

        int[][] dz4 = ZeroesArray(5);
        PrintArray(dz4);

        PrintArray(OnesArray(dz4));

        dz4 = ZeroesArray(5);
        PrintArray(OnesInvArray(dz4));

        // Задание 5

        int[] dz5 = FillArrayWith(5, 10);
        PrintArray(dz5);

        //Задание 6

        int[] dz6 = MakeRandomArray(-100, 100, 10);
        PrintArray(dz6);
        System.out.println(MinValue(dz6));
        System.out.println(MaxValue(dz6));

        //Задание 7

        int[] dz7 = {3, 1, 1, 1};
        //int[] dz7 = MakeRandomArray(-100, 100, 4);
        PrintArray(dz7);
        CheckSumArray(dz7);


        /*  Задание 8   */

        int[] dz8 = MakeRandomArray(0, 10, 10);
        PrintArray(dz8);

        ShiftArray(dz8, 11);
        PrintArray(dz8);


    }

    public static void CheckSumArray(int[] arr) {
        int sumA = 0;
        int sumB = 0;

        boolean trig = false;

        for (int i = 0; i < (arr.length); i++) {

            sumA = sumA + arr[i];

            //System.out.println("Сумма А= " + sumA);

            for (int j = arr.length - 1; j > 0; j--) {

                sumB = sumB + arr[j];

                //System.out.println("Сумма B= " + sumB);

                if (sumA == sumB) {
                    System.out.println("A=" + sumA + " B=" + sumB);
                    trig = true;
                }

            }

            sumB = 0;

        }

        System.out.println(trig);
    }

    public static int[] ShiftArray(int[] arr, int shiftStep) {

        if (shiftStep < 0) {
            shiftStep = Math.abs(shiftStep) % arr.length;
            System.out.println("второй этап " + shiftStep);
            if (shiftStep <= arr.length) {
                shiftStep = arr.length - shiftStep;
            } else {
                shiftStep = shiftStep % arr.length;
            }
        }
        if (Math.abs(shiftStep) >= arr.length) {
            shiftStep = shiftStep % arr.length;
        }


        for (int j = 0; j < shiftStep; j++) {
            int last = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }
        return arr;
    }

    public static int MinValue(int[] arr) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int MaxValue(int[] arr) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] FillArrayWith(int len, int initialValue) {

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }

        return arr;
    }

    public static int[] RiseUpTo(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }

        }
        return arr;
    }

    public static int[][] OnesInvArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[((arr.length - 1) - i)][i] = 1;
        }
        return arr;
    }

    public static int[][] OnesArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
        return arr;
    }


    public static int[][] ZeroesArray(int n) {

        int[][] arr = new int[n][n];
        return arr;
    }

    public static int[] MakeRangeArray(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static int[] InvertArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }

    private static void PrintArray(int[][] arr) {

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void PrintArray(int[] Arr) {

        System.out.println();

        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + "\t");
        }
        System.out.print("\n");

    }

    public static int[] MakeRandomArray(int minRange, int maxRange, int len) {

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = (int) ((Math.random() * ((maxRange + 1) - minRange)) + minRange);
        }
        return arr;
    }
}
