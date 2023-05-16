package TwentySixth;

import TwentySixth.world.Plant;

/*
 * private --- only within the same class
 * public --- from anywhere
 * protected --- same class, subclass, and same package
 * no modifier --- same package only
 */

public class TwentySixth {
    public static void main(String[] args) {
        Plant plant = new Plant();

        System.out.println(plant.name);

        System.out.println(plant.ID);

        // Won't work --- type is private
        // System.out.println(plant.type);

        // size is protected; TwentySixth is in the same package as Plant.
        // Won't work.
        // System.out.println(plant.size);

        // Won't work; TwentySixth and Plant in different packages, and Height has package-level visibility.
        // System.out.println(plant.height);
    }
}
