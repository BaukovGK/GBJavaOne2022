package Lesoon21;

public class Wall implements Action{
    private int high;
    public Wall (int high){
        this.high = high;
    }

    public int getHigh() {
        return high;
    }

    public int jumping ()
    {
        return high;
    }
    public int running (){
        return 0;
    }
}


