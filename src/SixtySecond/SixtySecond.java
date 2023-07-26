package SixtySecond;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class SixtySecond {
    public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };

    public static String[][] drivers = {
            { "Fred", "Sue", "Pete" },
            { "Sue", "Richard", "Bob", "Fred" },
            { "Pete", "Mary", "Bob" },
    };

    public static void main(String[] args) {

        Map<String, Set<String>> personel = new HashMap<String, Set<String>>();
        for (int i = 0; i < vehicles.length; i++) {
            String vehicle = vehicles[i];
            String[] driversList = drivers[i];

            Set<String> driverSet = new LinkedHashSet<String>();

            for (String driver : driversList) {
                driverSet.add(driver);
            }

            personel.put(vehicle, driverSet);
        }

        { // Brackets just to scope driversList variable so can use again later
          // Example usage
            Set<String> driversList = personel.get("helicopter");

            for (String driver : driversList) {
                System.out.println(driver);
            }
        }

        // Iterate through the whole thing
        for (String vehicle : personel.keySet()) {
            System.out.print(vehicle);
            System.out.print(": ");
            Set<String> driversList = personel.get(vehicle);

            for (String driver : driversList) {
                System.out.print(driver);
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
