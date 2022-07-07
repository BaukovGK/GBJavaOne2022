package Lesson6;

public class Animal{

    private String nickname;
    private int runLimit;
    private int swimLimit;
    public String animalKind;

    public int animalCount = 0;

    public Animal(String nickname,String animalKind,int runLimit,int swimLimit){
        this.nickname=nickname;
        this.animalKind=animalKind;
        this.runLimit=runLimit;
        this.swimLimit=swimLimit;
        animalCount++;
    }

    public Animal() {

    }

    public void printInfo (){
        System.out.println(this.getAnimalKind() + " по кличке " + this.getNickname());
    }

    public void swim (int L){
        if (L < this.getSwimLimit()) {
            System.out.println(this.getAnimalKind() + "по кличке " + this.getNickname() + " проплыл " + L + " метров");
        }
        else {
            System.out.println(this.getAnimalKind() + "по кличке " + this.getNickname() + " не проплыл " + L + " метров");
        }

    }
    public void run (int L){
        if (L < this.getRunLimit()) {
            System.out.println(this.getAnimalKind() + "по кличке " + this.getNickname() + " пробежал " + L + " метров");
        }
        else {
            System.out.println(this.getAnimalKind() + "по кличке " + this.getNickname() + " не смог пробежать " + L + " метров");
        }

    }

    public void takeAnimalCount (){
        System.out.println("Общее число животных - " + this.animalCount);
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public String toString() {
        return "Animal{" + "nickname='" + nickname + '\'' +  ", animalKind='" + animalKind + '\'' + '}';
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public void setRunLimit(int runLimit) {
        this.runLimit = runLimit;
    }

    public int getSwimLimit() {
        return swimLimit;
    }

    public void setSwimLimit(int swimLimit) {
        this.swimLimit = swimLimit;
    }

    public String getAnimalKind() {
        return animalKind;
    }

    public void setAnimalKind(String animalKind) {
        this.animalKind = animalKind;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }
}
