import java.util.Scanner;
import java.util.ArrayList;

abstract class Animals {
    public abstract boolean canSwim();
    public abstract boolean canWalk();
}

class Pig extends Animals {

    public boolean canSwim() {
        return false;
    }

    public boolean canWalk() {
        return true;
    }
}

class Duck extends Animals {

    public boolean canSwim() {
        return true;
    }

    public boolean canWalk() {
        return true;
    }
}

class Fish extends Animals {

    public boolean canSwim() {
        return true;
    }

    public boolean canWalk() {
        return false;
    }
}

public class FarmManagement {
    public static void main(String[] args) {

        Animals pig = new Pig();
        Animals duck = new Duck();
        Animals fish = new Fish();

        Animals[] a = { pig, duck, fish };

        for (Animals x : a) {
            if (x.canSwim()) {
                System.out.println(x.getClass().getSimpleName());
            }
        }

        for (Animals x : a) {
            if (x.canWalk()) {
                System.out.println(x.getClass().getSimpleName());
            }
        }
    }
}