package Java1.Lesson7;

import Java1.Lesson6.Animal;
import Java1.Lesson6.Cat;

public class Main {
    public static void main(String[] args) {

        Java1.Lesson7.Cat cat[] = new Java1.Lesson7.Cat[4];
        cat[0] = new Java1.Lesson7.Cat("Гарфилд");
        cat[1] = new Java1.Lesson7.Cat("Пушок");
        cat[2] = new Java1.Lesson7.Cat("Бегемот");
        cat[3] = new Java1.Lesson7.Cat("Гудини");

        Plate plate = new Plate(20);

        plate.ptintInfo();
        for (int i = 0; i<cat.length; i++) {
            cat[i].printInfo();
        }

        for (int i=0; i<cat.length;i++) {
            cat[i].eat(plate);
        }

        plate.ptintInfo();

        plate.ptintInfo();
        for (int i=0; i<cat.length;i++) {
            cat[i].printInfo();
        }

        plate.refillFood();
        plate.ptintInfo();



    }
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
