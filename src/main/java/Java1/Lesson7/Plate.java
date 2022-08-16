package Java1.Lesson7;

public class Plate {

    public int foodCount;
    public int plateLimit=30;


    public Plate(int foodCount) {
        this.foodCount=foodCount;
    }

    public void ptintInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Plate { foodCount = " + foodCount + '}';
    }

    public void decreaseFood(int catEatFoodCount) {
        foodCount -= catEatFoodCount;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void refillFood() {
        foodCount=plateLimit;
    }
}
