package Lesoon21;

public class MainApp {
    public static void main(String[] args) {
        Action[] members = new Action[]{
                new Cat(50, 100),
                new Robot(150, 150),
                new Human (100,100)
        };
        Action[] barriers = new Action[]{
                new Trampoline(40),
                new Wall(120),
                new Trampoline (110)
        };
        for (Action member : members) {
            for (Action barrier : barriers) {
                if (barrier.jumping() == 0) {
                    if (member.running() >= barrier.running()) {
                        System.out.println(member.getClass() + " continue");
                    } else {
                        break;
                    }
                } else {
                    if (member.jumping() >= barrier.jumping()) {
                        System.out.println(member.getClass() + " continue");
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
