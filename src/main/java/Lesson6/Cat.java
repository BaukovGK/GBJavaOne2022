package Lesson6;

public class Cat extends Animal {

    private int catCount =0;

    public Cat(String nickname){
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

    public void takeCatCount (){
        System.out.println("Общее число котов - " + this.catCount);
    }

}
