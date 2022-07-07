package Lesson6;

public class Dog extends Animal{


    private int dogCount =0;

    public Dog(String nickname){
        super(nickname, "Собака", 500, 10);
        dogCount++;
        animalCount++;
    }



    public int getDogCount() {
        return dogCount;
    }

    public void takeDogCount (){
        System.out.println("Общее число собак - " + this.dogCount);
    }



}
