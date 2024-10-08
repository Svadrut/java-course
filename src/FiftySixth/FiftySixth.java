package FiftySixth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return id + ": " + name;
    }
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String a1, String a2) {

        int len1 = a1.length();
        int len2 = a2.length();

        if (len1 > len2) {
            return 1;
        } else if (len1 < len2) {
            return -1;
        }

        return 0;
    }
}

class ReverseAlphebeticalComparator implements Comparator<String> {
    @Override
    public int compare(String a1, String a2) {
        return -a1.compareTo(a2);
    }
}

public class FiftySixth {
    public static void main(String[] args) {

        /////////////////////// Sorting Strings //////////////////////////
        List<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("elephant");
        animals.add("tiger");
        animals.add("lion");
        animals.add("snake");
        animals.add("mongoose");

        // Collections.sort(animals, new StringLengthComparator());
        Collections.sort(animals, new ReverseAlphebeticalComparator());

        for (String animal : animals) {
            System.out.println(animal);
        }

        /////////////////////// Sorting Numbers //////////////////////////
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(3);
        numbers.add(1);
        numbers.add(36);
        numbers.add(73);
        numbers.add(40);

        Collections.sort(numbers, new Comparator<Integer>() {

            @Override
            public int compare(Integer num1, Integer num2) {
                return -num1.compareTo(num2);
            }
        });

        for (Integer number : numbers) {
            System.out.println(number);
        }

        /////////////////////// Sorting arbitrary objects //////////////////////////

        List<Person> people = new ArrayList<Person>();

        people.add(new Person(1, "Joe"));
        people.add(new Person(3, "Bob"));
        people.add(new Person(4, "Clare"));
        people.add(new Person(2, "Sue"));

        // Sort in order of ID
        Collections.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {

                if (p1.getId() > p2.getId()) {
                    return 1;
                } else if (p1.getId() < p2.getId()) {
                    return -1;
                }

                return 0;
            }

        });

        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("\n");
        // Sort in order of name
        Collections.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }

        });

        for (Person person : people) {
            System.out.println(person);
        }

    }
}