package _11_Classes_and_Objects.src;

class Person {

    // Instance variables (data or "state")
    String name;
    int age;

    // Classes can contain

    // 1. Data
    // 2. Methods
}

public class Sample {

    public static void main(String[] args) {

        // Create a Person object using the Person class
        Person person1 = new Person();
        person1.name = "Jon Snow";
        person1.age = 37;

        // Create a second Person object
        Person person2 = new Person();
        person2.name = "Tyrion Lannister";
        person2.age = 20;

        System.out.println(person2.name);
        System.out.println(person2.age);

        System.out.println(person1.name);
        System.out.println(person1.age);
    }

    // TODO Add a method which prints age of the person // done

}