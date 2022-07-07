package Lesson6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Animal dog[] = new Dog[3];
        dog[0]= new Dog("Маламут");
        dog[1]= new Dog("Мики");
        dog[2]= new Dog("Оскар");

        Animal cat[] = new Cat[4];
        cat[0] = new Cat("Гарфилд");
        cat[1] = new Cat("Пушок");
        cat[2] = new Cat("Бегемот");
        cat[3] = new Cat("Гудини");

        dog[1].printInfo();

        dog[0].run(getRandomNumber(0,1000));
        dog[2].swim(getRandomNumber(0,1000));
        dog[1].takeAnimalCount();
        //dog.takeDogCount();



    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
