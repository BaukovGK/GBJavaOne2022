package Lesoon21;

public class Trampoline implements Action{
    private int distance;
    public Trampoline (int distance){
        this.distance = distance;
    }

    public int running ()
    {
        return distance;
    }
    public int jumping() {
        return 0;
    }
}
