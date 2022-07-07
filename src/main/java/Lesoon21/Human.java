package Lesoon21;

public class Human implements Action{
    private int distanceOfRunning;
    private int highOfJumping;
    public Human(int distanceOfRunning, int highOfJumping){
        this.distanceOfRunning = distanceOfRunning;
        this.highOfJumping = highOfJumping;
    }
    public int jumping() {
        return highOfJumping;
    }

    public int running ()
    {
        return distanceOfRunning;
    }

}
