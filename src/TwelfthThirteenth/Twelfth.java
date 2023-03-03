package TwelfthThirteenth;

class Person {
    // Intsance variables (data or "state")
    String name;
    int age;

    // Classes can contain

    // 1. Data
    // 2. Subroutines (methods)
    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is: " + name + " and I am " + age + " years old ");
        }
    }

    void sayHello() {
        System.out.println("Hello there!");
    }
}

public class Twelfth {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Sam Smith";
        person1.age = 30;
        person1.speak();
        person1.sayHello();

        Person person2 = new Person();
        person2.name = "Harry Styles";
        person2.age = 29;
        person2.speak();
        person2.sayHello();

        System.out.println(person1.name);

    }
}
