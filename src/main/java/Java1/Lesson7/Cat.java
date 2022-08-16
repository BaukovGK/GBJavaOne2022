package Java1.Lesson7;

import java.util.concurrent.ThreadLocalRandom;

public class Cat extends Animal {

    private int catCount = 0;

    public int foodCappacity = 5;
    public int feedLimit = 10;
    public boolean happynessStatus;

    public Cat(String nickname) {
        super(nickname, "Кошка", 200, 0);
        catCount++;
        animalCount++;
    }

    public int getCatCount() {
        return catCount;
    }

    @Override
    public void swim(int L) {
        System.out.println("Кошки плохо плавают");
    }

    public void takeCatCount() {
        System.out.println("Общее число котов - " + this.catCount);
    }

    public void eat(Plate plate) {
        int catEatFoodCount = ThreadLocalRandom.current().nextInt(4) + 3;
        if (plate.getFoodCount() - catEatFoodCount >= 0) {
            plate.decreaseFood(catEatFoodCount);
            foodCappacity += catEatFoodCount;
            System.out.println("Кот по кличке " + super.getNickname() + " поел");
            happynessStatus =true;
        } else {
            System.out.println("Кот не может поесть, в миске слишком мало еды");
            happynessStatus = false;
        }
    }

    @Override
    public void printInfo() {
        System.out.println(super.getAnimalKind() + " по кличке " + super.getNickname() + " статус сытости - " + this.foodCappacity);
    }
}
