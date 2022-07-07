package Lesoon21;

public class Cat implements Action{
    private int distanceOfRunning;
    private int highOfJumping;
    public Cat(int distanceOfRunning, int highOfJumping){
        this.distanceOfRunning = distanceOfRunning;
        this.highOfJumping = highOfJumping;
    }
        public int jumping() {
        return highOfJumping;
    }
    public int running() {
        return distanceOfRunning;
    }

}

