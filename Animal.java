// File name: Animal.java

public class Animal {
    String name;
    int age;

    // Constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display animal details
    void displayInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Age: " + age);
    }

    public static void main(String[] args) {
        // Create an object of Animal
        Animal animal1 = new Animal("Dog", 5);

        // Call method
        animal1.displayInfo();
    }
}
