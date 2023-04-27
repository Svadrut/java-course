package TwentySecond;

public class Car extends Machine {

    @Override
    public void start() {
        System.out.println("Car started.");
    }

    public void wipeWindSheild() {
        System.out.println("Wiping wind sheild.");
    }

    public void showInfo() {
        System.out.println("Car name: " + name);
    }
}
