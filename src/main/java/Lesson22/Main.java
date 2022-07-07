package Lesson22;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String [][] array = new String [4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = "1";
            }
        }
       checkArray(array);
    }
    public static void checkArray (String[][] arr){
        int sum = 0;
        int k=0;
        try{
            if(arr.length!=4 | arr[0].length!=4) {
               throw new MyArraySizeException();
            }
            } catch (MyArraySizeException e){
                    e.printStackTrace();
            }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                    try {
                        sum+=Integer.parseInt(arr[i][j]);
                        k++;
                    }catch (NumberFormatException e){
                        System.out.println("Неверный формат в ячейке");
                        System.out.println(i+" "+j);
                    }catch (MyArrayDataException ex){
                        ex.printStackTrace();
                    }
            }
        }
        if(k==arr.length*arr[0].length){
            System.out.println(sum);
        }

    }
}
